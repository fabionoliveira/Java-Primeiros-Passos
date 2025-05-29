/*
 * Crie uma classe filha: Executa10b para colocar o void main() e também coloque o método
   de exibição na classe filha. Depois insira os atributos, SALDO, Número de Prestações (qtpress)
   e média das prestações (media) na na classe filha e inclua no método exibir o código para exibir
   sempre quando a opção 3 (exibir) for selecionada, estes três últimos atributos da classe filha.
 */
package Tarefa_10;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Executa10b extends Classe10b{
    
    public double saldo;
    public int qtpress = 0;
    public double media;
    
    
    public void Exibir(){
       
        saldo = vlPagar;
        //qtpress++;
        media = saldo / qtpress;
        
        
        System.out.println("Valor..............R$ " + String.format("%.2f", valor));
        System.out.println("Multa..............R$ " + String.format("%.2f", multa));
        System.out.println("Juros..............R$ " + String.format("%.2f", juros));
        System.out.println("Valor Pagar........R$ " + String.format("%.2f", vlPagar));
        
        System.out.println("Saldo..............R$ " + String.format("%.2f", saldo));
        System.out.println("Número de Prestações: " + qtpress);
        System.out.println("Media..............R$ " + String.format("%.2f", media));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
           
    }
    
    public void controle(Executa10b obj1){
        Scanner scan = new Scanner(System.in);
         
        int item;
        String menu;
        menu = "=============== Menu Principal ===================";
        menu += "\n1 Ler\n2 Calcular\n3 Exibir\n4 Sair";
        
        while( true){
            System.out.println(menu);
            System.out.print("Item: ");
            item = scan.nextInt();
            
            switch(item){
                
                case 1: System.out.println("=-=-=-=-=-=-=-=-=   Ler Valor  =-=-=-=-=-=-=-=-=-=");
                        LerValorDias(obj1);
                        break;
                
                case 2: System.out.println("           >>> Calculado com Sucesso!!! <<<\n");
                        getMulta();
                        getJuros();
                        getValorPagar();
                        break;
                                        
                case 3: System.out.println("=-=-=-=-=-=-=-= Exibir Resultados =-=-=-=-=-=-=-=");
                        Exibir();
                        break;
                
                case 4: System.out.println("---------------- Programa Finalizado!!------------\n");
                        System.exit(0);
                        break;
                              
            }
                      
        }
    }
     
       
    public static void main(String[] args) {
        
        Executa10b obj1 = new Executa10b();
        
        obj1.controle(obj1);
        
    }    
}
