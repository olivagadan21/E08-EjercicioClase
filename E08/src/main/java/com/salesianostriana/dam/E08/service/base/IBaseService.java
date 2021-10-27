package com.salesianostriana.dam.E08.service.base;

import java.util.List;

public interface IBaseService <T, ID> {

    T save(T t);


    T findById(ID id);


    List<T> findAll();


    T edit(T t);


    void delete(T t);


    void deleteById(ID id);

}
