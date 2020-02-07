/* Exercicio
Considere a seguinte informação a respeito do cálculo da aposentadoria. Para se aposentar por idade, 
as mulheres precisam ter atingido 60 anos de idade e os homens, 65. Já na aposentadoria por
tempo de contribuição, o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os
homens. Com base nessas informações, elabore uma classe que receba a idade de uma pessoa, seu
sexo e a quantidade de anos de contribuição. A seguir, calcule a quantidade de anos que falta de 
contribuição para se aposentar, ou então emita a mensagem: “você já tem o direito a aposentadoria”

Obs: não equivalente com as regras de aposentadorias atuais.
 */
package cap02;

import javax.swing.JOptionPane;

public class ExCalculandoAposentadoria {
    public static void main(String args[]){
        String aux;
        int idade, tempoContribuicao, sexo;
        
        try{
            aux = JOptionPane.showInputDialog("Entre com sua idade");
            idade = Integer.parseInt(aux);
            
            aux = JOptionPane.showInputDialog("Entre com seu tempo de contribuição");
            tempoContribuicao = Integer.parseInt(aux);
            
            aux = JOptionPane.showInputDialog("Informe seu sexo, digite 1 para feminino ou 2 para masculino");
            sexo = Integer.parseInt(aux);
            
            if (idade > 60 && sexo == 1){
                JOptionPane.showMessageDialog(null, "Idade: " + idade + "\n" + "Sexo: " + sexo + "\n" + "tempo de contribuição: " + tempoContribuicao + "\n" +  "você já tem o direito a aposentadoria\n");
            }else if (idade > 65 && sexo == 2){
                JOptionPane.showMessageDialog(null, "Idade: " + idade + "\n" + "Sexo: " + sexo + "\n" + "tempo de contribuição: " + tempoContribuicao + "\n" +  "você já tem o direito a aposentadoria");
            }else if (idade < 60 && tempoContribuicao > 30 && sexo == 1 ){
                JOptionPane.showMessageDialog(null, "Idade: " + idade + "\n" + "Sexo: " + sexo + "\n" + "tempo de contribuição: " + tempoContribuicao + "\n" +  "você já tem o direito a aposentadoria");
            }else if (idade < 65 && tempoContribuicao > 35 && sexo == 2 ){
                JOptionPane.showMessageDialog(null, "Idade: " + idade + "\n" + "Sexo: " + sexo + "\n" + "tempo de contribuição: " + tempoContribuicao + "\n" +  "você já tem o direito a aposentadoria");
            }else
                JOptionPane.showMessageDialog(null, "Idade: " + idade + "\n" + "Sexo: " + sexo + "\n" + "tempo de contribuição: " + tempoContribuicao + "\n" + "você ainda não pode se aposentadoria\n");
        }catch (NumberFormatException erro){
             JOptionPane.showConfirmDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos" + 
                    erro.toString());
        }
    }
}
