/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

/**
 *
 * @author UriDrack7
 */
public class Mensajito {
    
    private String titulo;
    private String Cuerpo;

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
    }
    
}
