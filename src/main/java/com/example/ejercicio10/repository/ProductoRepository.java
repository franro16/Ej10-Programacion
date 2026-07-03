package com.example.ejercicio10.repository;

import com.example.ejercicio10.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>, PagingAndSortingRepository<Producto, Long> {
}   