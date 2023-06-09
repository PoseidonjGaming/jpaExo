package fr.tuto.jpa.service.interfaces;

import fr.tuto.jpa.dto.IdentityCardDTO;

import java.util.List;

public interface IBaseService<Entity, DTO, ID> {
    void initService(Class<Entity> entityClass, Class<DTO> dtoClass);

    List<DTO> getAll();

    DTO getById(ID id);

    void createOrUpdate(DTO dto, ID id);

    void delete(ID id);

    List<DTO> getAllPaged(int page, int size);
}
