package Aula_semana_01_2807;

import java.util.Scanner;
//Aula_01 28/07/21
//classe1
//Exemplo para Calculo de Volume.

public class Volume {
    //Nossos Atributos

    public double volume;
    final double comprimento = 10;
    public double lado, altura;

    //Nossos Métodos
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o Lado:");
        lado = leitor.nextDouble();

        System.out.println("Digite a Altura:");
        altura = leitor.nextDouble();
    }

    public void calcular() {
        volume = comprimento * lado * altura;
    }

    public void exibir() {
        System.out.println("\nO valor do Volume:");
        System.out.println(volume);
        System.out.println();
    }

    public static void main(String[] args) {//Instanciamento da classe
        Volume vol1 = new Volume();

        vol1.leitura();
        vol1.calcular();
        vol1.exibir();

    }//FIM MAIN

}//Fim da classe
