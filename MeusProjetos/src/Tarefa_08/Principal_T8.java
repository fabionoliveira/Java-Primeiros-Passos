/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_08;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Principal_T8 {
        
    
    public void menu_controle(A a1, B b1, C c1){
        Scanner scan = new Scanner(System.in);
        
        
        
        int item;
        String menu;
                
        menu = "=============== Menu Principal ===================";
        menu += "\n1 executar A\n2 executar B\n3 executar C\n4 Sair";
        
        while(true){
            System.out.println(menu);
            System.out.print("Item: ");
            item = scan.nextInt();
            
            switch (item){
                
                case 1:                                 
                        a1.menu_controle();                        
                        break;
                        
                case 2: 
                        b1.menu_controle();
                        break;
                        
                case 3: 
                        c1.menu_controle();
                        break;
                        
                case 4: System.out.println(">>>>>>>>>>>>> Programa Finalizado!!! <<<<<<<<<<<<<");
                        System.exit(0);
            }
        }
    
    }
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        Principal_T8 p1 = new Principal_T8();
        p1.menu_controle(a1, b1, c1);
    }
    
}

