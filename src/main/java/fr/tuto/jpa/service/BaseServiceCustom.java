package fr.tuto.jpa.service;

import fr.tuto.jpa.model.IdForm;
import fr.tuto.jpa.repo.interfaces.IBaseRepo;
import fr.tuto.jpa.service.interfaces.IBaseService;
import fr.tuto.jpa.tools.DtoTools;

import java.util.List;

public class BaseServiceCustom<Entity extends IdForm, DTO> implements IBaseService<Entity, DTO, String> {

    protected IBaseRepo<Entity> repo;
    private Class<DTO> dtoClass;
    private Class<Entity> entityClass;
    public BaseServiceCustom(IBaseRepo<Entity> repo) {
        this.repo = repo;
    }

    @Override
    public void initService(Class<Entity> entityClass, Class<DTO> dtoClass) {
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    @Override
    public List<DTO> getAll() {
        return repo.getAll().stream().map(e-> DtoTools.convert(e, dtoClass)).toList();
    }

    @Override
    public DTO getById(String s) {
        return DtoTools.convert(repo.getById(s, true), dtoClass);
    }

    @Override
    public void createOrUpdate(DTO dto) {
        repo.saveOrUpdate(DtoTools.convert(dto,entityClass), true);
    }

    @Override
    public void delete(String s) {
        repo.delete(s, true);
    }

    @Override
    public List<DTO> getAllPaged(int page, int size) {
        return repo.getPagedAll(page, size).stream().map(e->DtoTools.convert(e, dtoClass)).toList();
    }
}
