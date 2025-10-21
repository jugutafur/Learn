package com.myhanoli.ws.app;

import javax.jws.WebService;

@WebService(endpointInterface="com.myhanoli.ws.app.Empleado") //De esta manera indicamos en donde va encontrar la interface 
public class GestorEmpleado implements Empleado{

	@Override
	public String getEmpleadoByID(int idEmpleado) {
		String resp = (idEmpleado == 10)?"Encontrado":"fallido";
		return resp;
	}

}
