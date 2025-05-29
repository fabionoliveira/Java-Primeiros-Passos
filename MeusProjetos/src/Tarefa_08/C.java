/*
 c) Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C).
    Durante a apuração dos votos foram computados votos nulos e votos em branco,
    além dos votos válidos para cada candidato.

    Deve ser criado um programa de computador que efetue a leitura da quantidade de 
    votos válidos para cada candidato, além de efetuar também a leitura da quantidade
    de votos nulos e votos em branco.

    Ao final o programa deve apresentar o número total de eleitores, considerando votos 
    válidos, nulos e em branco;
    o percentual correspondente de votos válidos em relação à quantidade de eleitores;
    o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores;
    o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores;
    o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores;
    o percentual correspondente de votos nulos em relação à quantidade de eleitores; 
    e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.
 */
package Tarefa_08;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class C {
    
    public double a;
    public double b;
    public double c;
    public double nulos;
    public double brancos;
    
    
    public void LerVoto(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a Quantidade de votos válidos para o candidato A.");
        a = scan.nextDouble();
        System.out.println("Digite a Quantidade de votos válidos para o candidato B.");
        b = scan.nextDouble();
        System.out.println("Digite a Quantidade de votos válidos para o candidato C.");
        c = scan.nextDouble();
        System.out.println("Digite a Quantidade de votos NULOS.");
        nulos = scan.nextDouble();
        System.out.println("Digite a Quantidade de votos BRANCOS.");
        brancos = scan.nextDouble();
        
        
    }
    public double calTotalEleitores(){
        
        double totel = (a + b + c + nulos + brancos);
        return totel;
      
    }
    public double calPerValidosEleitores(){
        
        double perel = ((a + b + c) / (a + b + c + nulos + brancos)) *100;
        return  perel;
        
    }
        
    public double calPerVotosA(){
        
        double perA = ( a ) / (a + b + c + nulos + brancos) *100; 
        return perA;
    }
    public double calPerVotosB(){

        double perB = ( b ) / (a + b + c + nulos + brancos) *100; 
        return perB;
    }
    public double calPerVotosC(){
        
        double perC = ( c ) / (a + b + c + nulos + brancos) *100; 
        return perC;
    }
    public double calPerVotosNulos(){
        
        double perNu = ( nulos ) / (a + b + c + nulos + brancos) *100; 
        return perNu;
    }
    public double calPerVotosBranco(){
        
        double perBr = ( brancos ) / (a + b + c + nulos + brancos) *100; 
        return perBr;
    } 
    public void Exibir(double totel, double perel, double perA, double perB, double perC, double perNu, double perBr){
                       
        System.out.println("=-=-=-=-=-=-=-=   Resultado  =-=-=-=-=-=-=-=");
        System.out.println("O número total de eleitores, considerando votos "
                + "válidos, nulos e em branco = " + String.format("%.0f", totel));
        System.out.println("O percentual correspondente de votos válidos"
                + " em relação à quantidade de eleitores = " + String.format("%.2f", perel)+ "%");
        System.out.println("O percentual correspondente de votos válidos"
                + " do candidato A em relação à quantidade de eleitores = " + String.format("%.2f", perA)+ "%");
        System.out.println("O percentual correspondente de votos válidos"
                + " do candidato B em relação à quantidade de eleitores = " + String.format("%.2f", perB)+ "%");
        System.out.println("O percentual correspondente de votos válidos"
                + " do candidato C em relação à quantidade de eleitores = " + String.format("%.2f", perC)+ "%");
        System.out.println("O percentual correspondente de votos nulos"
                + " em relação à quantidade de eleitores = " + String.format("%.2f", perNu)+ "%");
        System.out.println("O percentual correspondente de votos em branco"
                + " em relação à quantidade de eleitores = " + String.format("%.2f", perBr) + "%");
        System.out.println();
                  
    }
    public void menu_controle() {
        Scanner scan = new Scanner(System.in);
        
        int tecla = 0;

        while (true) {
            System.out.println("============ Menu executar C ================");
            System.out.print("1 Executar\n2 Finalizar\n3 Sair\nItem: ");
            tecla = scan.nextInt();

            switch (tecla) {
                case 1:
                    System.out.println("\n============ Opção 1 Escolhida. =============");
                    LerVoto();
                    double totel = calTotalEleitores();
                    double perel = calPerValidosEleitores();
                    double perA = calPerVotosA();
                    double perB = calPerVotosB();
                    double perC = calPerVotosC();
                    double perNu = calPerVotosNulos();
                    double perBr = calPerVotosBranco();
                    Exibir(totel, perel,perA, perB,perC, perNu, perBr);
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
        C c1 = new C();
        
        c1.menu_controle();
        
    }
            
}
