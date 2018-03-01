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
public class Automovil {
    
    // Atributos
    
    private String marca;
    private int annio;
    private String modelo;
    
    //relaciones
    private Llanta[] llanta;
    private Puerta[] puerta;
    private Motor motor;

    public Automovil(String marca, int annio, String modelo,
            Llanta[] llanta, Puerta[] puerta, Motor motor) {
        this.marca = marca;
        this.annio = annio;
        this.modelo = modelo;
        this.llanta = llanta;
        this.puerta = puerta;
        this.motor = motor;
    }

    public Llanta[] getLlanta (){
        return this.llanta;
    }    
    public boolean addLlanta(Llanta llanta){
       int posVacio = -1;
       for (int i = 0; i < 20; i++) {
          if(this.llanta[i] == null){
            posVacio = i;
            break;
          }     
       }
       if(posVacio != -1){
         this.llanta[posVacio] = llanta;
         return true;
       }
       else return false;
    }    
    public boolean removeLlanta(Llanta llanta){
        
        return false;
    }  
    public boolean replaceLlanta (){
        return false;
    }

    
    
    public Puerta[] getPuerta() {
        return this.puerta;
    }    
    public boolean addPuerta(Puerta puerta){
       int posVacio = -1;
       for (int i = 0; i < 20; i++) {
          if(this.puerta[i] == null){
            posVacio = i;
            break;
          }     
       }
       if(posVacio != -1){
         this.puerta[posVacio] = puerta;
         return true;
       }
       else return false;
    }    
    public boolean removePuerta(Puerta puerta){
        
        return false;
    }    
    public boolean replacePuerta (){
        return false;
    }
    
    
        public Motor getMotor (){
        return motor;
    }    
    public boolean addPuerta(Llanta llanta){
       int posVacio = -1;
       for (int i = 0; i < 20; i++) {
          if(this.llanta[i] == null){
            posVacio = i;
            break;
          }     
       }
       if(posVacio != -1){
         this.llanta[posVacio] = llanta;
         return true;
       }
       else return false;
    }    
    public boolean removeMotor(Motor motor){
        
        return false;
    }  
    public boolean replaceMotor (){
        return false;
    }
     
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
