package cap5;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ExOrdenarVetor {
    public static void main (String args[]){
        
        Integer [] notas = new Integer[5];
        int valorNota = 0;
        
        for (int i = 0; i < notas.length; i++){
                valorNota = Integer.parseInt(JOptionPane.showInputDialog("Digite as notas uma de cada vez"));
                notas[i] = valorNota; 
        }
       
        /*usando o método sort
        Ordem Decrescente
        Substitua  int[] array = new int[10]; e Arrays.sort(array); por
        Integer[] array = new Integer[10]; e Arrays.sort(array, Collections.reverseOrder()); respectivamente.
        O motivo para tal substituição é que o Arrays.sort(T[], Comparator) só funcionará se argumento extender a classe objeto.
        */
        
       Arrays.sort(notas, Collections.reverseOrder());
       System.out.println("\nNotas: ");
       for (int nota : notas){
           System.out.print(nota+", ");
       } 
    }
}
