package Web.Entity.UI.Potfolio;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import Conection.Portfolio.ProyectoDAO;
import Domain.dto.Potfolio.Project;
import Persistence.MapperXML.Proyecto.Proyecto;

import java.util.List;
import java.time.LocalDate;
import static java.time.Month.FEBRUARY;
import static java.time.Month.AUGUST;
import static java.time.Month.SEPTEMBER;
import java.util.ArrayList;
import java.util.Random;

@Named
@ApplicationScoped
public class ProjectUI {
	
	private Proyecto proyecto = new Proyecto(); 
	private List<Project> listProjects;

	public String verificarProyecto() throws Exception {
		ProyectoDAO proyectoDAO = new ProyectoDAO(); 
		List<Proyecto> proyectos;
		String resultado = "Nada";
		
		try {
			proyectos = proyectoDAO.verificarProyecto(this.proyecto);
			if(proyectos != null) {			
				//FacesContext.getCurrentInstance().getExternalContext()
				//			.getSessionMap().put("proyectosRecover", proyectos);
				resultado = "Exito Recover Data";
			}else {
				resultado = "Error to Recover Data";
			}
			
		} catch (Exception e) {
			System.err.println("Falla al traer la Data "+ e);
		}
		
		return resultado;
	}

    public ProjectUI() {
		this.listProjects = new ArrayList<>();
		this.listProjects.add(new Project(1,"nombreU","DescriptionUno","CategoryUno", "/imagenes/navigator/1.jpg", LocalDate.of(2001, FEBRUARY, 25)));
		this.listProjects.add(new Project(1,"nombreD","DescriptionDos","CategoryDos", "/imagenes/navigator/1.jpg", LocalDate.of(2002, SEPTEMBER, 26)));
		this.listProjects.add(new Project(1,"nombreTres","DescriptionTres","CategoryTres", "/imagenes/navigator/1.jpg", LocalDate.of(2002, AUGUST, 5)));
		this.listProjects.add(new Project(1,"nombreCuatro","DescriptionCuatro","CategoryCuatro", "/imagenes/navigator/1.jpg", LocalDate.of(2003, FEBRUARY, 9)));
		this.listProjects.add(new Project(1,"nombreCinco","DescriptionCinco","CategoryUno", "/imagenes/navigator/1.jpg", LocalDate.of(2004, SEPTEMBER, 24)));
		this.listProjects.add(new Project(1,"nombreSeis","DescriptionSeis","CategoryCicno", "/imagenes/navigator/1.jpg", LocalDate.of(2005, AUGUST, 31)));
		this.listProjects.add(new Project(1,"nombreSiete","DescriptionSiete","CategorySeis", "/imagenes/navigator/1.jpg", LocalDate.of(2006, FEBRUARY, 3)));
	}
	
	public List<Project> getListProjects(){
		//return new ArrayList<>(this.listProjects);
		return this.listProjects;
	}
	
	public Proyecto getProyecto() {
		return proyecto;
	}
	
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	/*
	public List<Project> getListProjects(int size){
		if(size > listProjects.size()) {
			Random random = new Random();
			
			List<Project> randomListProjects = new ArrayList<>();
			
			for(int i=0; i<size; i++) {
				int randomIndex = random.nextInt(listProjects.size());
				randomListProjects.add(listProjects.get(randomIndex));
			}
			return randomListProjects;
		}
		else {
			return new ArrayList<>(listProjects.subList(0, size));
		}
	}
	*//*
	public static void main(String []arg) throws Exception {
		System.out.println("mensaje de prueba");
		
		ProjectUI projectUI = new ProjectUI();
		//List<Project> listProjectMain = new ArrayList<>();
		
		String resultado = projectUI.verificarProyecto();
		
		//for(Project e: listProjectMain) {
		//	System.out.println(e);
		//}
		
		System.out.println("este es el valor de resultado = "+ resultado);
	}*/
}
