/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilhadi;
import javax.swing.JOptionPane;
/**
 *
 * @author Nathany
 */
public class Pilhadi {

    public static void main(String[] args) {
        String expressao;
    pilhae pilhaDinamica = new pilhae();
    expressao = JOptionPane.showInputDialog("entre com a expressão:");
    pilhaDinamica.verifica(expressao);
    }
}
