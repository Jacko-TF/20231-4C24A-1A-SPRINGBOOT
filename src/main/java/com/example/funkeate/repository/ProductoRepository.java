package com.example.funkeate.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.funkeate.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer>{
	
}
