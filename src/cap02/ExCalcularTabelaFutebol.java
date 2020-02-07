/* Exercicio
Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros.
O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol. 
O segundo valor corresponde à quantidade de pontos do time lanterna. Considerando que cada vitória vale 3 pontos, 
elabore uma classe que calcule o número de vitórias necessárias para
que o time lanterna alcance (ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de
ponto fornecidas sejam 40 e 22, então o número de vitórias apresentada na saída deverá ser 6,
pois (40-22) / 3 = 6.
 */
package cap02;

import java.util.*;

public class ExCalcularTabelaFutebol {
    public static void main(String args[]){
        int pontosLider, pontosLanterna, pontosAlcancarLider;
        int pontosVitoria = 3;
        
        Scanner aux;
        
        try{
            System.out.println("Insira os pontos do lider do campeonato: ");
            aux = new Scanner(System.in);
            pontosLider = aux.nextInt();
            
            System.out.println("Insira os pontos do lanterna do campeonato: ");
            aux = new Scanner(System.in);
            pontosLanterna = aux.nextInt();
            
            pontosAlcancarLider = (pontosLider - pontosLanterna) / pontosVitoria;
            
            System.out.println("Numeros de vitórias necessárias para alcançar o lider: " + pontosAlcancarLider);
           } catch (NumberFormatException e){
               System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos");
                 }    
         }
}
