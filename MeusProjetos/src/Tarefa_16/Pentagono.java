package Tarefa_16;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Pentagono extends Mae {

    private double medida;

    public void LerLado(Scanner Leitor) {

        System.out.print("Digite a Medida: ");
        medida = Leitor.nextDouble();

    }

    public void calc_area(double medida) {

        set_area((Math.pow(medida, 2) * 5) / (4 * Math.tan(Math.PI / 5)));

    }

    public void controlep(Scanner Leitor) {

        System.out.println("==================================================");
        System.out.println("Ler e Exibir Dados do \"Pentágono\"");
        LerLado(Leitor);
        calc_area(medida);
        System.out.println("=-=-=-=-=-=-=-=   Resultado  =-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Área do Pentágono é : ");
        get_area();
        System.out.println("\n");

    }

}
