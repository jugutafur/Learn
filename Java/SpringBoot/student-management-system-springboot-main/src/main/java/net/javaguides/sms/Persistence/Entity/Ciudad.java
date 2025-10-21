package net.javaguides.sms.Persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombreciudad")
    private String nombreCiudad;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombreCiudad() {return nombreCiudad;}
    public void setNombreCiudad(String nombreCiudad) {this.nombreCiudad = nombreCiudad;}
}
