/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre_86xv1vl
 */
import java.util.*;
import java.util.Scanner;

public class hashMap {
    static String password;
    /**
     * @param args the command line arguments
     */
  

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n;
       
   Map<Integer, String> map = new HashMap<Integer, String>();
map.put(1, "Andrew");		map.put(15, "Felipe");
map.put(3, "Norman");		map.put(5, "Ronaldo");
map.put(11, "Marcos");	map.put(14, "Alberto");
map.put(16, "Napoleon");	map.put(8, "Juansito");
map.put(18, "Pedrito");		map.put(6, "Doña juanita");
map.put(7, "Villa");
map.put(7, "juanito");
//li//map(3.sta 7,7,83.
// Imprimimos el Map con un Iterador

       Iterator it = map.keySet().iterator();
while(it.hasNext()){
  Integer key = (Integer) it.next();
  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
}
        System.out.println(map);
  
        System.out.println("Digite un nombre a evaluar: ");
        password= teclado.nextLine();
        if (map.containsValue(password)){
            System.out.println("Es identica");
        }else{
            System.out.println("No es identica");
        }
        
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
treeMap.put(1, "Casillas");	treeMap.put(15, "Ramos");
treeMap.put(3, "Pique");	treeMap.put(5, "Puyol");
treeMap.put(11, "Capdevila");	treeMap.put(14, "Xabi Alonso");
treeMap.put(16, "Busquets");	treeMap.put(8, "Xavi Hernandez");
treeMap.put(18, "Pedrito");	treeMap.put(6, "Iniesta");
treeMap.put(7, "Villa");

        System.out.println(treeMap);
        it =treeMap.keySet().iterator();
        while(it.hasNext()){
        Integer key= (Integer) it.next();
            System.out.println("clave: "+key+"-> Valor: "+treeMap.get(key));
            }
    


}
}
    
   
     
    
    //*digite el numero de nombres a evaluar=n  while i=n if map.value(nombre)imprimir en pantalla

   



   
    

