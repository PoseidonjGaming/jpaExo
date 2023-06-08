package fr.tuto.jpa.service.interfaces;

import java.util.List;

public interface IBaseService<Entity, DTO, ID> {
    void initService(Class<Entity> entityClass, Class<DTO> dtoClass);

    List<DTO> getAll();

    DTO getById(ID id);

    void createOrUpdate(DTO dto);

    void delete(ID id);
}
