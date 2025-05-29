
package ed_212_aula08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ED_212_Aula08 {

    
    public static void main(String[] args) {
        
        
        ArrayList<Pessoa>  listaPessoa = new ArrayList();
        
        Pessoa  myPessoa;
        
        myPessoa = new Pessoa ();
        myPessoa.setNome("Denize");
        myPessoa.setEmail("Dezine@gmail.com");
        
        listaPessoa.add(myPessoa);
        
        
        myPessoa = new Pessoa ();
        myPessoa.setNome("Elizete");
        myPessoa.setEmail("Elizete@gmail.com");
        listaPessoa.add(myPessoa);
        
        myPessoa = new Pessoa ();
        myPessoa.setNome("Gabriel");
        myPessoa.setEmail("Gabriel@hotmail.com");
        listaPessoa.add(myPessoa);
        
        myPessoa = new Pessoa ();
        myPessoa.setNome("Fabio");
        myPessoa.setEmail("Fabio@yahoo.com");
        listaPessoa.add(myPessoa);
        
       
        for(int i=0; i<listaPessoa.size(); i++) {
            
            System.out.println(i+ " " +listaPessoa.get(i).getNome() );
            
        }
       
        
        
        
        
        
        
        
        /*
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
        
        
        myAL.toArray(ex);
        
        System.out.println(ex);
        System.out.println(Arrays.toString(ex));
        
        */
    }
    
}
