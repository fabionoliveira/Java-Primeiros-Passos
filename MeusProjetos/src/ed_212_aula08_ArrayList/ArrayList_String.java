
package ed_212_aula08_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArrayList_String {

    
    public static void main(String[] args) {
        
        
        String  ex [] = new String [10];
        
        ArrayList<String> myAL = new ArrayList();
        
        System.out.println("ArryList vazia?" + myAL.isEmpty());
        
        myAL.add("Janeiro");
        myAL.add("Janeiro");
        myAL.add("Fevereiro");
        myAL.add("Março");
        myAL.add("Maio");
        myAL.add("Junho");
        myAL.add("Julho");
        myAL.add(3,"Abril");
        myAL.add("Abril");
       
                 
        System.out.println(myAL);
        System.out.println("\nTamanho ArrayList " + myAL.size());
        System.out.println("\nArryList vazia?" + myAL.isEmpty());
        
        for (int i=0;i<myAL.size();i++) {
            System.out.println("myAL["+i+"]"+myAL.get(i));
        }
        
      
        myAL.remove(1);
        System.out.println(myAL);
        System.out.println("\nTamanho ArrayList " + myAL.size());
       
        //myAL.clear();
        
        System.out.println(myAL);
        System.out.println("\nTamanho ArrayList " + myAL.size());
        
        
        System.out.println("Tem Abril? "+myAL.contains("Abril"));
        System.out.println("qual o indice Abril? "+myAL.indexOf("Abril"));
        System.out.println("qual último indice Abril? "+myAL.lastIndexOf("Abril"));
        
        
        
        System.out.println("======");
        //myAL.toArray(ex);
        
        System.out.println(ex);
        System.out.println(Arrays.toString(ex));
        
        
    }
    
}
