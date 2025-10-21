
import java.util.Scanner;

public class borrar {

    public static void main(String[] args) {
        boolean eleccionCorrecta = true;
        int operacion;
        Scanner reader = new Scanner(System.in);
        double inicial;
        double totalCuenta;

        while (eleccionCorrecta) {
            eleccionCorrecta = false;
            System.out.print("Que operacion desea realizar \n");
            System.out.print("Elija \n 1. Cuenta de Ahorros. \n 2. Cuenta de Inversión \n 3. Calcular vacaciones empleado \n");
            operacion = reader.nextInt();

            //Operacion
            switch (operacion) {
                case 1 -> {
                    // Crear la cuenta
                    eleccionCorrecta = true;
                    Cuenta Cuenta1;
                    Cuenta1 = new Cuenta(0, "", "", 0, 0, 0);
                    System.out.print("Cedula cliente: ");
                    int cedula = reader.nextInt();
                    Cuenta1.setCedula(cedula);
                    System.out.print("Nombres cliente: ");
                    String nombres = reader.next();
                    Cuenta1.setNombres(nombres);
                    System.out.print("Nombres Apellidos: ");
                    String apellidos = reader.next();
                    Cuenta1.setNombres(apellidos);
                    System.out.print("Numero de cuenta: ");
                    int numero = reader.nextInt();
                    Cuenta1.setNumeroCliente(numero);
                    boolean valor = true;
                    while (valor) {
                        System.out.print("Cantidad inicial: ");
                        inicial = reader.nextInt();
                        Cuenta1.setInicial(inicial);
                        if (Cuenta1.verificarInicial(inicial)) {
                            valor = false;
                        } else {
                            System.out.println("El primer deposito debe ser igual a 1000");
                        }
                    }
                    System.out.print("Porcentaje de Ahorro Anual: ");
                    double porcentaje = reader.nextDouble();
                    Cuenta1.setPorcentajeAhorroAnual(porcentaje);

                    while (eleccionCorrecta) {
                        eleccionCorrecta = false;
                        System.out.print("Que operacion desea realizar \n");
                        System.out.print("Elija \n 1. Para deposito. \n 2. Para retiro \n");
                        operacion = reader.nextInt();

                        //Operacion
                        switch (operacion) {
                            case 1 -> {
                                // hacemos un ingreso en la cuenta
                                System.out.print("Cantidad depositar: ");
                                double deposito = reader.nextDouble();
                                Cuenta1.deposito(deposito);
                                // break es opcional
                            }
                            case 2 -> {
                                // hacemos un ingreso en la cuenta
                                System.out.print("Cantidad a retirar: ");
                                double retiro = reader.nextDouble();
                                System.out.print("Ingrese su cedula: ");
                                int c = reader.nextInt();
                                Cuenta1.retiro(retiro, c);
                                // break es opcional
                            }
                            default -> {
                                System.out.print("Elija una opcion valida \n");
                                eleccionCorrecta = true;
                            }
                        }
                        // declaracion case
                        // los valores deben ser del mismo tipo de la expresion

                        System.out.println("-------------------------------------------------");
                        // Consultamos el saldo de nuevo
                        totalCuenta = Cuenta1.getSaldo();
                        System.out.println("Total actual en la cuenta: " + totalCuenta + " pesos");
                    }
                }

                case 2 -> {
                    // Crear la cuenta
                    eleccionCorrecta = true;
                    CuentaInversion CuentaInversion1;
                    CuentaInversion1 = new CuentaInversion(0, "", "", 0, 0, 0);
                    System.out.print("Cedula cliente: ");
                    int cedula = reader.nextInt();
                    CuentaInversion1.setCedula(cedula);
                    System.out.print("Nombres cliente: ");
                    String nombres = reader.next();
                    CuentaInversion1.setNombres(nombres);
                    System.out.print("Nombres Apellidos: ");
                    String apellidos = reader.next();
                    CuentaInversion1.setNombres(apellidos);
                    System.out.print("Numero de cuenta: ");
                    int numero = reader.nextInt();
                    CuentaInversion1.setNumeroCliente(numero);
                    boolean valor = true;
                    while (valor) {
                        System.out.print("Cantidad inicial: ");
                        inicial = reader.nextInt();
                        CuentaInversion1.setInicial(inicial);
                        if (CuentaInversion1.verificarInicial(inicial)) {
                            valor = false;
                        } else {
                            System.out.println("El primer deposito debe ser igual a 25000");
                        }
                    }
                    while (eleccionCorrecta) {
                        eleccionCorrecta = false;
                        System.out.print("Que operacion desea realizar \n");
                        System.out.print("Elija \n 1. Para deposito. \n 2. Para retiro \n 3. Cancelar cuenta (Retirar todo)\n");
                        operacion = reader.nextInt();

                        //Operacion
                        switch (operacion) {
                            case 1 -> {
                                // hacemos un ingreso en la cuenta
                                System.out.print("Cantidad depositar: ");
                                double deposito = reader.nextDouble();
                                CuentaInversion1.deposito(deposito);
                                // break es opcional
                            }
                            case 2 -> {
                                // hacemos un ingreso en la cuenta
                                System.out.print("Cantidad a retirar: ");
                                double retiro = reader.nextDouble();
                                System.out.print("Ingrese su cedula: ");
                                int c = reader.nextInt();
                                CuentaInversion1.retiro(retiro, c);
                                // break es opcional
                            }
                            case 3 -> {
                                double cantidad = CuentaInversion1.getSaldo();
                                System.out.print("Cantidad a retirar: \n" + cantidad + "\n");
                                System.out.print("Ingrese su cedula: ");
                                int c = reader.nextInt();
                                CuentaInversion1.cancelarCuenta(cantidad, c);
                                // break es opcional
                            }
                            default -> {
                                System.out.print("Elija una opcion valida \n");
                                eleccionCorrecta = true;
                            }
                        }
                        // declaracion case
                        // los valores deben ser del mismo tipo de la expresion

                        System.out.println("-------------------------------------------------");
                        // Consultamos el saldo de nuevo
                        totalCuenta = CuentaInversion1.getSaldo();
                        System.out.println("Total actual en la cuenta: " + totalCuenta + " pesos");
                    }
                }
                case 3 -> {
                    //Crear el empleado
                    Empleado Empleado1;
                    Empleado1 = new Empleado(0, "0", "0", 0, "");
                    System.out.print("Nombres empleado: ");
                    String nombres = reader.next();
                    Empleado1.setNombres(nombres);
                    System.out.print("Apellidos empleado: ");
                    String apellidos = reader.next();
                    Empleado1.setApellidos(apellidos);
                    System.out.print("Cedula del empleado: ");
                    int cedula = reader.nextInt();
                    Empleado1.setCedula(cedula);
                    System.out.print("Cargo: ");
                    String cargo = reader.next();
                    Empleado1.setCargo(cargo);
                    System.out.print("Años de antigüedad: ");
                    int antiguedad = reader.nextInt();
                    Empleado1.setAniosAntiguedadEmpleado(antiguedad);
                    Empleado1.diasVacaciones(Empleado1.getAniosAntiguedadEmpleado());
                }
                default -> {
                    System.out.print("Elija una opcion valida \n");
                    eleccionCorrecta = true;
                }
            }

        }
        reader.close();
    }
}

