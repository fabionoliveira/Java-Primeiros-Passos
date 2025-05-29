/*
 i) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo 
segundo.

j) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em 
dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares 
disponível com o usuário, para que seja apresentado o valor em moeda brasileira.

L) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à 
soma dos quadrados dos três valores lidos.
 */
package Tarefa_07;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class Principal_T07 {
    
    public static void main(String[] args) {
                
        ConversaoDolarReal JT07CON = new ConversaoDolarReal();
        QuadradoDiferenca  JT07Q2 = new QuadradoDiferenca();
        SomaQuadradoTresNumeros JT07SO = new SomaQuadradoTresNumeros();
        
        String menu;
        int item;
        
        menu = "=============== Menu Principal ===================";
        menu += "\n1 Quadrado da Diferençã entre dois Números\n2 Conversão Dólar para Real";
        menu += "\n3 Soma dos Quadrados dos Três Números\n4 Sair";
        menu += "\nItem: ";
        
        while(true){
           item = Integer.parseInt(JOptionPane.showInputDialog(null,menu,"Menu Principal",3));
            
            switch(item){
                
                case 1: String msg = "=-=-=-=-=-=-=-=  Opção 1 Escolhida =-=-=-=-=-=-=-="
                                + " \nDigite o valor para A: ";
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, msg,"Entrada",3));
                        
                        String  msg1 = "=-=-=-=-=-=-=-=  Opção 1 Escolhida =-=-=-=-=-=-=-="
                                + "\nDigite o valor para B:";
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, msg1,"Entrada",3));     
                        
                        JT07Q2.Ler(n1, n2);
                        int diferenca = JT07Q2.getQuadradoDiferenca();
                        JT07Q2.Exibir(diferenca);
                        break;
                
                case 2: String msg2 = "=-=-=-=-=-=-=-=  Opção 2 Escolhida =-=-=-=-=-=-=-=\n"
                        + "Qual o valor da cotação do Dólar hoje? ";
                        double cot = Double.parseDouble(JOptionPane.showInputDialog(null, msg2,"Entrada",3));
                                        
                        String msg3 = "=-=-=-=-=-=-=-=  Opção 2 Escolhida =-=-=-=-=-=-=-=\n"
                                + "Quantos dólares disponivel para converter em moeda Brasileira? ";
                        double dol = Double.parseDouble(JOptionPane.showInputDialog(null, msg3,"Entrada",3));
                    
                        JT07CON.Ler(cot,dol);
                        double valor = JT07CON.getValorReal();
                        JT07CON.Exibir(valor);
                        break;                
                       
                case 3: String msg4 = "=-=-=-=-=-=-=-=  Opção 3 Escolhida =-=-=-=-=-=-=-=\n"
                        + "Digite um valor para A: ";
                        double x1 = Double.parseDouble(JOptionPane.showInputDialog(null, msg4,"Entrada",3));
                        
                        String msg5 = "=-=-=-=-=-=-=-=  Opção 3 Escolhida =-=-=-=-=-=-=-=\n"
                        + "Digite um valor para B: ";
                        double x2 = Double.parseDouble(JOptionPane.showInputDialog(null, msg5,"Entrada",3));
                        
                        String msg6 = "=-=-=-=-=-=-=-=  Opção 3 Escolhida =-=-=-=-=-=-=-=\n"
                        + "Digite um valor para A: ";
                        double x3 = Double.parseDouble(JOptionPane.showInputDialog(null, msg6,"Entrada",3));
                        
                        JT07SO.Ler(x1, x2, x3);
                        double soma = JT07SO.getSomaQuadrado();
                        JT07SO.Exibir(soma);                
                        break;
                        
                case 4: JOptionPane.showMessageDialog(null,"Programa Finalizado!!!");
                        System.exit(0);
            }
        }
    }
    
}
