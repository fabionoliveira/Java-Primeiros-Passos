
package Tarefa_06;

import java.util.Scanner;

public class Principal_T6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        PesoIdeal_T6 t6PE = new PesoIdeal_T6();
        PoligonoTipo_T6 t6TP = new PoligonoTipo_T6();
        TrianguloTipo_T6 t6TT = new TrianguloTipo_T6();
        
        int item;
        String menu;
        
        menu = "=============== Menu Principal ===================";
        menu += "\n1 Peso Ideal\n2 Polígono\n3 Triângulo\n4 Sair";
        
        while(true){
            System.out.println(menu);
            System.out.print("Item: ");
            item = scan.nextInt();
            
            switch (item){
                
                case 1: System.out.println("=-=-=-=-=-=-=-= Opção 1 Peso Ideal =-=-=-=-=-=-=-=");
                        t6PE.Leitura(scan);
                        String peso = String.valueOf(String.format("%.2f", t6PE.getPesoIdeal()));
                        System.out.println("O peso ideal é : "+ peso+" kg.");
                        break;
                        
                case 2: System.out.println("=-=-=-=-=-=-=-= Opção 2 Polígono  =-=-=-=-=-=-=-=");
                        t6TP.Leitura(scan);
                        System.out.println(t6TP.getTipoPoligono());
                        break;
                        
                case 3: System.out.println("=-=-=-=-=-=-=-= Opção 3 Triangulo =-=-=-=-=-=-=-=");
                        t6TT.Leitura(scan);
                        System.out.println(t6TT.getTipoTriangulo());
                        break;
                        
                case 4: System.out.println("Programa Finalizado!!!");
                        System.exit(0);
            }
        }
    }
}
