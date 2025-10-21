package Domain.dto.AulaMatriz;

public class Product {

	private short id;
	private String name;
	private float amount; //cantidad
	private Store store;
	
	public Product() {}

	public short getId() {return id;}
	public void setId(short id) {this.id = id;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public float getAmount() {return amount;}
	public void setAmount(float amount) {this.amount = amount;}

	public Store getStore() {return store;}
	public void setStore(Store store) {this.store = store;}
	
	@Override
	public String toString() {
		var stringBuilder = new StringBuilder();
		stringBuilder.append("Product = { id "+id)
		.append("name = "+ name)
		.append("amount = + amount")
		.append("store = "+ store)
		.append("}");
		return stringBuilder.toString();
	}
}
