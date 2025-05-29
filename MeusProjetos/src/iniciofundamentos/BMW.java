/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciofundamentos;

/**
 *
 * @author FO
 */
public class BMW {

    public static void main(String[] args) {
        //criar novo objeto com nome mercedes.
        Veiculo mercedes = new Veiculo();

        //Declarando os valores as variáveis "ano" e "cor".
        mercedes.ano = 2020;
        mercedes.cor = "Cinza";
        System.out.println("Ano: " + mercedes.ano);
        System.out.println("Cor: " + mercedes.cor);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Outro modo de declarar variáveis com SEGURANÇA usando "Setter" e "Getter".
        
        //criar novo objeto com nome mercedes.
        Veiculo bmw = new Veiculo();
        //Setar as variáveis "ano" e "cor".
        bmw.setAno(2000);
        bmw.setCor("Vermelho");
        
        //Buscar os valores das variáveis "ano" e "cor".
        System.out.println("Ano: " + bmw.getAno());
        System.out.println("Cor: " + bmw.getCor());

    }

}
