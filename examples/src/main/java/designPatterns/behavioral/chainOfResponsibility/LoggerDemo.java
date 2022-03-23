package designPatterns.behavioral.chainOfResponsibility;

import designPatterns.misc.daoPattern.Entity;
import designPatterns.misc.daoPattern.EntityDAOImpl;

import java.util.List;

public class LoggerDemo {
    private final static Logger logger = Logger.createLogger();
    public static void main(String[] args) {
        logger.log(Logger.INFO,"BEGIN initialized logger, instantiating EntityDao.");

        EntityDAOImpl entityDAO = new EntityDAOImpl();

        List<Entity> list = entityDAO.getAllEntities();
        try {
            logger.log(Logger.INFO,"Trying to access a null entry.");
            System.out.println(list.get(1));
        }catch (Exception exception){
            logger.log(Logger.ERROR, exception.getMessage());
            logger.log(Logger.DEBUG, "DEBUG MODE ON: Make sure you have initialized the collection.");
        }
        boolean success = false;
        Entity entity = new Entity("String", 321L);
        logger.log(Logger.INFO,"Persisting entity :"+entity);
        try{
            entityDAO.persist(entity);
            success = true;
        }catch (Exception e){
            logger.log(Logger.ERROR, e.getMessage());
        }
        if(success){
            logger.log(Logger.DEBUG, "Success");
        }
        logger.log(Logger.INFO,"Entity data: (entityDao.getById(1): "+ entityDAO.getById(1L));
        logger.log(Logger.INFO,"END");
    }


}
