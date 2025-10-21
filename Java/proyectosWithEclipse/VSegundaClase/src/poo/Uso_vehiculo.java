package poo;

import javax.swing.*;//JOptionPane

public class Uso_vehiculo {
	
	public static void main(String [] args) {
		
		//para crear un objeto
		//nombre de la clase a la cual pertenece
		//nombre que desea asignar a ese objeto 
		//escribir la palabra reservada new
		//nombre del constructor con sus ();
		
		Coche Renault= new Coche(); 	//instanciar o ejemplar de clase 
		
		//en este caso ya hay un objeto "Renault" que perteneces a la clase "Coche" que tiene atributos y metodos
		
		//Como el atributo ruedas esta encapsulado desde el constructor no lo puedo VER ni mODIFICAR desde otra clase
		//Solo con metodos podemos ver los atributos
		
		
		//				ESTO NO ES POSIBLE DEBIDO AQUE RUEDAS ESTA ENCAPSULADO
		//-------------------------------------------------------------------------------------------------
		/*
		Renault.ruedas=3;
		System.out.println("Este coche tiene "+Renault.ruedas+ " ruedas");
		
		*/
		//--------------------------------------------------------------------------------------------------
		
		//metodo getter
		System.out.println(Renault.get_Largo());
		
		//creamos otro objeto perteneciente a la clase Coche con su constructor Coche() 
		
		Coche mi_coche=new Coche();
		
		//----------------------------------------------------------------------------------------------------
		//las siguientes dos lineas de codigo son metodos SETTERS la diferencia esta en que la primera modifica
		//las variables desde el codigo y la segunda desde los argumentos del metodo
		
		mi_coche.set_Color1();
		
		mi_coche.set_Color2(JOptionPane.showInputDialog("Ingrese el color del carro"));
		
		//----------------------------------------------------------------------------------------------------
		
		System.out.println(mi_coche.get_Color());//getter
		
		System.out.println(mi_coche.get_Datos_generales());//getter
		
		mi_coche.set_Asientos(JOptionPane.showInputDialog("Ingrese si tiene asientos de cuero\nCARRO\n")); //setter
		
		System.out.println(mi_coche.get_Asientos());//getter
		
		mi_coche.set_Climatizador(JOptionPane.showInputDialog("Ingrese si tiene climatizador\nCARRO\n"));//setter
		
		System.out.println(mi_coche.get_Climatizador());//getter
		
		System.out.println(mi_coche.get_peso_coche());//getter
		
		System.out.println("El precio final del coche es = "+mi_coche.get_precio_coche());
		
//instanciamos un nuevo objeto de la clase Coche y del constructor coche		
		
		Coche micoche1=new Coche();
		
		micoche1.set_Color2("verde");
		
//instaciamos un objeto que pertenece a la clase furgoneta con el constructor coche
		
		furgoneta mifurgoneta1 =new furgoneta(7,580);
		
		mifurgoneta1.set_Color2(JOptionPane.showInputDialog("Ingrese el color de la furgoneta"));
		
		System.out.println(mifurgoneta1.get_Color());
		
		mifurgoneta1.set_Asientos(JOptionPane.showInputDialog("Ingrese si tiene asientos de cuero\nFURGONETA\n"));
		
		mifurgoneta1.set_Climatizador(JOptionPane.showInputDialog("Ingrese si tiene climatizador\nFURGONETA\n"));
		
		System.out.println(mifurgoneta1.get_Datos_generales()+" \nDatos de furgoneta es: "+mifurgoneta1.dime_datos_furgoneta());
		
	}
}
