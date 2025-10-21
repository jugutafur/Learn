package Web.Entity.Pojo.aulaMatriz.coffeStock;

public class Producto {

	private short id;
	private String nombre;
	private float cantidad; //cantidad
	private Tienda tienda;
	
	public Producto() {}

	public short getId() {return id;}
	public void setId(short id) {this.id = id;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public float getCantidad() {return cantidad;}
	public void setCantidad(float cantidad) {this.cantidad = cantidad;}

	public Tienda getTienda() {return tienda;}
	public void setTienda(Tienda tienda) {this.tienda = tienda;}
	
	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Product = { id "+id)
		.append("name = "+ nombre)
		.append("amount = "+ cantidad)
		.append("store = "+ tienda)
		.append("}");
		return stringBuilder.toString();
	}
}
