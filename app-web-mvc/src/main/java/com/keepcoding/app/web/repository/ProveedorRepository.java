package com.keepcoding.app.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.keepcoding.app.web.entity.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{
	
	@Query("SELECT p FROM Proveedor p WHERE p.nombre LIKE %:nombre%")
	public List<Proveedor> filterName(String nombre);

}
