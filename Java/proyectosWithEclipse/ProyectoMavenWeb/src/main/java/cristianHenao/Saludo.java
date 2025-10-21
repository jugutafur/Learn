package cristianHenao;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.*;

@Named
//@ManagedBean
@RequestScoped
public class Saludo {
	
	private String _mensaje = "Bienvenidos";

	public String get_mensaje() {return _mensaje;}
	public void set_mensaje(String _mensaje) {this._mensaje = _mensaje;}
	
	public String getPrueba() {return "Juan Tafur Ramirez";}
	
}
