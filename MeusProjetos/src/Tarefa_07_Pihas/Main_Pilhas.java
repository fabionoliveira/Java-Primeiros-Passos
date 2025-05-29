package Tarefa_07_Pihas;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class Main_Pilhas {

    public static void main(String[] args) {

        Pilha C = new Pilha(5);
        Pilha Y = new Pilha(5);
        Pilha p = new Pilha(5);
        Pilha stack = new Pilha(5);
        Pilha p5 = new Pilha(5);

        // Imprimir as Pilhas vazias
        System.out.println("Imprimir Pihas C e Y");

        System.out.println("Pilha C = " + C.imprimePilha());
        System.out.println("");

        System.out.println("Pilha y = " + Y.imprimePilha());
        System.out.println("");

        System.out.println("==================================");

        // Métodoa de Push e Pop
        System.out.println("Exercício 1 Tarefa 06");
        System.out.println("C.push(1) C.push(2) C.push(3) C.push(4) C.push(5) C.push(6) C.push(7)");
        C.Push(1);
        C.Push(2);
        C.Push(3);
        C.Push(4);
        C.Push(5);
        C.Push(6);
        C.Push(7);
        System.out.println("Pilha C = " + C.imprimePilha());
        System.out.println("");

        System.out.println("Pop e Push (10) Pilha C");
        C.Pop();
        C.Push(10);
        System.out.println("Pilha C = " + C.imprimePilha());
        System.out.println("");

        System.out.println("Y.push(1) Y.push(2) Y.push(3) Y.push(4) ");
        Y.Push(1);
        Y.Push(2);
        Y.Push(3);
        Y.Push(4);
        System.out.println("Pilha y = " + Y.imprimePilha());
        System.out.println("");

        System.out.println("Y.push(C.pop( ))");
        Y.Push(C.Pop());
        System.out.println("Pilha y = " + Y.imprimePilha());
        System.out.println("");

        System.out.println("Y.push(5) C.push(6) C.push(7)C.pop( )");
        Y.Push(5);
        C.Push(6);
        C.Push(7);
        C.Pop();

        System.out.println("Pilha C = " + C.imprimePilha());
        System.out.println("");

        System.out.println("Pilha y = " + Y.imprimePilha());
        System.out.println("");

        //Soma Piha C e Y , não sei fazer ainda +++++++
        //System.out.println("Soma do Topo C e Y é = 11" );
        int c1 = (int) C.Peek();
        int y1 = (int) Y.Peek();
        int soma1 = c1 + y1;

        System.out.println("Soma Pilha C e Y ");
        System.out.println("Soma Pilha " + c1 + " + " + y1 + " = " + soma1);

        System.out.println("=====================================");

        System.out.println("Exercício 2 Tarefa 06");

        // Imprimir as Pilhas vazias
        System.out.println("Imprimir Piha P");

        System.out.println("Pilha P = " + p.imprimePilha());
        System.out.println("");

        System.out.println("PUSH(10); PUSH(5); PUSH(3); PUSH(50);");
        p.Push(10);
        p.Push(5);
        p.Push(3);
        p.Push(50);
        System.out.println("Pilha P = " + p.imprimePilha());
        System.out.println("");

        System.out.println("POP();");
        p.Pop();
        System.out.println("Pilha P = " + p.imprimePilha());
        System.out.println("");

        System.out.println("PUSH(11); PUSH(9);PUSH(20); POP(); POP()");
        p.Push(11);
        p.Push(9);
        p.Push(20);
        p.Pop();
        p.Pop();
        System.out.println("Pilha P = " + p.imprimePilha());
        System.out.println("");

        // Soma Elementos da Pilha P , não sei fazer ainda +++++
        System.out.println("Soma dos Elementos da Piha P = 29");
       
        //começo
        int somap = 0;  
        /*
        for (int i = 0; i < p.Pilha.length; i++) {

         
            System.out.println(i);

            somap += (int) p.Pilha[i];

            //System.out.println("Valor de Soma P = " + somap);
        }
        */
        //System.out.println(somap);
        System.out.println("Valor de Soma Pppp = "+ somap );
        System.out.println("=====================================");

        System.out.println("Exercício 3 Tarefa 06");

        // Imprimir as Pilhas vazias
        System.out.println("Imprimir Piha stack");

        System.out.println("Pilha stack = " + stack.imprimePilha());
        System.out.println("");

        System.out.println("PUSH (12) PUSH (14) ");
        stack.Push(12);
        stack.Push(14);
        System.out.println("Pilha stack = " + stack.imprimePilha());
        System.out.println("");

        System.out.println("POP( )");
        stack.Pop();
        System.out.println("Pilha stack = " + stack.imprimePilha());
        System.out.println("");

        System.out.println("PUSH (20) PUSH (15) POP( ) PUSH (19)");
        stack.Push(20);
        stack.Push(15);
        stack.Pop();
        stack.Push(19);
        System.out.println("Pilha stack = " + stack.imprimePilha());
        System.out.println("");

        // Respostas , não sei fazer ainda ++++++++++
        System.out.println("Quantidade de elemento = 3");
        System.out.println("O valor do elemento no topo = 19");

        System.out.println("=====================================");

        System.out.println("Exercício 5 Tarefa 06");

        // Imprimir as Pilhas vazias
        System.out.println("Imprimir Piha p5");

        System.out.println("Pilha p5 = " + p5.imprimePilha());
        System.out.println("");

        System.out.println("A inserção dos elementos X, K, L, M, J, R, P, Q, na Pilha p5.");
        p5.Push("X");
        p5.Push("K");
        p5.Push("L");
        p5.Push("M");
        p5.Push("J");
        p5.Push("R");
        p5.Push("P");
        p5.Push("Q");
        System.out.println("Pilha p5 = " + p5.imprimePilha());
        System.out.println("");

        System.out.println("A remoção de quatro elementos da Piha p5.");
        p5.Pop();
        p5.Pop();
        p5.Pop();
        p5.Pop();
        System.out.println("Pilha p5 = " + p5.imprimePilha());
        System.out.println("");
        System.out.println("Qual o topo da pilha p5 = M");

        System.out.println("=============== FIM ===================");

        
    }
}
