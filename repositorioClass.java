
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class repositorioClass {

   
    public static void main(String[] args) {
        String passwordd;
        String passwordTree;
        String passwordLinked;
        
         Scanner teclado = new Scanner (System.in);
        int n;
       Map<Integer, String> map = new HashMap<Integer, String>();
map.put(1, "Pedro");		map.put(15, "Andrew");
map.put(3, "Juan");		map.put(5, "Jahaziel");
map.put(11, "Fulano");	        map.put(6, "Norman");
map.put(18, "Pedrito");            
map.put(7, "Juansito");

// Imprimimos el Map con un Iterador
Iterator it = map.keySet().iterator();
while(it.hasNext()){
  Integer key = (Integer) it.next();
  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
     System.out.println("Digite un nombre a evaluar: ");
        passwordd=teclado.nextLine();
        if (map.containsValue(passwordd)){
            System.out.println("Es identica");
        }else{
            System.out.println("No es identica");
        }
}
       


        System.out.println("Imprimiendo estructura de forma treeMap");
Map<Integer, String> treeMap = new TreeMap<Integer, String>();
treeMap.put(1, "Pedro");	treeMap.put(15, "Andrew");
treeMap.put(3, "Juan");		treeMap.put(5, "Jahaziel");
treeMap.put(11, "Fulano");	        treeMap.put(6, "Norman");
treeMap.put(18, "Pedrito");            
treeMap.put(7, "Juansito");

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
it = treeMap.keySet().iterator();
while(it.hasNext()){
  Integer key = (Integer) it.next();
  System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
   System.out.println("Digite un nombre a evaluar: ");
        passwordTree=teclado.nextLine();
        if (map.containsValue(passwordTree)){
            System.out.println("Es identica");
        }else{
            System.out.println("No es identica");
        }
        System.out.println("Imprimiendo estructura como LinkedHashMap");
}

Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
linkedHashMap.put(1, "Pedro");		linkedHashMap.put(5, "Jahaziel");
linkedHashMap.put(3, "Juan");		linkedHashMap.put(5, "Andrew");
linkedHashMap.put(11, "Fulano");	linkedHashMap.put(6, "Norman");
linkedHashMap.put(18, "Pedrito");            
linkedHashMap.put(7, "Juansito");

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
it = linkedHashMap.keySet().iterator();
while(it.hasNext()){
  Integer key = (Integer) it.next();
  System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
  System.out.println("Digite un nombre a evaluar: ");
        passwordLinked=teclado.nextLine();
        if (map.containsValue(passwordLinked)){
            System.out.println("Es identica");
        }else{
            System.out.println("No es identica");
        }
}

        }
    }
    

