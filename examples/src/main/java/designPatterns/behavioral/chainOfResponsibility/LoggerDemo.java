package designPatterns.behavioral.chainOfResponsibility;

import designPatterns.misc.daoPattern.Entity;
import designPatterns.misc.daoPattern.EntityDAO;
import designPatterns.misc.daoPattern.EntityDAOImpl;
import org.junit.Test;

/**
 * Test class for logger. One positive test case and one negative.
 * One Test case with a custom object with the toString method overridden.
 * One Test case with a custom object without the toString method overridden.
 *
 * */
public class LoggerDemo {
    private static final Logger logger = Logger.createLogger();
    @Test
    public void testLogger() {
        logger.log(Logger.INFO,"BEGIN initialized logger, instantiating EntityDao.");

        EntityDAO entityDAO = new EntityDAOImpl();

        try {
            logger.log(Logger.INFO,"Trying to access a null entry.");
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

    @Test(expected = IllegalArgumentException.class)
    public void testLoggerInvalidInput(){
        logger.log(4, "This is an arbitrary value that will lead to an exception being thrown.");
    }

    @Test
    public void testLoggingObjectsWithToStringMethod(){
        logger.log(1, new CustomObject1("A random value", 33L));
    }
    @Test
    public void testLoggingObjectsWithNoToStringMethod(){
        logger.log(1, new CustomObject2("A random value", new CustomObject3()));
    }
    private class CustomObject1 {
        private String arg1;
        private Long arg2;

        public CustomObject1(String arg1, Long arg2) {
            this.arg1 = arg1;
            this.arg2 = arg2;
        }

        @Override
        public String toString() {
            return "TestObject with: " +arg1+ " and " + arg2 + ".";
        }
    }

    private class CustomObject2 {
        private String arg1;
        private CustomObject3 arg2;

        public CustomObject2(String arg1, CustomObject3 arg2) {
            this.arg1 = arg1;
            this.arg2 = arg2;
        }

        @Override
        public String toString() {
            return "TestObject with: " +arg1+ " and " + arg2 + ".";
        }
    }
    private class CustomObject3 {

    }

}
