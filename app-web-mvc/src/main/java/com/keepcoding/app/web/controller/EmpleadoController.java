package com.keepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.app.web.entity.Empleado;
import com.keepcoding.app.web.service.EmpleadoService;
import org.springframework.web.bind.annotation.RequestParam;




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
	
	@GetMapping("/empleado/editar/{id}")
	public String updateEmpleadoForm(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("empleado_update",empleadoService.obtenerEmpleado(id));
		return "editar_empleado";
	}
	
	@PostMapping("/empleado/{id}")
	public String updateEmpleado(@PathVariable Long id, @ModelAttribute("empleado_update") Empleado empleado) {
		Empleado empleadoExistente = empleadoService.obtenerEmpleado(id);
		empleadoExistente.setId(id);
		empleadoExistente.setNombre(empleado.getNombre());
		empleadoExistente.setApellido(empleado.getApellido());
		empleadoExistente.setEmail(empleado.getEmail());
		empleadoExistente.setTelefono(empleado.getTelefono());
		
		empleadoService.actualizarEmpleado(empleadoExistente);
		
		return "redirect:/";
	}
	
	@GetMapping("/empleado/delete/{id}")
	public String deleteEmpleado(@PathVariable Long id){
		empleadoService.eliminarEmpleado(id);
		return "redirect:/";
	}
	
	
	
}