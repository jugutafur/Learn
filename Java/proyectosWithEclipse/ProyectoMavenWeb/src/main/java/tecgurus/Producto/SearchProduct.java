	package tecgurus.Producto;


import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import tecgurus.Model.Product;
//import javax.inject.Named;

@ViewScoped
//@Named
@ManagedBean
public class SearchProduct{

	private static final long serialVersionUID = 1L;
	
	private final List<Product> _products = List.of(new Product(1, "Galaxy s12", "Detalle Uno"), 
													new Product(2, "iPhone X", "Detalle Dos"), 
													new Product(3, "Moto G10", "Detalle Tres"));

	private String _currentDetails= "";
	
	//Metodo para buscar un producto por ID y si no lo encuentra devuelva un valor hardCoreado
	public void showDetails(int id) {
		this._currentDetails = this._products.stream().filter(products -> products.get_id() == id).findFirst()
				.orElseGet(()-> new Product(0,"","No encontrado")).get_details();
	}

	//para que JSF me regrese el resultado
	public void updateMessages(ActionEvent actionEvent) {
		//para conocer la instancia actual o el contexto de JSF
		FacesContext.getCurrentInstance().addMessage("Message", new FacesMessage("Buscando....", "Resultado"));
	}
	
	public List<Product> get_products() {
		return this._products;
	}

	public String get_currentDetails() {
		return this._currentDetails;
	}
	
	
}
