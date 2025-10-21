package Web.Entity.General;

import java.time.LocalDate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Web.Entity.Enumerados.Rol;
import Web.Entity.Enumerados.Sexo;
import Web.Entity.Pojo.MitoCode.Persona;

import java.util.List;
import java.util.ArrayList;

@ManagedBean
@RequestScoped
public class Empleado extends Persona {
	
	private String usuario= "UsuarioDemo";
	private String password;
	private LocalDate fechaIngreso;
	private Rol rol = Rol.ADMINISTRADOR;
	private List<Empleado> listEmpleados = new ArrayList<>();
	
	public Empleado() {}
	/*
	public Empleado	(String nombre, String apellido, int cedula, String celular, Sexo sexo,
			   LocalDate fechaNacimiento, String usuario, String password, LocalDate fechaIngreso, Rol rol) {
		
	super(nombre, apellido, cedula, celular, sexo, fechaNacimiento);
	this.usuario= usuario;
	this.password = password;
	this.fechaIngreso = fechaIngreso;
	this.rol = rol;
}*/

	public String getUsuario() {return usuario;}
	public void setUsuario(String usuario) {this.usuario = usuario;}

	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public LocalDate getFechaIngreso() {return fechaIngreso;}
	public void setFechaIngreso(LocalDate fechaIngreso) {this.fechaIngreso = fechaIngreso;}

	public Rol getRol() {return rol;}
	public void setRol(Rol rol) {this.rol = rol;}
	
	public List<Empleado> getTolistToEmpleados(){
		return this.listEmpleados;
	}
	
	public void addPersonToList(Empleado empleado) {
		this.listEmpleados.add(empleado);
	}
	/*
	public void deletePersonToList(int cedula) {
		listPersonas.stream().forEach(null);
	}*/
}
