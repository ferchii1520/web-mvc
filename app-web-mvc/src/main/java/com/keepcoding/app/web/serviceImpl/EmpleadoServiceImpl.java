package com.keepcoding.app.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.app.web.entity.Empleado;
import com.keepcoding.app.web.repository.EmpleadoRepository;
import com.keepcoding.app.web.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public List<Empleado> listarEmpleados() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleado(Long id) {
		return null;
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return null;
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		
	}

}
