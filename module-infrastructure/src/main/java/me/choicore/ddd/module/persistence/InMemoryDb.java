package me.choicore.ddd.module.persistence;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class InMemoryDb {

    private final Map<Long, Object> db;


    public InMemoryDb() {
        this.db = new ConcurrentHashMap<>();
    }

    public static InMemoryDb getInstance() {
        InMemoryDb db = new InMemoryDb();
        db.save(1L, "Hello, World!");
        return db;

    }

    public void save(Long id, Object entity) {
        db.put(id, entity);
    }

    public Object findById(Long id) {
        return db.get(id);
    }
}