public class Persona {

    String nombres;
    String apellidos;
    int cedula;

    public Persona(String n, String a, int c) {
        nombres = n;
        apellidos = a;
        cedula = c;
    }

    public void setNombres(String n) {
        nombres = n;
    }

    public void setApellidos(String a) {
        apellidos = a;
    }

    public void setCedula(int c) {
        cedula = c;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCedula() {
        return cedula;
    }
    
    
}
public class Cliente extends Persona {

    private int numeroCliente;

    public Cliente(int cedula, String nombres, String apellidos, int numero) {
        super(nombres, apellidos, cedula);
        numeroCliente = numero;
    }

    public boolean Identificacion(int c) {
        return cedula == c;
    }

    public void setNumeroCliente(int n) {
        numeroCliente = n;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }
}
public class Cuenta extends Cliente {

    private int numeroCuenta;
    protected double saldo;
    private double porcentajeAhorroAnual;

    public Cuenta(int cedula, String nombres, String apellidos, int numero, double inicial, double porcentaje) {
        super(cedula, nombres, apellidos, numero);
        saldo = inicial;
        porcentajeAhorroAnual = porcentaje;
    }

    public void deposito(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Se depositan en la cuenta: " + cantidad + " pesos");
    }

    public void retiro(double cantidad, int c) {
        if (Identificacion(c)) {
            if (puedoSacar(cantidad)) {
                saldo = saldo - cantidad;
                System.out.println("Se retiran de la cuenta " + cantidad + " pesos");
            } else {
                System.out.println("Saldo"+saldo+"retiro"+cantidad);
                System.out.println("Su saldo es insuficiente para ese retiro");
            }
        } else {
            System.out.println("Usted no es cliente, no puede hacer el retiro");
        }
    }

