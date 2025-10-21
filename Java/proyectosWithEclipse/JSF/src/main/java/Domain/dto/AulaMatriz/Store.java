package Domain.dto.AulaMatriz;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
//import javax.inject.Named;

@ManagedBean
@ApplicationScoped
public class Store {
	
	private byte id;
	private Product[] products;
	private String name="Julio";
	private String address;
	
	public Store() {}

	public byte getId() {return id;}
	public void setId(byte id) {this.id = id;}

	public Product[] getProducts() {return products;}
	public void setProducts(Product[] products) {this.products = products;}

	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}

	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}

	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Store { id = " +id)
		.append("product "+ products)
		.append("name "+ name)
		.append("addres " +address)
		.append("}");
	return stringBuilder.toString();
	}
}
