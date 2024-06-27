package com.keepcoding.app.web.service;

import java.util.List;

import com.keepcoding.app.web.entity.Empleado;

public interface EmpleadoService {
	
	public List<Empleado> listarEmpleados();
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado obtenerEmpleado(Long id);
	public Empleado actualizarEmpleado(Empleado empleado);
	public void eliminarEmpleado(Long id);

}
