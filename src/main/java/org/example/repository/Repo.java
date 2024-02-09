package org.example.repository;

import java.util.List;

public interface Repo<T, ID> {

    T save(T entity);
    T findById(ID id);
    List<T> findAll();
    void delete(T entity);
}
