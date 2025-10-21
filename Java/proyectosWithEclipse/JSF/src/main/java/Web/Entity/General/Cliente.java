package Web.Entity.General;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

import Web.Entity.Pojo.MitoCode.Persona;

import java.util.List;
import java.util.ArrayList;

@ManagedBean
@RequestScoped
public class Cliente extends Persona{
	
	private int idCliente;
	private String nickName;
	private int points;
	private Cliente currentCliente;
	private List<Cliente> listClientes = new ArrayList<>();
	public String bandera="blanco";
	
	public Cliente () {
		/*
		Cliente clienteUno =new Cliente();
		clienteUno.setNombre("miguel");
		clienteUno.setApellido("tafur");
		clienteUno.setPoints(25);
		clienteUno.setNickName("mgTafur");
		//listClientes.add(clienteUno);*/
	}
	/*
	public Cliente(String nombre, String apellido, int cedula, String celular, Sexo sexo,
				   LocalDate fechaNacimiento, String nickName, int points) {
		
		super(nombre, apellido, cedula, celular, sexo, fechaNacimiento);
		this.nickName = nickName;
		this.points = points;
	}
*/
	public int getIdCliente() {return idCliente;}
	public void setIdCliente(int idCliente) {this.idCliente = idCliente;}

	public String getNickName() {return nickName;}
	public void setNickName(String nickName) {this.nickName = nickName;}

	public int getPoints() {return points;}
	public void setPoints(int points) {this.points = points;}
	
	public Cliente getCurrentCliente() {return currentCliente;}
	public void setCurrentCliente(Cliente currentCliente) {this.currentCliente = currentCliente;}
	
	public List<Cliente> getListClientes() {return listClientes;}
	public void setListClientes(List<Cliente> listClientes) {this.listClientes = listClientes;}
	
	public String getBandera() {return bandera;}
	public void setBandera(String bandera) {this.bandera = bandera;}
	
	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Cliente = {idCliente = "+idCliente)
		.append("nickName = "+ nickName)
		.append("points = " + points)
		.append("} ");
		return stringBuilder.toString();
	}
	
	public void crearNewCliente() {
		this.currentCliente = new Cliente();
		this.bandera= "en metodo crearNewCliente";
	}
	
	public List<Cliente> getListToClientes() {
		return this.listClientes;
	}
	
	public void addToClientToList() {
		this.bandera= "en metodo addToClientToList";
		this.listClientes.add(this.currentCliente);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente Agregado"));
		PrimeFaces.current().executeScript("PF('addNuevoCliente').hide()");
		PrimeFaces.current().ajax().update("form:messages", "form:addNewEntity");
	}
}
