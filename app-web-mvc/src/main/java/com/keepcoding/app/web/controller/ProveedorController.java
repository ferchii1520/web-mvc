package com.keepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.app.web.service.ProveedorService;

@Controller
public class ProveedorController {

	@Autowired
	private ProveedorService proveedorService;
	
	@GetMapping("/proveedores")
	public String proveedorList(Model modelo, @Param("datoBuscado") String datoBuscado) {
		modelo.addAttribute("proveedor", proveedorService.listaProveedor(datoBuscado));
		return "proveedor";
	}
	

}
