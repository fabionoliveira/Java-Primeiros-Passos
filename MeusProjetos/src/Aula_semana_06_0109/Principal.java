package Aula_semana_06_0109;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Media m1 = new Media();
        Triangulo t1 = new Triangulo();

        int tecla = 0;
        String menu;
        menu = "*** Menu de Controle ***";
        menu += "\n1 Calcular Média\n2 Calcular Área\n3 Sair\nItem:";

        while (true) {
            System.out.println(menu);
            tecla = leitor.nextInt();

            switch (tecla) {
                case 1:
                    m1.ler(leitor);
                    double media_ = m1.getMedia();
                    System.out.println("\nMédia:" + media_);
                    break;

                case 2:
                    t1.ler(leitor);
                    System.out.println("\nÁrea do Triângulo:" + t1.getArea());
                    break;

                case 3:
                    System.out.println("\nPrograma Finalizado!");
                    System.out.println();
                    System.exit(0);
                    break;
            }
        }
    }

}
