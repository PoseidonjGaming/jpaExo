package fr.tuto.jpa.repo;

import fr.tuto.jpa.dto.PersonDTO;
import fr.tuto.jpa.model.Person;
import fr.tuto.jpa.repo.interfaces.IPersonRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Repository
@Transactional
public class PersonRepo implements IPersonRepo {

    @PersistenceContext
    private EntityManager manager;

    protected final EntityManagerFactory factory;

    private final CriteriaBuilder builder;

    public PersonRepo(EntityManagerFactory factory) {
        this.factory = factory;
        builder = factory.getCriteriaBuilder();
    }

    @Override
    public List<Person> getAll() {
        CriteriaQuery<Person> query = builder.createQuery(Person.class);
        Root<Person> root = query.from(Person.class);
        query.select(root);
        TypedQuery<Person> typedQuery = manager.createQuery(query);
        return typedQuery.getResultList();
    }

    @Override
    public List<Person> getPagedAll(int page, int size) {
        CriteriaQuery<Person> query = builder.createQuery(Person.class);
        Root<Person> root = query.from(Person.class);
        query.select(root);
        TypedQuery<Person> typedQuery = manager.createQuery(query);
        return typedQuery.setFirstResult(page * size).setMaxResults(size).getResultList();
    }

    @Override
    public Person getById(Integer uuid, boolean isLast) {
        CriteriaQuery<Person> query = builder.createQuery(Person.class);
        Root<Person> root = query.from(Person.class);
        query.select(root).where(builder.equal(root.get("id"), uuid));
        TypedQuery<Person> typedQuery = manager.createQuery(query);
        return typedQuery.getSingleResult();
    }

    @Override
    public void saveOrUpdate(Person person, Integer id,boolean isLast) {

        if(id==null){
            manager.persist(person);
        }
        else {
            manager.merge(person);
        }


    }

    @Override
    public void delete(Integer uuid, boolean isLast) {
        CriteriaDelete<Person> criteriaDelete = builder.createCriteriaDelete(Person.class);

        Root<Person> root = criteriaDelete.from(Person.class);
        criteriaDelete.where(builder.equal(root.get("id"), uuid));

        manager.createQuery(criteriaDelete).executeUpdate();
    }
}
