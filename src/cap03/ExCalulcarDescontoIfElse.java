/* EXERCICIO
 Usando JOptionPane, elabore uma classe que receba o nome de um produto e o seu valor. 
O desconto deve ser calculado de acordo com o valor fornecido conforme a Tabela 3.1.
Utilizando a estrutura if-else, apresente em tela o nome do produto, valor original do produto e o novo valor depois de
ser realizado o desconto. Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso. 
A Figura 3.16 ilustra a execução do Exercício 3.1.
 */
package cap03;

import javax.swing.JOptionPane;

public class ExCalulcarDescontoIfElse {
    public static void main(String args[]){
        try {
            String nome = JOptionPane.showInputDialog("Forneça o nome do produto");
            String aux = JOptionPane.showInputDialog("Digite o valor do produto");
            float valor = Float.parseFloat(aux);
            float valorDesconto;
            
            if (valor <= 0){
                throw new Exception ();
            }else if (valor >= 50 && valor <200){
                valorDesconto = (valor * 5) / 100;
                valorDesconto = valor - valorDesconto;
                JOptionPane.showMessageDialog(null,"Produto: " + nome + "\nValor original: " + valor + "\nValor com desconto: " + valorDesconto);
            }else if (valor >= 200 && valor <500){
                valorDesconto = (valor * 6) / 100;
                valorDesconto = valor - valorDesconto;
                JOptionPane.showMessageDialog(null,"Produto: " + nome + "\nValor original: " + valor + "\nValor com desconto: " + valorDesconto);
            }else if (valor >= 500 && valor <1000){
                valorDesconto = (valor * 7) / 100;
                valorDesconto = valor - valorDesconto;
                JOptionPane.showMessageDialog(null,"Produto: " + nome + "\nValor original: " + valor + "\nValor com desconto: " + valorDesconto);
            }else if (valor >= 1000){
                valorDesconto = (valor * 8) / 100;
                valorDesconto = valor - valorDesconto;
                JOptionPane.showMessageDialog(null,"Produto: " + nome + "\nValor original: " + valor + "\nValor com desconto: " + valorDesconto);
            }  
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro de conversão e/ou cálculo!\n" +e.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "O valor digitado não pode ser zero ou menor que zero!\n" + e.toString());
        }  
    }
}
