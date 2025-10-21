package Web.Entity.General;

import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;

@Named
@ViewScoped
public class CarroDeCompras extends HttpServlet {
	
	String prueba = "america";
	private static int opcion= 9;
	
	private List<String> listArticulosSinMemoria = new ArrayList<>();
	private List<String> listArticulosConMemoria = new ArrayList<>();
	
	public void iniciarRequest(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException
	{
		//HttpServletRequest request = (HttpServletRequest)ServletRequest;
		try {
			
			//retorna la HttpSession actual asociada con este request
			//Si el request no tiene una session, crea una nueva
			HttpSession sesson = request.getSession();
			
			//this.listArticulosConMemoria = request.getParameterValues("articulos");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public CarroDeCompras() {}
	
	public String getPrueba() {
		return prueba;
	}
	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}	

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	
	public List<String> getListArticulosSinMemoria() {
		return listArticulosSinMemoria;
	}

	public void setListArticulosSinMemoria(List<String> listArticulosSinMemoria) {
		listArticulosSinMemoria = listArticulosSinMemoria;
	}

	public List<String> getListArticulosConMemoria() {
		return listArticulosConMemoria;
	}

	public void setListArticulosConMemoria(List<String> listArticulosConMemoria) {
		listArticulosConMemoria = listArticulosConMemoria;
	}

	public void agregarArticulosList() {
		this.opcion++;
	}

	@Override
	public String toString() {
		return "CarroDeCompras [prueba=" + prueba + ", opcion=" + opcion + "]";
	}

}
