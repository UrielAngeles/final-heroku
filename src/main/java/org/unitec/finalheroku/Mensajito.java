/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.data.annotation.Id;

/**
 *
 * @author UriDrack7
 */
public class Mensajito {
    
    @Id
    
    private String Id;   
    private String titulo;
    private String Cuerpo;
    private LocalDate fecha;
    private LocalTime time;

    public Mensajito(String Id, String titulo, String Cuerpo) {
        this.Id = Id;
        this.titulo = titulo;
        this.Cuerpo = Cuerpo;
        fecha=LocalDate.now();
        time=LocalTime.now();
    }

    public Mensajito(String Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(String Cuerpo) {
        this.Cuerpo = Cuerpo;
    }

    public Mensajito() {
    }

    public Mensajito(String titulo, String Cuerpo) {
        this.titulo = titulo;
        this.Cuerpo = Cuerpo;
        fecha=LocalDate.now();
        time=LocalTime.now();
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    
}
