package cap5;

import java.util.*;

public class ArrayOrdena {
    public static void main (String args[]){
        
        String[] nomes = {"Lucas", "Daniel", "Julia", "Tatiana", "Izabela", "Matheus"};
        char[] vogais = {'i', 'u', 'a', 'o', 'e'};
        int[] numeros = {9,2,6,7,5,3,4,8,1,0};
        float[] notas = {7.6f, 8.5f, 9.7f, 5.4f, 7.4f};
        
        Arrays.sort(nomes);
        System.out.println("\nNomes: ");
        for (String nome: nomes){
            System.out.println(nome+", ");
        }
        
        Arrays.sort(vogais);
        System.out.println("\nVogais: ");
        for (char vogal: vogais){
            System.out.println(vogal+", ");
        }
        
        Arrays.sort(numeros);
        System.out.println("\nNumeros: ");
        for (int numero: numeros){
            System.out.println(numero+", ");
        }
        
        Arrays.sort(notas);
        System.out.println("\nNotas: ");
        for (float nota: notas){
            System.out.println(nota+", ");
        }
        System.exit(0);
    }
}
