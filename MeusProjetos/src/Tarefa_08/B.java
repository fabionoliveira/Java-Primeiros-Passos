/*
 b) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do 
    percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).
 */
package Tarefa_08;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class B {
    public double sm;
    public double pr;
    
    public void Ler(Scanner scan){
        System.out.print("Digite o valor do salário mensal:\nR$ ");
        sm = scan.nextDouble();
        System.out.print("Digite a taxa percentual de reajuste:\nTaxa ");
        pr = scan.nextDouble();
           
    }
    public double CalNS(){
        
        double ns = sm + ((sm * pr) / 100);
        
        return ns;
    }
    public void Exibir(double ns){
        System.out.println("=-=-=-=-=-=-=-=   Resultado  =-=-=-=-=-=-=-=");
        System.out.println("O valor do novo salário é R$ " + String.format("%.2f",ns));
        System.out.println();
    }
    public void menu_controle() {
        Scanner scan = new Scanner(System.in);
        
        int tecla = 0;

        while (true) {
            System.out.println("============ Menu executar B ================");
            System.out.print("1 Executar\n2 Finalizar\n3 Sair\nItem: ");
            tecla = scan.nextInt();

            switch (tecla) {
                case 1:
                    System.out.println("\n============ Opção 1 Escolhida. =============");
                    Ler(scan);
                    double ns = CalNS();
                    Exibir(ns);   
                    break;

                case 2:
                    System.out.println("\n>>>>>>>>>>>>>>>>> Finalizado <<<<<<<<<<<<<<<<");
                    System.out.println();
                    return;
                    
                case 3:
                    System.out.println();
                    break;
                                      
            }
        }
    }
    
    
    public static void main(String[] args) {
         
        B b1 = new B();
        
        b1.menu_controle();
    }

}

