/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoCarro.vista;

import edu.unal.poo.conjuntoCarro.modelo.Automovil;
import edu.unal.poo.conjuntoCarro.modelo.Llanta;
import edu.unal.poo.conjuntoCarro.modelo.Motor;
import edu.unal.poo.conjuntoCarro.modelo.Puerta;

import java.util.Scanner;
        

/**
 *
 * @author Estudiante
 */
public class PruebaCarro {
    public static void main(String [] args){
        
        Motor motor = new Motor("0172", 8);
        motor.setNumeroserie("12");
        
        Llanta L1 = new Llanta();
        L1.setModelo("12");
        
        Puerta puerta = new Puerta("estandar");
        
        Automovil auto = new Automovil ("Renault", 2007, "Sandero", L1, puerta, motor);
        auto.addPuerta(puerta);
        
        auto.addLlanta(L1);
        auto.replaceMotor(motor);
        
    }
            
}
