package poo;

//			SubClase          SuperClase
public class furgoneta extends Coche{
	
	private int capacidad_carga;
	private int plazas_extra;
	
	//metodo constructor 
	public furgoneta(int plazas_extra, int capacidad_carga) {
		
		super();			//llamado al constructor padre para que un valor incial a
							//las variables de clase.
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	public String dime_datos_furgoneta() {
		return "Capacidad de carga = "+capacidad_carga+ " y plazas extras =  "+plazas_extra;
	}

}
