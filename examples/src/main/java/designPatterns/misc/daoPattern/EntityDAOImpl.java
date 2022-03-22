package designPatterns.misc.daoPattern;

import java.util.List;

public class EntityDAOImpl implements EntityDAO{
    private Database<Entity> db = new Database<>();
    @Override
    public void persist(Entity entity) {
        db.addToDb(entity);
    }

    @Override
    public Entity getById(long entityId) {
        return db.getById(entityId);
    }

    @Override
    public List<Entity> getAllEntities() {
        return db.getAll();
    }

    @Override
    public void updateEntity(long id, Entity entity) {
        db.updateEntry(id, entity);
    }

    @Override
    public void deleteEntityById(long id) {
        db.deleteEntry(id);
    }
}
