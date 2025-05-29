/*
 a) Faça o desenho do projeto. Faça a classe mãe: Classe10b com menu repetitivo em loop
    while que leia o VALOR de uma prestação e a quantidade de DIAS em atraso. Calcule o valor da
    MULTA de 2% sobre o VALOR da prestação, calcule o valor total de JUROS proporcional aos
    dias, sendo que a taxa é 1% ao mês. Finalmente calcule o valor a pagar VLPAGAR que será a
    soma de VALOR + MULTA + JUROS. Você deverá criar os métodos de leitura e cálculo na classe
    Mãe.
    Crie uma classe filha: Executa10b para colocar o void main() e também coloque o método
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
public class Classe10b extends Object {

    public double valor;
    public int dias;
    public double multa;
    final double taxaMulta = 0.02;
    public double juros;
    final double taxajuros = 0.033;
    public double vlPagar;
    public String resp = "s";

    public void LerValorDias(Executa10b obj1) {
        Scanner scan = new Scanner(System.in);
        
       
        do {

            System.out.print("Digite o Valor da prestação:\nR$: ");
            double v = scan.nextDouble();
             valor += v;

            System.out.println("Digite a quantidade de DIAS em atraso: ");
            int d = scan.nextInt();
            dias += d;
            
            
            System.out.println("Deseja Continuar? (s/n)");
            resp = scan.next();           

            obj1.qtpress++;
            
        }while(resp.equals("s"));
            
        
    }
    
    public double getMulta(){
           
        multa = valor * taxaMulta;
        return multa;
    }
    
    public double getJuros(){
             
        juros = valor * dias * taxajuros;
        return juros;
    }
    
    public double getValorPagar() {

        vlPagar = valor + multa + juros;

        return vlPagar;
    }

}
