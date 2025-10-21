package Conection.Portfolio;

import org.hibernate.Session;
import java.util.List;
import Persistence.MapperXML.Proyecto.Proyecto;

public class ProyectoDAO {
	
	private Session session;
	
	public List<Proyecto> verificarProyecto(Proyecto Proyecto) throws Exception {
		List<Proyecto> proyectos = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			//String hql = "from proyecto where nombre = '" + Proyecto.getNombre() + "'";
			String hql = "select * from proyecto";
			proyectos = session.createNativeQuery(hql, Proyecto.class).list();
			
			if(!proyectos.isEmpty()) {
				for (Proyecto proyecto2 : proyectos) {
					System.out.println("mis recovers = " +proyecto2);
				}
				//proyecto = (Proyecto)persons.list().get(0);
			}
			return proyectos;
		} catch (Exception e) {
			throw e;
		}finally{
			session.close();
		}
	}
}
