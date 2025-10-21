package es.makigas.hibernate.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.makigas.hibernate.modelo.Empleado;

public class TestEmpleado {
	
	private static EntityManager manager;
	
	private static EntityManagerFactory emf;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();

		System.out.println("En esta base de datos hay "+ empleados.size()+ "Empleados");
	}

}
