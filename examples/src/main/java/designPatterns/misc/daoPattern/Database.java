package designPatterns.misc.daoPattern;

import java.util.*;

public class Database<T> {
    private Map<Long, T> db = new HashMap<>();
    private static Long nextEntryId = 1L;

    public void addToDb(T entity){
        if (db == null) {
            db = new HashMap<>();
        }
        db.put(nextEntryId, entity);
        nextEntryId++;
    }
    public T getById(Long id){
        if(db.containsKey(id)){
            return db.get(id);
        }else {
            return null;
        }
    }

    public List<T> getAll(){
        List<T> ret = new ArrayList<>();
        for(T t:db.values()){
            ret.add(t);
        }
        return ret;
    }

    public void updateEntry(Long id, T entity){
        if(db.containsKey(id)){
            db.replace(id, entity);
        }/*else{
            db.put(entity.next, entity);
        }
        */
    }

    public void deleteEntry(Long id){
        if (db.containsKey(id)){
            db.remove(id);
        }
    }


}
