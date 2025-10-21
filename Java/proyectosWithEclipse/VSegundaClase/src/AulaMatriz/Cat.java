package AulaMatriz;

public class Cat extends Animal implements Pet {
	
	private String name;
	
	//Este constructor sobreescribe al siguiente constructor
	public Cat() {
		this("Mrs gato");
	}
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	/*
	public Cat() {
		super(5);
	}
	*/

	@Override
	public void eat() {
		System.out.println("Cats like to eat fish and spiders");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println(name + " like to play with to string");		
	}

}
