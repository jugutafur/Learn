package AulaMatriz;

public abstract class Animal {
	protected int legs;
	
	public Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("This Animal walk in = "+ legs + " legs");
	}
	
	public abstract void eat();

	@Override
	public String toString() {
		return "Animal [legs=" + legs + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
