package designPatterns.misc.daoPattern;

import java.util.List;

public interface EntityDAO {
    //CRUD OPERATIONS
    void persist(Entity entity);
    Entity getById(long entityId);
    List<Entity> getAllEntities();
    void updateEntity(long id, Entity entity);
    void deleteEntityById(long id);
}
