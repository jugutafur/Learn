package Domain.dto.MitoCode;

public class Person {
	
	private String _name;
	private String _lastName;
	private String _message;
	private String _sexo;
	
	public Person() {}

	public String get_name() {return _name;}
	public void set_name(String _name) {this._name = _name;}

	public String get_message() {return _message;}
	public void set_message(String _message) {this._message = _message;}

	public String get_lastName() {return _lastName;}
	public void set_lastName(String _lastName) {this._lastName = _lastName;}

	public String get_sexo() {return _sexo;}
	public void set_sexo(String _sexo) {this._sexo = _sexo;}

	public void getting() {
		this._message = "Hola tu nombre es = "+ this._name;
	}
	
}
