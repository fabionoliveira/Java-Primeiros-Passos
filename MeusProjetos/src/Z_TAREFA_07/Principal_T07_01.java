/*
 i) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo 
segundo.

j) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em 
dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares 
disponível com o usuário, para que seja apresentado o valor em moeda brasileira.

L) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à 
soma dos quadrados dos três valores lidos.
 */
package Z_TAREFA_07;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Principal_T07_01 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ConversaoDolarReal_1 T07CON = new ConversaoDolarReal_1();
        QuadradoDiferenca_1  T07Q2 = new QuadradoDiferenca_1();
        SomaQuadradoTresNumeros_1 T07SO = new SomaQuadradoTresNumeros_1();
        
        String menu;
        int item;
        
        menu = "=============== Menu Principal ===================";
        menu += "\n1 Quadrado da Diferençã entre dois Números\n2 Conversão Dólar para Real";
        menu += "\n3 Soma dos Quadrados dos Três Números\n4 Sair";
                
        while(true){
            
            System.out.println(menu);
            System.out.print("Item: ");
            item = scan.nextInt();
            switch(item){
                
                case 1: System.out.println("=-=-=-=-=-=-=-=  Opção 1 Escolhida =-=-=-=-=-=-=-=");
                        T07Q2.Ler(scan);
                        int diferenca = T07Q2.getQuadradoDiferenca();
                        T07Q2.Exibir(diferenca);
                        break;
                
                case 2: System.out.println("=-=-=-=-=-=-=-=  Opção 2 Escolhida =-=-=-=-=-=-=-=");
                        T07CON.Ler(scan);
                        double valor = T07CON.getValorReal();
                        T07CON.Exibir(valor);
                        break;                
                       
                case 3: System.out.println("=-=-=-=-=-=-=-=  Opção 3 Escolhida =-=-=-=-=-=-=-=");
                        T07SO.Ler(scan);
                        double soma = T07SO.getSomaQuadrado();
                        T07SO.Exibir(soma);                
                        break;
                        
                case 4: System.out.println("Programa Finalizado!!!");
                        System.exit(0);
            }
        }
    }
    
}
