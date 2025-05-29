
package ed_212_aula10_fila;


public class ED_212_Aula10_Fila {

    public static void main(String[] args) {
       
        Fila_v2 f2 = new Fila_v2(5);
        
        f2.ENQUEUE(10);f2.ENQUEUE(20);f2.ENQUEUE(30);f2.ENQUEUE(40);f2.ENQUEUE(50);
        f2.DEQUEUE();  f2.DEQUEUE(); f2.ENQUEUE(60);
        System.out.println("f: "+f2.imprimeFila());
        f2.duplicaTamanhoFila();
        
        System.out.println("f: "+f2.imprimeFila());
        System.out.println("Vazia?: "+f2.isFilaVazia());
        System.out.println("Cheia?: "+f2.isFilaCheia());
        
        
        
        /*
        Fila   f = new Fila (5);
        
        System.out.println("f: "+f.imprimeFila());
        System.out.println("Vazia?: "+f.isFilaVazia());
        System.out.println("Cheia?: "+f.isFilaCheia());
        
        f.ENQUEUE("primeiro");
        f.ENQUEUE("SEGUNDO");
        f.ENQUEUE("3o");
        f.ENQUEUE("4o");
        f.ENQUEUE("5o");
        
        System.out.println("f: "+f.imprimeFila());
        System.out.println("Vazia?: "+f.isFilaVazia());
        System.out.println("Cheia?: "+f.isFilaCheia());
        System.out.println("PEEK: "+f.PEEK());
        System.out.println("TAIL: "+f.TAIL());
        System.out.println("pos PEEK: "+f.getPosicaoPEEK());
        System.out.println("pos TAIL: "+f.getPosicaoTAIL());
        
        System.out.println("DEQUEU "+f.DEQUEUE());
        System.out.println("DEQUEU "+f.DEQUEUE());
        System.out.println("DEQUEU "+f.DEQUEUE());
        f.ENQUEUE("XX");
        f.ENQUEUE("YY");
        System.out.println("f: "+f.imprimeFila());
        System.out.println("Vazia?: "+f.isFilaVazia());
        System.out.println("Cheia?: "+f.isFilaCheia());
        System.out.println("PEEK: "+f.PEEK());
        System.out.println("TAIL: "+f.TAIL());
        System.out.println("pos PEEK: "+f.getPosicaoPEEK());
        System.out.println("pos TAIL: "+f.getPosicaoTAIL());
        */
        
        
    }
    
}
