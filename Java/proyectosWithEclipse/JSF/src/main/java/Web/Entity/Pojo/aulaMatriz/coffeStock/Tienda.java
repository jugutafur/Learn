package Web.Entity.Pojo.aulaMatriz.coffeStock;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
//import javax.inject.Named;

@ManagedBean
@ApplicationScoped
public class Tienda {
	
	private byte id;
	private Producto[] productos;
	private String nombre="Julio";
	private String direccion;
	
	public Tienda() {}

	public byte getId() {return id;}
	public void setId(byte id) {this.id = id;}

	public Producto[] getProductos() {return productos;}
	public void setProductos(Producto[] productos) {this.productos = productos;}

	public String getNombre() {return this.nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getDireccion() {return direccion;}
	public void setDireccion(String direccion) {this.direccion = direccion;}

	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Store { id = " +id)
		.append("product "+ productos)
		.append("name "+ nombre)
		.append("addres " +direccion)
		.append("}");
	return stringBuilder.toString();
	}
}
