/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap02;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author rafae
 */
public class EntradaComDataInputStream {
    public static void main (String args[]){
        String s;
        float largura, comprimento, area, perimetro;
        DataInputStream dado; // criando um objeto dado
        
        try{
            System.out.println("Entre com o comprimento");
            dado = new DataInputStream(System.in);
            s = dado.readLine(); //deprecated
            comprimento = Float.parseFloat(s);
            
            System.out.println("Entre com a Largura");
            dado = new DataInputStream(System.in);
            s = dado.readLine(); //deprecated
            largura = Float.parseFloat(s);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            
            System.out.println("Área do retângulo : " + area);
            System.out.println("Perímetro do retângulo : " + perimetro);
        }catch (IOException erro){
            System.out.println("Houve erro na entrada de dados" + erro.toString());
        }catch (NumberFormatException erro){
            System.out.println("Houve erro na conversão, digite apenas caracteres numéricos" 
            + erro.toString());
        }
    }
}
