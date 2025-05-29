package Tarefa_16;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Triangulo extends Mae {

    private double a, b, c, S;
    private String tipo;

    public void LerLados(Scanner Leitor) {

        System.out.println("Digite os Lados A, B e C:");
        System.out.print("Lado A: ");
        a = Leitor.nextDouble();
        System.out.print("Lado B: ");
        b = Leitor.nextDouble();
        System.out.print("Lado C: ");
        c = Leitor.nextDouble();

    }

    public void getTipoTriangulo() {
        if (a == b && a == c) {
            tipo = "Tipo do Triângulo é Equilátero.\nPossui os Lados Iguais.";
        } else if (a != b && a != c && b != c) {
            tipo = "Tipo do Triângulo é Escaleno.\nPossui os Lados Diferentes.";
        } else {
            tipo = "Tipo do Triângulo é Isósceles.\nPossui dois (2) Lados Iguais.";
        }

    }

    public void calc_area(double a, double b, double c) {
        S = (a + b + c) / 2;
        set_area(Math.sqrt(S * (S - a) * (S - b) * (S - c)));

    }

    public void controlet(Scanner Leitor) {

        System.out.println("==================================================");
        System.out.println("Ler e Exibir Dados do \"Triângulo\"");
        LerLados(Leitor);
        getTipoTriangulo();
        calc_area(a, b, c);
        System.out.println("=-=-=-=-=-=-=-=   Resultado  =-=-=-=-=-=-=-=-=-=-=");
        System.out.print(tipo + "\nÁrea do Triângulo é : ");
        get_area();
        System.out.println("\n");

    }

}
