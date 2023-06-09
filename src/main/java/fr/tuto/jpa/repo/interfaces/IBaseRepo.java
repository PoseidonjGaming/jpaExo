package fr.tuto.jpa.repo.interfaces;

import java.util.List;

public interface IBaseRepo<Entity, ID> {
    List<Entity> getAll();

    List<Entity> getPagedAll(int page, int size);

    Entity getById(ID uuid, boolean isLast);

    void saveOrUpdate(Entity entity, ID id,boolean isLast);

    void delete(ID uuid, boolean isLast);

}