    public boolean puedoSacar(double cantidad) {
        return (saldo >= 500) & (saldo - cantidad >= 500);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numero) {
        numeroCuenta = numero;
    }

    public void setInicial(double inicial) {
        if (verificarInicial(inicial)) {
            saldo = inicial;
        }
    }

    public boolean verificarInicial(double inicial) {
        return inicial == 1000;
    }

    public void setPorcentajeAhorroAnual(double porcentaje) {
        porcentajeAhorroAnual = porcentaje;
    }

    public double incrementarSaldo() {
        return saldo = saldo + porcentajeAhorroAnual * saldo;
    }
}

public class CuentaInversion extends Cuenta {

    //private double saldo;
    //private double porcentajeAhorroAnual;
    public CuentaInversion(int cedula, String nombres, String apellidos, int numero, double inicial, double porcentaje) {
        super(cedula, nombres, apellidos, numero, inicial, porcentaje);
    }

    @Override
    public boolean puedoSacar(double cantidad) {
        return (saldo >= 10000) & (saldo - cantidad >= 10000);
    }

    @Override
    public boolean verificarInicial(double inicial) {
        return inicial == 25000;
    }

    public void cancelarCuenta(double cantidad, int c) {
        System.out.println("Cantidad" + cantidad + " Saldo" + saldo);
        if (Identificacion(c)) {
            saldo = saldo - cantidad;
            System.out.println("Se retiran de la cuenta " + cantidad + " pesos");
        }
    }
}
import java.util.Arrays;

public class Empleado extends Persona {

    // instance variables - replace the example below with your own
    private int aniosAntiguedadEmpleado;
    public String cargoEmpleado;
    private int diasVacacionesEmpleado;
    private double salario;
    private String[] arrayCargos = {"cajero", "supervisor", "recepcionista"};

    public Empleado(int cedula, String nombres, String apellidos, int antiguedad, String cargo) {
        super(nombres, apellidos, cedula);
        aniosAntiguedadEmpleado = antiguedad;
        cargoEmpleado = cargo;
    }

    public int getAniosAntiguedadEmpleado() {
        return aniosAntiguedadEmpleado;
    }

    public void diasVacaciones(int antiguedad) {
        diasVacacionesEmpleado = 0;
        aniosAntiguedadEmpleado = antiguedad;
        if (aniosAntiguedadEmpleado <= 1) {
            diasVacacionesEmpleado = 0;
        } else if (aniosAntiguedadEmpleado == 1) {
            diasVacacionesEmpleado = 5;
        } else if (aniosAntiguedadEmpleado <= 8) {
            diasVacacionesEmpleado = (aniosAntiguedadEmpleado - 1) * 2 + 5;
        } else {
            diasVacacionesEmpleado = 20;
        }
        //return diasVacacionesEmpleado;
        System.out.println("El empleado " + nombres + " " + apellidos + " tiene " + diasVacacionesEmpleado + " dias de vacaciones");
    }

    public void setCargo(String cargo) {
        if (validarCargo(cargo)) {
            cargoEmpleado = cargo;
        } else {
            System.out.println("Ese no es un cargo valido");
        }
    }

    public String getCargo() {
        return cargoEmpleado;
    }

    public void setAniosAntiguedadEmpleado(int antiguedad) {
        aniosAntiguedadEmpleado = antiguedad;
    }

    public boolean validarCargo(String cargo) {
        return Arrays.asList(arrayCargos).contains(cargo);
    }
    
    public void Salario(double s){
        salario=s;
    }
}

