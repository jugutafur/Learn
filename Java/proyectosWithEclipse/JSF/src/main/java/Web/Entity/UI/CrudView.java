package Web.Entity.UI;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import Domain.dto.Potfolio.Project;
import Web.Entity.UI.Potfolio.ProjectUI;

import java.util.List;

@ManagedBean
@ViewScoped
public class CrudView {

	private String tesCrud="Prueba desde Crud-Primefaces";
	private List<Project> products;
	private Project selectProduct;
	private List<Project> selectProducts;
	
	private ProjectUI productService;
	
	public void init() {
		//this.products = this.productService.getClonedProducts(100); 
	}
	
	public String getTest() {
		return "salida de Return getTest";
	}
	
	
}
