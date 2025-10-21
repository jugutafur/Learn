package Web.Entity.Pojo.aulaMatriz.coffeStock;

public class Stock {
	
	private short id;
	private Producto[] products;
	private Tienda stores;
	
	public Stock () {}
	
	public short getId() {return id;}
	public void setId(short id) {this.id = id;}
	
	public Producto[] getProducts() {return products;}
	public void setProducts(Producto[] products) {this.products = products;}
	
	public Tienda getStores() {return stores;}
	public void setStores(Tienda stores) {this.stores = stores;}
	
	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Stock { id + "+id)
		.append("produts = "+ products)
		.append("stores = "+ stores)
		.append("}");
		return stringBuilder.toString();
	}
}
