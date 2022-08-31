/**
 *
 * @author kauas
 */
package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String> listNome = new ArrayList<>();
        
        listNome.add("Vitor");
        listNome.add("Camila");
        listNome.add("Igor");
        listNome.add("Emily");
        listNome.add("Anna");
        listNome.add("Luis");
        
        System.out.println(listNome);
        // [Vitor, Camila, Igor, Emily, Anna, Luis]
        
        listNome.set(2, "Júlia");
        
        System.out.println(listNome);
        // [Vitor, Camila, Júlia, Emily, Anna, Luis]
        
        Collections.sort(listNome);   
        
        System.out.println(listNome);
        // [Anna, Camila, Emily, Júlia, Luis, Vitor]
        
        listNome.set(2, "Otávio");    
        
        System.out.println(listNome);
        // [Anna, Camila, Otávio, Júlia, Luis, Vitor]
        
        listNome.remove(4);
        
        System.out.println(listNome);
        // [Anna, Camila, Otávio, Júlia, Vitor]
        
        listNome.remove("Otávio");
        
        System.out.println(listNome);
        // [Anna, Camila, Júlia, Vitor]
        
        String nome = listNome.get(3);
        
        System.out.println(nome);
        // Vitor
        
        int posicao = listNome.indexOf("Camila");
        
        System.out.println(posicao);
        // 1
        
        posicao = listNome.indexOf("Melissa");
        
        System.out.println(posicao);
        
        int tamanho = listNome.size();
        
        System.out.println(tamanho);
        // 4
        
        boolean verificaNome = listNome.contains("Anna");
        
        System.out.println(verificaNome);
        // true
        
        verificaNome = listNome.contains("Lavinia");
        
        System.out.println(verificaNome);
        // false
        
        for (String nomeItem : listNome) {
            System.out.println("-> "+nomeItem);
        }
        
        Iterator<String> iterator = listNome.iterator();
        while (iterator.hasNext()) {
            System.out.println("--> "+iterator.next());
        }
        
        boolean listaVazia = listNome.isEmpty();
        
        System.out.println(listaVazia);
        // false
        
        listNome.clear();    
        listaVazia = listNome.isEmpty();
        
        System.out.println(listaVazia);
        // true
        
        
    }
    
}
