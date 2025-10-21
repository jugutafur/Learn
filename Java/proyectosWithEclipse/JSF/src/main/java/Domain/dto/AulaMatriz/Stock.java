package Domain.dto.AulaMatriz;

public class Stock {
	
	private short id;
	private Product[] products;
	private Store stores;
	
	public Stock () {}
	
	public short getId() {return id;}
	public void setId(short id) {this.id = id;}
	
	public Product[] getProducts() {return products;}
	public void setProducts(Product[] products) {this.products = products;}
	
	public Store getStores() {return stores;}
	public void setStores(Store stores) {this.stores = stores;}
	
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
