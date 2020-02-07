/*Exercicio
Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de
duas provas e de um trabalho. Calcule e mostre a média e o resultado final (aprovado ou reprovado). 
Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota da prova 2 +
nota do trabalho) / 3. Considere que a média mínima para aprovação é 6.
 */
package cap02;

import javax.swing.JOptionPane;

public class ExCalcularNotaEReprova {
    public static void main(String args[]){
        String aux;
        
        float nota1, nota2, notaTrabalho, mediaFinal;
        
        try{
            aux = JOptionPane.showInputDialog("Entre com a nota da prova 1");
            nota1 = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com a nota da prova 2");
            nota2 = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com a nota do trabalho");
            notaTrabalho = Float.parseFloat(aux);
            
            mediaFinal = (nota1 + nota2 + notaTrabalho) / 3;
            
            if (mediaFinal < 6){
                JOptionPane.showMessageDialog(null, "Aluno reprovado! Média final: " + mediaFinal);
            }else{
                JOptionPane.showMessageDialog(null, "Aluno Aprovado! Média final: " + mediaFinal);
            }
        }catch (NumberFormatException erro){
            JOptionPane.showConfirmDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos" + 
                    erro.toString());
        }                             
    }
}
