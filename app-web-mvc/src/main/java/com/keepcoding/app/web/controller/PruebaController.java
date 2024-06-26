package com.keepcoding.app.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.app.web.entity.Prueba;

@Controller
public class PruebaController {
	
	@GetMapping("/saludo")
	public String saludar(Model modelo) {
		List<Prueba> lista = new ArrayList<>();
		Prueba objPrueba = new Prueba();
		Prueba objPrueba2 = new Prueba();
		objPrueba.setId(2574);
		objPrueba.setName("Dato Prueba");
		objPrueba2.setId(8754);
		objPrueba2.setName("Otro Prueba");
		lista.add(objPrueba);
		lista.add(objPrueba2);
		modelo.addAttribute("key", lista);
		return "Hola";
	}

}
