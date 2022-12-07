/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhadi;

/**
 *
 * @author Nathany
 */
public class pilhae {
     celula top;

    void push(char caracter){
        celula novaCelula = new celula();
        novaCelula.setDado(caracter);
        novaCelula.setAnterior(this.top);
        this.top = novaCelula;
    }
    
    void pop(){
        if(!isEmpty()){
            this.top = this.top.getAnterior();
        }else{
            System.out.println("Pilha vazia!!!");
        }
    }
    
    boolean isEmpty(){
        if(this.top == null){
            return true;
        }else{
            return false;
        }
    }

    char top(){
        if(isEmpty()){
            System.out.println("Pilha vazia!!!");
        }
        return this.top.getDado();
    }
    
    void verifica(String expressao){
        pilhae pilhaDinamica = new pilhae();
        
        for(int i = 0; i < expressao.length(); i++){
            if(expressao.charAt(i) == '(' || expressao.charAt(i) == '[' || expressao.charAt(i) == '{'){
                pilhaDinamica.push(expressao.charAt(i));
            }else if(expressao.charAt(i) == ')' || expressao.charAt(i) == ']' || expressao.charAt(i) == '}'){
                if(pilhaDinamica.isEmpty() == true){
                    System.out.println("Parametrização incorreta: " + expressao);
                    return;
                }else if(pilhaDinamica.top() == '(' && expressao.charAt(i) == ')'){
                    pilhaDinamica.pop();
                }else if(pilhaDinamica.top() =='[' && expressao.charAt(i) == ']'){
                    pilhaDinamica.pop();
                }else if(pilhaDinamica.top() == '{' && expressao.charAt(i) == '}'){
                    pilhaDinamica.pop();
                }
            }
        }
        
        if(pilhaDinamica.isEmpty() == true){
            System.out.println("Parametrização correta: " + expressao);
        }else{
            System.out.println("Parametrização incorreta: " + expressao);
        }
    } 
}
