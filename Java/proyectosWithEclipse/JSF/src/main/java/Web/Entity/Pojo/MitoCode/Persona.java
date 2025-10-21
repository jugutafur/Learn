package Web.Entity.Pojo.MitoCode;

import java.time.LocalDate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Web.Entity.Enumerados.Sexo;

public class Persona {

	private String nombre = "PesonaSinNombre";
	private String apellido;
	private int cedula;
	private String celular;
	private Sexo sexo;
	private LocalDate fechaNacimiento;

	public Persona() {}
	/*
	public Persona(String nombre, String apellido, int cedula, String celular, Sexo sexo, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.celular = celular;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}*/

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}

	public int getCedula() {return cedula;}
	public void setCedula(int cedula) {this.cedula = cedula;}

	public String getCelular() {return celular;}
	public void setCelular(String celular) {this.celular = celular;}

	public Sexo getSexo() {return sexo;}
	public void setSexo(Sexo sexo) {this.sexo = sexo;}

	public LocalDate getFechaNacimiento() {return fechaNacimiento;}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

	public String mostrarData() {return "result";}
	
	public String irNewVista() {
		return "newView";
	}

	public String irOtraVista() {
		return "/Views/otraNewView";
	}
}
