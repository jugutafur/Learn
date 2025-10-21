package tecgurus.Model;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private final int _id;
	private final String _name;
	private final String _details;

	public Product(int _id, String _name, String _details) {
		this._id = _id;
		this._name = _name;
		this._details = _details;
	}

	public int get_id() {return _id;}

	public String get_name() {return _name;}

	public String get_details() {return _details;}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Product = {_id = "+this._id)
		.append(", _name= "+this._name)
		.append(", _details= "+this._details)
		.append("}");
		return stringBuilder.toString();
	}
}
