package administracion;

public class Persona {

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public void setGenero(String genero) {
        //genero=true=MASCULINO;
        //genero=false=FEMENINO;
        if (genero.equalsIgnoreCase("m")) {
            this.setgenero = true;
            getgenero = "machoman";
        } else {
            this.setgenero = false;
            getgenero = "hembrita";
        }
    }

    public String getGenero() {
        if (setgenero) {
            return "MACHO";
        } else {
            return "HEMBRA";
        }
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad - 1;
        //this.localidad=var;
    }

    public String getLocalidad() {
        return localidades[localidad];
    }

    public String getDatosPersonales() {
        return "nombre " + nombre + " edad= " + edad + " identificado " + cedula + " es " + getgenero + " residente de " + localidades[localidad];
    }

    String[] localidades = {"Usaquen", "Chapinero", "Santafe", "San Cristobal", "Usme", "Tunjuelito",
        "Bosa", "kenedy", "Fontibon", "Engativa", "Suba", " Barrios Unidos",
        "ruesaquillo", "Los Martires", "Antonio Nariño", " Puente Aranda", "La Candelaria",
        "Rafael Uribe Uribe", "Ciudad Bolivar", "Sumapaz"};

    private static String nombre;
    private static int edad;
    private int cedula;
    private boolean setgenero;
    private String getgenero;
    private int localidad;
}
