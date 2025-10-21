package Samtel;

public class CuentaAhorro extends CuentaCorriente{
	
	private double interes;

	public CuentaAhorro(String nombre, String apellido, int edad, int numeroCuenta, double saldo, double interes) {
		super(nombre, apellido, edad, numeroCuenta, saldo);
		this.interes = interes;
	}

	public CuentaAhorro(int numeroCuenta, double saldo) {
		super(numeroCuenta, saldo);
		interes = 15.3;
	}
	
	public double calcularInteres() {
		double saldoPadre = super.getSaldo();
		saldoPadre *= interes;
		return saldoPadre;
	}
	
	
	
	
	
}
