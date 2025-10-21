package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Banco {
	public static void main (String [] args) {
		
		int posicion=1;
		
		System.out.println("This a Banck");
		
		Cliente clienteUno = new Cliente("Carlos", "0001", 10_000);
		Cliente clienteDos = new Cliente("Juan", "0002", 30_000);
		Cliente clienteTres = new Cliente("Miguel", "0003", 80_000);
		Cliente clienteCuatro = new Cliente("Maria", "0004", 20_000);
		Cliente clienteCinco = new Cliente("Alberto", "0005", 106_000); //Este objecto es igual 
		Cliente clienteSeis = new Cliente("Alberto", "0005", 106_000);	//A este
		
		//interfaz variableObjeto = new Clase<Clase/TipoDatos>
		Set<Cliente> myListCliente = new HashSet<Cliente>();
		
		myListCliente.add(clienteUno);
		myListCliente.add(clienteDos);
		myListCliente.add(clienteTres);
		myListCliente.add(clienteCuatro);
		myListCliente.add(clienteCinco); //Al ser igual este con 
		myListCliente.add(clienteSeis);	 //Con este no lo deberia guardar PERO si lo hace
		
		//lo anterior lo guarda debido a que aunque los datos sean iguales el entorno no es capaz de 
		//identificar que los objetos sean iguales ya que los objetos son guardados EN LA MEMORY HEAP 
		//Y ESTOS DOS OBJETOS TIENEN DIFERENTE POSICION EN LA MEMORY HEAP
		
		//LO ANTERIOR LO PODEMOS EVIDENCIAR CON hasCode() Y LLAMANDO EL OBJETO DIRECTAMENTE
		
		for(Cliente clienteX : myListCliente) {
			System.out.println("Mi cliente # "+ posicion+ " = "+clienteX.getNombre()+ ", "
								+ clienteX.getN_cuenta()+ ", "+ clienteX.getSaldo()+
								" y su posicion en Memory es = " +clienteX.hashCode()+ "// "+clienteX);
			posicion++;
		}
		
		//Interfaz<TipoDato> objetoVariable = lista.Set.iterator();
		//objetoVariable = ObjetoIterador
		Iterator<Cliente> iterator = myListCliente.iterator();
		
		//Mientras que el objetoIterator tenga objetos por recorrer
		while(iterator.hasNext()) {
			//guarde en esta variable el nombre PERO PRIMERO SALTE
			String N_nombre = iterator.next().getNombre();
			System.out.println("Nombre de los clientes "+ N_nombre);
		}
	}

}
