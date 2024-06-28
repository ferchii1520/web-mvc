package com.keepcoding.app.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.app.web.entity.Proveedor;
import com.keepcoding.app.web.repository.ProveedorRepository;
import com.keepcoding.app.web.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{
	
	@Autowired
	ProveedorRepository proveedorRepository;

	@Override
	public List<Proveedor> listaProveedor(String dato) {
		if(dato != null) {
			return proveedorRepository.filterName(dato);
		} else {
			return proveedorRepository.findAll();
		}

	}
	
	

}
