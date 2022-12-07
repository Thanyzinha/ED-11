/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhadi;

/**
 *
 * @author Nathany
 */
public class celula {
    char caracter;
    celula anterior;
    
    celula(){
    }
    
    public celula(char caracter, celula anterior){
        this.caracter = caracter;
        this.anterior = anterior;
    }
    
    char getDado(){
        return this.caracter;
    }
    
    void setDado(char caracter){
        this.caracter = caracter;
    }

    celula getAnterior() {
        return this.anterior;
    }

    void setAnterior(celula anterior) {
        this.anterior = anterior;
    }
}
