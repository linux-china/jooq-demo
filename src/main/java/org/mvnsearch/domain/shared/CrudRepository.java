package org.mvnsearch.domain.shared;

import java.io.Serializable;

/**
 * CRUD repository interface
 *
 * @author linux_china
 */
public interface CrudRepository<T, ID extends Serializable> {

    void save(T entity);

    T findOne(ID primaryKey);

    Iterable<T> findAll();

    Long count();

    void delete(T entity);

    boolean exists(ID primaryKey);
}
