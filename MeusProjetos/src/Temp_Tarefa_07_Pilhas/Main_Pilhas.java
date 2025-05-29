
package Temp_Tarefa_07_Pilhas;



public class Main_Pilhas {
    public static void main(String[] args) {
        
            
        Pilha p1 = new Pilha(7);
        Pilha_C pc = new Pilha_C(5);
        Pilha_Y py = new Pilha_Y(5);
                       
        // Imprimir as Pilhas vazias
        System.out.println("Pilha = " + p1.imprimePilha());
        System.out.println("");
        
        System.out.println("Pilha C = " + pc.imprimePilha());
        System.out.println("");
        
        System.out.println("Pilha y = " + py.imprimePilha());
        System.out.println("");
        
        // Métodoa de Push e Pop
        
        pc.Push(1); pc.Push(2); pc.Push(3); pc.Push(4); pc.Push(5); 
        pc.Push(6); pc.Push(7);
        
        py.Push(10);
        
               
        
       
        
        System.out.println("Pilha = " + p1.imprimePilha());
        System.out.println("");
        
        System.out.println("Pilha C = " + pc.imprimePilha());
        System.out.println("");
        
        System.out.println("Pilha y = " + py.imprimePilha());
        System.out.println("");
        
        int c = (int) pc.Peek();
        int y = (int) py.Peek();
        int soma = c + y;
        
        System.out.println("Soma Pilha C e Y ");
        System.out.println("Soma Pilha "+ c + " + "+ y +" = " + soma);
        
        System.out.println("");
            
        
        
        //System.out.println(p1.imprimePilha());
    }
}
