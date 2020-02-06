/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap02;

/**
 *
 * @author rafae
 */
public class OperadoresAritmeticos {
    public static void main (String args[]){
        //declaracao e inicializacao de variaveis
        int x = 10;
        int y = 3;
        //Varias operacoes com as variaveis
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("-X = " + (-x));
        System.out.println("X/Y = " + (x / y));
        System.out.println("Resto de X por Y  = " + (x % y)); //resulta 1
        System.out.println("Inteiro de X por Y = " + (int) (x/y)); //resulta 3
        System.out.println("X + 1 = " + (++x)); //resulta 11
    }
    
}
