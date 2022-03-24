package designPatterns.misc.daoPattern;

import designPatterns.behavioral.chainOfResponsibility.Logger;

import java.util.*;

public class Database<T> {
    private Map<Long, T> db = new HashMap<>();
    private static Long nextEntryId = 1L;
    private static final Logger logger = Logger.createLogger();
    public void addToDb(T entity){
        logger.log(Logger.INFO,"Database.addToDb() - ENTER");
        if (db == null) {
            db = new HashMap<>();
        }
        db.put(nextEntryId, entity);
        logger.log(Logger.DEBUG,"Database.addToDb() - added entity: " + entity.toString() + " to the database.");
        nextEntryId++;
        logger.log(Logger.INFO,"Database.addToDb() - LEAVE");
    }
    public T getById(Long id){
        logger.log(Logger.INFO,"Database.getById() - ENTER");
        if(db.containsKey(id)){
            logger.log(Logger.INFO,"Database.getById() - LEAVE");
            logger.log(Logger.DEBUG,"Database.getById() - " + db.get(id).toString());
            return db.get(id);
        }else {
            logger.log(Logger.INFO,"Database.getById() - LEAVE");
            return null;
        }

    }

    public List<T> getAll(){
        logger.log(Logger.INFO,"Database.getAll() - ENTER");
        List<T> ret = new ArrayList<>();
        for(T t:db.values()){
            logger.log(Logger.INFO,"Database.getAll() - LEAVE");
            ret.add(t);
        }
        logger.log(Logger.INFO,"Database.getAll() - LEAVE");
        return ret;
    }

    public T find(T t){
        logger.log(Logger.INFO,"Database.find() - ENTER");
        List<T> list = getAll();
        for(T item: list){
            if(t.equals(item)){
                logger.log(Logger.INFO,"Database.find() - LEAVE");
                return item;
            }
        }
        logger.log(Logger.INFO,"Database.find() - LEAVE");
        return null;
    }

    public void updateEntry(Long id, T entity){
        logger.log(Logger.INFO,"Database.updateEntry() - ENTER");
        if(db.containsKey(id)){
            db.replace(id, entity);
        }else{
            db.put(nextEntryId, entity);
        }
        logger.log(Logger.INFO,"Database.updateEntry() - LEAVE");

    }

    public void deleteEntry(T t){
        logger.log(Logger.INFO,"Database.deleteEntry() - ENTER");
        if(db.containsValue(t)){
            db.entrySet().removeIf(entry -> (t.equals(entry.getValue())));
            logger.log(Logger.INFO,"Database.deleteEntry() - LEAVE");
        }
        logger.log(Logger.INFO,"Database.deleteEntry() - LEAVE");
    }

    public void deleteEntryById(Long id){
        logger.log(Logger.INFO,"Database.deleteEntryById() - ENTER");
        if (db.containsKey(id)){
            db.remove(id);
            logger.log(Logger.DEBUG, "Database.deleteEntry() - deleted entry with id "+id);
        }else{
            logger.log(Logger.INFO,"Database.deleteEntry() - entry with id "+ id + "was not found.");
        }
        logger.log(Logger.INFO,"Database.deleteEntry() - LEAVE");
    }


}
