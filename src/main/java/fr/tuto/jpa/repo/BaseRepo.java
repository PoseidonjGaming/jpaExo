package fr.tuto.jpa.repo;

import fr.tuto.jpa.repo.interfaces.IBaseRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class BaseRepo<Entity, ID> implements IBaseRepo<Entity, ID> {


    protected final Class<Entity> entityClass;

    @PersistenceContext
    protected EntityManager manager;


    protected String table;

    public BaseRepo(Class<Entity> entityClass) {
        this.entityClass = entityClass;
        table = entityClass.getName();
    }


    @Override
    public List<Entity> getAll() {
        return manager.createQuery("select e from " + table + " e", entityClass).getResultList();
    }

    @Override
    public List<Entity> getPagedAll(int page, int size) {
        return manager.createQuery("select e from " + table + " e", entityClass).setFirstResult(page * size).setMaxResults(size).getResultList();
    }

    @Override
    public Entity getById(ID uuid, boolean isLast) {
        return manager.createQuery("from ? e where e.id=?", entityClass).setParameter(1, table).setParameter(2, uuid).getSingleResult();
    }

    @Override
    public void saveOrUpdate(Entity entity, ID id, boolean isLast) {
        if (id == null) {
            manager.persist(entity);
        } else {
            manager.merge(entity);
        }
    }

    @Override
    public void delete(ID uuid, boolean isLast) {
        manager.remove(getById(uuid, isLast));
    }


}
