package Aula_semana_05_2508;

import javax.swing.JOptionPane;

public class Interativo_05 {

    public int Numero;

    public void lerNumero() {
        Numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o número inteiro com 4 dígitos:"));
    }

    public void anoBissexto() {
        String saida;

        if (Numero % 4 == 0) {
            saida = "\nO número " + Numero + " é um ano Bissexto!";
        } else {
            saida = "\nO número " + Numero + " trata-se de um ano não Bissexto!";
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void divisivelPor3e2() {
        String saida;
        if (Numero % 3 == 0 && Numero % 2 == 0) {
            saida = "\n O número " + Numero + " é divisivel por 3 e 2!";
        } else {
            saida = "\n O número " + Numero + " não é divisivel por 3 e 2!";
        }

        JOptionPane.showMessageDialog(null, saida);

    }

    public void divisorDe6e12e18() {
        String saida;
        if (6 % Numero == 0 && 12 % Numero == 0 && 18 % Numero == 0) {
            saida = "\n O número " + Numero + " é divisor de 6, 12 e 18!";
        } else {
            saida = "\n O número " + Numero + " não é divisor de 6, 12 e 18!";
        }

        JOptionPane.showMessageDialog(null, saida);

    }

    public void controle() {
        int op;
        String menu;
        do {
            menu = "\n1 Ler Número\n"
                    + "2 Bissexto\n3 Divisivel por 3e2"
                    + "\n4Divisor de 6 12 e 18\n5 sair\nitem:";
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (op) {
                case 1:
                    this.lerNumero();
                    break;

                case 2:
                    this.anoBissexto();
                    break;

                case 3:
                    this.divisivelPor3e2();
                    break;

                case 4:
                    this.divisorDe6e12e18();
                    break;

                case 5:
                    System.exit(0);
                    break;

            }

        } while (true);
    }

    public static void main(String[] args) {
        Interativo_05 i1 = new Interativo_05();

        i1.controle();
    }

}
