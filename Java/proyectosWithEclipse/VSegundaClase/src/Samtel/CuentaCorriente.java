package Samtel;

public class CuentaCorriente {
		
		private String nombre;
		private String apellido;
		private int edad;
		private int numeroCuenta;
		private double saldo;
		
		public CuentaCorriente(String nombre, String apellido, int edad, int numeroCuenta, double saldo) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.numeroCuenta = numeroCuenta;
			this.saldo = saldo;
		}
		
		public CuentaCorriente(int numeroCuenta, double saldo) {
			this.numeroCuenta = numeroCuenta;
			this.saldo = saldo;
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getNumeroCuenta() {
			return numeroCuenta;
		}

		public void setNumeroCuenta(int numeroCuenta) {
			this.numeroCuenta = numeroCuenta;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public double incrementoSaldo(double cantidad) {
			saldo += cantidad;
			return saldo;
		}
		
		public double decrementoSaldo(double cantidad) {
			saldo -= cantidad;
			return saldo;
		}
		
		public String getCuentaSaldo() {
			return "Su numero de cuenta es = "+ numeroCuenta + " y con saldo = "+ saldo; 
		}
		
}
