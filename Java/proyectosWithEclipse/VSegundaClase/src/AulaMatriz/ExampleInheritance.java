package AulaMatriz;

public class ExampleInheritance{
	
	public static void main (String [] args) {
		System.out.println("This is a app to check Inheritance\n");
		
		//No se puede instanciar ya que Animal es abstract
		//Animal animaUno = new Animal(4);
		
		Animal animal; //Referencia a la clase abstracta
		Pet pet; //Referencia a la interfaz
		
		System.out.println("*Instanciar un objeto Spider normal");
		Spider spiderUno = new Spider(8); //instanciar un objeto Spider normal
		spiderUno.eat();
		spiderUno.walk();
		
		System.out.println("\n*Instanciar una clase abstracta usando como referencia una clase Spider");
		animal = new Spider(9); //Instanciar una clase abstracta usando como referencia una clase
		animal.eat();
		animal.walk();
		
		System.out.println(animal.toString());
		
		System.out.println("\n*Instanciar un objeto Cat normal");
		Cat catUno = new Cat(); //instanciar un objeto Cat normal
		catUno.eat();
		catUno.walk();
		catUno.play();
		
		System.out.println("\n*Instanciar una clase abstracta usando como referencia una clase Cat");
		animal = new Cat(); //Instanciar una clase abstracta usando como referencia una clase
		animal.eat();
		animal.walk();
		
		System.out.println("\n*Instanciar una Interfaz usando como referencia una clase Cat");
		pet = new Cat(); //Instanciar una Interfaz usando como referencia una clase
		pet.setName("Felix");
		pet.play();	
		
		System.out.println("\n*Verificar que efectivamente se presente herrencia");
		playWithAnimals(spiderUno);
		playWithAnimals(catUno);
	}
	
	public static void playWithAnimals(Animal animal) {
		
		//vamos a preguntar si lo que entra es una instancia de Animal
		//Si el objeto que entra por ejemplo Cat implementa la Interfaz Pet 
		if(animal instanceof Pet) {
			//Es necesario un cating ya que son de tipos incopatibles Animal != Pet 
			Pet pet = (Pet) animal;
			pet.play();
		}else {
			System.out.println("El animal "+ animal + " No implementa la Interfaz Pet");
			System.out.println("Danger Animal");
		}
		
	}

}
