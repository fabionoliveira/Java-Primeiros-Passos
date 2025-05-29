package Tarefa_16;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Quadrado extends Mae {

    private double Lado;

    public void LerLados(Scanner Leitor) {

        System.out.print("Digite o Lado: ");
        Lado = Leitor.nextDouble();

    }

    private void calc_area(double Lado, String nome) {
        super.nome = nome;

        set_area(Math.pow(this.Lado, 2));
    }

    public void controleq(Scanner Leitor) {

        System.out.println("==================================================");
        System.out.println("Ler e Exibir Dados do \"Quadrado\"");
        LerLados(Leitor);
        nome = "Quadrado"; // classe mãe

        calc_area(Lado, nome);// classe mãe
        System.out.println("=-=-=-=-=-=-=-=   Resultado  =-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Área do " + nome + " é : ");
        get_area(); // classe mãe
        System.out.println("\n");

    }

}
