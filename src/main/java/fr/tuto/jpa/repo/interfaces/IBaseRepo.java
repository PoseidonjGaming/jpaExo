package fr.tuto.jpa.repo.interfaces;

import java.util.List;

public interface IBaseRepo<Entity> {
    List<Entity> getAll();

    Entity getById(String uuid, boolean isLast);

    void saveOrUpdate(Entity entity, boolean isLast);

    void delete(String uuid, boolean isLast);

}
