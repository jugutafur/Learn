package EntremientoJava;

public class Semana {

	enum Dias {	
		
		LUNES("l"), MARTES("ma"), MIERCOLES("mi"), JUEVES("j"), VIERNES("v"), SABADO("s"), DOMINGO("d");
		
		//En este caso el constructor esta funcionando a modo de Setter
		//No se puede instanciar de enum por ello el constructor es privado 
		private Dias(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
		
		//debe ir aca abajo
		private String abreviatura;
	}
}
