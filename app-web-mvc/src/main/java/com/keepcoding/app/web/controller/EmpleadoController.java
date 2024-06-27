package com.keepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.app.web.entity.Empleado;
import com.keepcoding.app.web.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping({"/","/empleados"})
	public String index(Model modelo) {
		modelo.addAttribute("empleados",empleadoService.listarEmpleados());
		return "empleado";
	}
	
	@GetMapping("/empleado/new")
	public String newEmpleadoForm(Model modelo) {
		Empleado empleado =  new Empleado();
		modelo.addAttribute("empleado", empleado);
		return "crear_empleado";
	}
	
	@PostMapping("/empleado")
	public String saveEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		empleadoService.guardarEmpleado(empleado);
		return "redirect:/";
	}
}