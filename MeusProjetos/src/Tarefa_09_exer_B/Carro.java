/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_09_exer_B;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Carro extends Veiculo{
    
    public String placa; 
    public String cor; 
    public int renavam;
 
    Carro(){
    
    }
    public void controle(Carro c1){
        Scanner scan = new Scanner(System.in);
        int item;
        String menu;
        menu = "=============== Menu Principal ===================";
        menu += "\n1 Cadastrar\n2 Exibir\n3 Sair "; 
        
        while(true){
            System.out.println(menu);
            System.out.print("Item: ");
            item = scan.nextInt();
            
            switch(item){
                
                case 1: 
                        System.out.println("\n============ Opção 1 Escolhida. ==================");
                        System.out.println(">>> Digite as Informações do Veículo abaixo!! <<<");
                        System.out.println("==================================================\n");
                        System.out.println("Digite a Marca: ");
                        c1.Marca = scan.next();
                        System.out.println("Digite o Modelo: ");
                        c1.Modelo = scan.next();
                        System.out.println("Digite o Ano de Fabricação: ");
                        c1.Ano = scan.nextInt();                        
                        System.out.println("Digite Números e Letras da Placa: ");
                        c1.placa = scan.next();
                        System.out.println("Digite a Cor: ");
                        c1.cor = scan.next();
                        System.out.println("Digite o Renavam: ");
                        c1.renavam = scan.nextInt();
                        System.out.println();
                        break;
                    
                case 2: 
                        System.out.println("=-=-=-=-=-=-=-=   Resultado  =-=-=-=-=-=-=-=");
                        c1.Exibir();
                        String saida;
                        saida = "Placa.........: " + c1.placa;
                        saida += "\nCor...........: " + c1.cor;
                        saida += "\nRenavam.......: " + c1.renavam;
                        System.out.println(saida);
                        System.out.println();                        
                        break;                    
                    
                case 3:
                        System.out.println("Programa Finalizado!!");
                        System.out.println();
                        System.exit(0);
                        break;
                             
            }//fim switch
                
        }//fim while
        
    }//fim controle
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.controle(c1);
    }
}
