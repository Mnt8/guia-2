/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.pkg9.g2;

import javax.swing.JOptionPane;

/**
 *
 * @author fabya
 */
public class Ej9G2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos como constante por lo que dividir
        final int DIVISOR=23;
 
        //Insertamos el RUN
        String texto=JOptionPane.showInputDialog("Escribe los numero de tu DNI");
        int dni=Integer.parseInt(texto);
 
        //Sacamos el resto
        int res=dni%DIVISOR;
 
        //Invocamos el metodo
        char letra=letraNIF(res);
 
        //Mostramos el RUN completo
        System.out.println("Tu DNI es " +dni+letra);
 
    }
    public static char letraNIF(int res){
 
        //Definimos el array de char
        char letrasNIF[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                          'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                          'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        //Devolvemos el valor en la posicion del array
        return letrasNIF[res];
    }
    
}
