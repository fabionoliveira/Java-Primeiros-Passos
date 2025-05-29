/*
 * a) Faça código fonte estruturado: Crie a classe Pessoa dentro do mesmo pacote,
        que será mais uma classe filha da classe Cliente. Dentro da classe Pessoa
        coloque atributos de uma Pessoa Física, CPF, RG, IDADE e SALÁRIO, insira
        também um método void main e menu com as opções 1 Ler 2 Exibir e 3 Sair .
        Dentro da classe Pessoa faça a leitura via teclado e impressão dos atributos
        da classe mãe e da classe filha.
 */
package Tarefa_09_exer_A;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Pessoa extends Cliente{
    
    public long cpf;
    public long rg;
    public int idade;
    public double salario;
    
    public void controle(Empresa e1 ){
        Scanner scan = new Scanner(System.in);
        int item;
        String menu;
        menu = "=============== Menu Principal ===================";
        menu += "\n1 Ler\n2 Exibir\n3 Sair ";
        
        while(true){
            System.out.println(menu);
            System.out.print("Item: ");
            item = scan.nextInt();
            
            switch(item){
                
                case 1: 
                        System.out.println("\n============ Opção 1 Escolhida. ============");
                        System.out.println("Digite o seu CPF:");
                        cpf = scan.nextLong();
                        System.out.println("Digite seu RG:");
                        rg = scan.nextLong();
                        System.out.println("Digite sua Idade");
                        idade = scan.nextInt();
                        System.out.println("Digite seu Salário:");
                        salario = scan.nextDouble(); 
                        System.out.println();
                        break;
                    
                case 2: 
                        System.out.println("=-=-=-=-=-=-=-=   Resultado  =-=-=-=-=-=-=-=");
                        e1.tipo = "Empresa";
                        e1.telefone = "11-9995-8852";
                        e1.rua = "Rua do Bairro";
                        String saida;
                        saida = "\nTipo:" + e1.tipo;
                        saida += "\nTelfone:" + e1.telefone;
                        saida += "\nRua:" + e1.rua;
                        saida += "\nCPF: " + String.valueOf(cpf);
                        saida += "\nRG: " + String.valueOf(rg);
                        saida += "\nIdade: " + idade;
                        saida += "\nSalário: R$ " + String.format("%.2f", salario);
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
        Empresa e1 = new Empresa();
        Pessoa p1 = new Pessoa();
        
        p1.controle(e1); 
               
    }
       
}
