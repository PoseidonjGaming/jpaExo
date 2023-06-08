package fr.tuto.jpa.service;

import fr.tuto.jpa.service.interfaces.IBaseService;
import fr.tuto.jpa.tools.DtoTools;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class BaseService<Entity, DTO, ID> implements IBaseService<Entity, DTO, ID> {

    private JpaRepository<Entity,ID> repo;
    private Class<DTO> dtoClass;
    private Class<Entity> entityClass;

    public BaseService(JpaRepository<Entity,ID> repo) {
        this.repo = repo;
    }

    @Override
    public void initService(Class<Entity> entityClass, Class<DTO> dtoClass) {
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    @Override
    public List<DTO> getAll() {
        return repo.findAll().stream().map(e -> DtoTools.convert(e, dtoClass)).toList();
    }

    @Override
    public DTO getById(ID id) {
        return DtoTools.convert(repo.findById(id).orElse(null), dtoClass);
    }

    @Override
    public void delete(ID id) {
        repo.deleteById(id);
    }

    @Override
    public List<DTO> getAllPaged(int page, int size) {
        return repo.findAll().stream().map(e->DtoTools.convert(e, dtoClass)).toList();
    }

    @Override
    public void createOrUpdate(DTO dto) {
        repo.save(DtoTools.convert(dto, entityClass));
    }


}
