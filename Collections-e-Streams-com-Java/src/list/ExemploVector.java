/**
 *
 * @author kauas
 */
package list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    
    public static void main(String[] args) {
        List<String> listEsporte = new Vector<>();
        
        listEsporte.add("Volei");
        listEsporte.add("Basquete");
        listEsporte.add("Automobilismo");
        listEsporte.add("Futebol");
        
        System.out.println(listEsporte);
        
        listEsporte.set(2, "Judô");
        
        listEsporte.remove(2);
        listEsporte.remove("Futebol");
        
        System.out.println(listEsporte);
        
        System.out.println(listEsporte.get(0));
        
        for (String esporte : listEsporte) {
            System.out.println(esporte);
        }
    }
}
