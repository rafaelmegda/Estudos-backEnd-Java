/* Exercicio sobre Vetores
. Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas
notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente
(da maior para a menor) e a média aritmética das notas.
*/

package cap5;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ExOrdenarVetor {
    public static void main (String args[]){
        
        Integer [] notas = new Integer[5];
        int valorNota = 0;
        int soma = 0;
        float media = 0;
        
        for (int i = 0; i < notas.length; i++){
                valorNota = Integer.parseInt(JOptionPane.showInputDialog("Digite as notas uma de cada vez"));
                notas[i] = valorNota; 
                soma += notas[i]; //somando os valores do elemtos do vetor notas.
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
       
       //achando a média das notas
       media = soma / notas.length;
       
       System.out.println("\nMedia: ");
       System.out.println(media);
    }
}
