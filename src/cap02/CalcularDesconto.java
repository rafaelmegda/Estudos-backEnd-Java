/*
Usando a classe BufferedReader para entrada de dados, crie uma classe que receba o valor de um
produto e a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto
com o desconto. 
Observação: o valor do desconto é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100.
*/
package cap02;

import java.io.*;

public class CalcularDesconto {
    public static void main(String args[]){
        String aux;
        float valor, porcentagem, totalDesconto, novoValorProduto;        
        BufferedReader desconto;
        
        try{
            System.out.println("Digite o valor do produto");
            desconto = new BufferedReader(new InputStreamReader (System.in));
            aux = desconto.readLine();
            valor = Float.parseFloat(aux);
            
            System.out.println("Digite a porcentagem de desconto");
            desconto = new BufferedReader(new InputStreamReader (System.in));
            aux = desconto.readLine();
            porcentagem = Float.parseFloat(aux);
            
            totalDesconto = (valor * porcentagem) / 100;
            novoValorProduto = (valor - totalDesconto);
            System.out.println("Valor do Desconto: " + totalDesconto );
            System.out.println("Valor do produto com desconto: " + (novoValorProduto));
        }catch (IOException erro){
            System.out.println("Houve erro na entrada de dados" + erro.toString());  
        } catch (NumberFormatException erro){
            System.out.println("Houve erro na conversão, digite apenas caracteres numericos" +
                    erro.toString());
        }
    }
}
