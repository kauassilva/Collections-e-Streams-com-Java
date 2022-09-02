/**
 *
 * @author kauas
 */

/**
 * Crie uma fila;
 * Adicione 5 nomes;
 * Navegue na fila exibindo cada nome;
 * Retorne o primeiro item da fila, sem removê-lo;
 * Retorne o primeiro item da fila, removendo o mesmo;
 * Adicione um novo nome. E verifique a posição que o mesmo assumiu na fila;
 * Retorne o tamanho da fila;
 * Verifique se a fila está vazia;
 * Verifique se um nome está na lista.
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExemploFinal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Queue<String> filaPessoa = new LinkedList<>();
        
        // Adicionar 5 nomes
        for (int i=1; i<=5; i++) {
            System.out.print("Digite um nome na fila: ");
            filaPessoa.add(entrada.nextLine());
        }  
        
        // Exibir os nomes
        System.out.println();
        for (String pessoa : filaPessoa) {
            System.out.println(pessoa);
        }
        
        // Exibir o nome, sem remove-lo
        System.out.println("\n"+filaPessoa.peek());
        System.out.println("\n"+filaPessoa);
        
        // Exibir o nome, removendo o mesmo
        System.out.println("\n"+filaPessoa.poll());
        System.out.println("\n"+filaPessoa);
        
        // Adicionar mais um nome
        System.out.print("\nDigite mais um nome para fila: ");
        filaPessoa.add(entrada.nextLine());
        
        System.out.println("\n"+filaPessoa);
        
        // Tamanho da fila
        System.out.println("\n"+filaPessoa.size());
        
        // Verificar se a fila está vazia
        System.out.println("\n"+filaPessoa.isEmpty());
        
        // Verificar se o nome existe na fila
        System.out.print("\nDigite um nome para verificar se o mesmo existe na fila: ");
        String nome = entrada.nextLine();
        
        System.out.println("\n"+filaPessoa.contains(nome));
    }
}
