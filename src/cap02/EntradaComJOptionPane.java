/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap02;

import javax.swing.JOptionPane;

public class EntradaComJOptionPane {
    public static void main(String args[]){
       String aux;
       float largura, comprimento, area, perimetro;
       
       try{
           aux = JOptionPane.showInputDialog("Entre com o comprimento");
           comprimento = Float.parseFloat(aux);
           
           aux = JOptionPane.showInputDialog("Entre com a largura");
           largura = Float.parseFloat(aux);
           
           area = comprimento * largura;
           perimetro = comprimento * 2 + largura * 2;
           
           JOptionPane.showMessageDialog(null, "Área : " + area + ", Perímetro: " + perimetro);
         } catch (NumberFormatException erro){
             JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numérios" +  erro.toString());
         }
       System.exit(0);
       
    }
    
}
