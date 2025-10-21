package com.myhanoli.ws.app;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebParam;

@WebService
public interface Empleado {

	@WebMethod(operationName="getEmpleado")
	@WebResult(name="ResultadoOperacion") 
	String getEmpleadoByID(@WebParam(name="idEmpleado")int idEmpleado);
}
