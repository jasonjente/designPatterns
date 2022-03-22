package designPatterns.misc.daoPattern;

import java.util.List;

public class DAODemo {

    public static void main(String[] args) {
        EntityDAO entityDAO = new EntityDAOImpl();

        Entity entity1 = new Entity("data1", "object1");
        Entity entity2 = new Entity("data2", "object2");
        Entity entity3 = new Entity("data3", "object3");
        Entity entity4 = new Entity("data4", "object4");
        Entity entity5 = new Entity("data5", "object5");

        entityDAO.persist(entity1);
        entityDAO.persist(entity2);
        entityDAO.persist(entity3);
        entityDAO.persist(entity4);
        entityDAO.persist(entity5);

        List<Entity> entities = entityDAO.getAllEntities();

        entities.stream().forEach((entity -> System.out.println(entity)));
        System.out.println();
        System.out.println(entityDAO.getById(1L));
        System.out.println(entityDAO.getById(2L));
        System.out.println(entityDAO.getById(3L));

        entityDAO.deleteEntityById(3L);
        System.out.println();

        entityDAO.updateEntity(4L, new Entity("OBJECT_NEW","OBJECT_NEW_OBJ"));
        entities = entityDAO.getAllEntities();
        entities.stream().forEach((entity -> System.out.println(entity)));



    }

}
