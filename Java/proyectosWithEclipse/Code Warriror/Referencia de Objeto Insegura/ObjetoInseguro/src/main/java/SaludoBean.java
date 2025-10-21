import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.ApplicationScoped;
//import javax.faces.bean.ManagedBean;

//@RequestScoped
@ManagedBean
public class SaludoBean {
	
	public SaludoBean() {}
	
	private String mensaje = "Desde el Bean XX Java";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
