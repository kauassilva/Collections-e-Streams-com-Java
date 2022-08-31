/**
 *
 * @author kauas
 */

/**
 * Crie uma lista com 5 nomes;
 * Navegue na lista exibindo cada nome;
 * Substitua um dos nomes por outro;
 * Retorne o nome da posição 1;
 * Remova o nome da posição 4;
 * Remova um nome pelo objeto;
 * Retorne a quantidade de itens na lista;
 * Verifique se um nome existe na lista;
 * Crie uma nova lista com dois nomes;
 * Adicione todos os itens da nova lista na primeira lista;
 * Ordene os itens em ordem alfabética;
 * Verifique se a lista está vazia.
 */
package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ExemploFinal {
    
    public static void main(String[] args) {
        List<String> listNome = new ArrayList<>();
        
        listNome.add("Diego");
        listNome.add("Yasmin");
        listNome.add("Brenda");
        listNome.add("Melissa");
        listNome.add("Lara");
        
        for (String nome : listNome) {
            System.out.println(nome);
        }
        
        listNome.set(2, "Julian");
        
        System.out.println("\n"+listNome);
        
        System.out.println("\n"+listNome.get(1));
        
        listNome.remove(4);
        listNome.remove("Melissa");   
        
        System.out.println("\n"+listNome);
        
        System.out.println("\n"+listNome.size());
        
        System.out.println("\n"+listNome.contains("Vinicius"));
        
        List<String> listNome2 = new Vector<>();
        
        listNome2.add("Igor");
        listNome2.add("Clara");
        
        for (String novoNome : listNome2) {
            listNome.add(novoNome);
        }
        
        System.out.println("\n"+listNome);
        
        Collections.sort(listNome);
        
        System.out.println("\n"+listNome);
        
        System.out.println("\n"+listNome.isEmpty());
    }
}
