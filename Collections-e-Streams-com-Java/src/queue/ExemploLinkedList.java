/**
 *
 * @author kauas
 */
package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        
        filaBanco.add("Danilo");
        filaBanco.add("Kauã");
        filaBanco.add("Samuel");
        filaBanco.add("Bianca");
        filaBanco.add("Victor");
        
        System.out.println(filaBanco);
        
        // .poll()
        String clienteAtendido = filaBanco.poll();
        
        System.out.println("\n"+clienteAtendido);
        
        System.out.println("\n"+filaBanco);
        
        // .peek()
        String clienteAtual = filaBanco.peek();
        
        System.out.println("\n"+clienteAtual);
        
        System.out.println("\n"+filaBanco);

        // .element()
        String proximoCliente = filaBanco.element();
        
        System.out.println("\n"+proximoCliente);
        
        System.out.println("\n"+filaBanco);
        
        // .clear()
        //filaBanco.clear();
        
        // .element()
        //proximoCliente = filaBanco.element();
        
        //System.out.println("\n"+proximoCliente);
        
        System.out.println();
        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }
        
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        
        System.out.println();
        while (iteratorFilaBanco.hasNext()) {
            System.out.println(iteratorFilaBanco.next());
        }
        
        System.out.println("\n"+filaBanco.size());
        
        System.out.println("\n"+filaBanco.isEmpty());
    }
}
