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
public class ConversaoDeTipos {
    public static void main (String args[]){
        String s1 = "10";
        int v = Integer.parseInt(s1);
        float x = Float.parseFloat(s1);
        double y = Double.parseDouble(s1);
        int w = (int) x;
        int z = (int) y;
        String s2 = String.valueOf(v);
        System.out.println(s2 + w + z);
    }
    
}
