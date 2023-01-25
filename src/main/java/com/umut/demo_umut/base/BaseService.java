package com.umut.demo_umut.base;

import java.util.List;
import java.util.UUID;

public interface BaseService<T> {
    T create (T t);

   List<T> createAll (List<T> t);

    T update (T t);

    List<T> updateAll(List<T> entityList);

    void delete (UUID id);

    List<T> readAll();

    T read (UUID id);
}
