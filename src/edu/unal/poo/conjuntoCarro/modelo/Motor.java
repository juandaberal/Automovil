/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoCarro.modelo;

/**
 *
 * @author Estudiante
 */
public class Motor {
    
    private String numeroserie;
    private int cilindros;

    public Motor(String numeroserie, int cilindros) {
        this.numeroserie = numeroserie;
        this.cilindros = cilindros;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }
    

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    
}
