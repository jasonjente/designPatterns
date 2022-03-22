package designPatterns.misc.daoPattern;

public class Entity {
    private static long id = 0;
    private String data;
    private Object object;
    private long entityId;

    public Entity(String data, Object object) {
        entityId = id++;
        this.data = data;
        this.object = object;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "data='" + data + '\'' +
                ", object=" + object +
                ", entityId=" + entityId +
                '}';
    }
}
