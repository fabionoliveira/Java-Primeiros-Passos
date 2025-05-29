/*
 * ACHANDO O MAIOR E MENOR VALOR DE UM VETOR
 */
package Aula_semana_15_1011;

/**
 *
 * @author FO
 */
import javax.swing.*;

public class Classe1 extends Object {
    // Vetor explicito
    // passo 1          0  1  2   3   4   5                   tot-1

    public int[] xy = {1, 5, 10, 45, 3, 9, 1, 400, 3, 0, 9, -5};

    public double vz[] = new double[10];
    // criando vetor vazio que cabe 10 numeros reais
    public int pos = -1;

    public void lerPos() {
        pos++;
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog("Digite um valor:"));
        vz[pos] = valor;
    }

    public void processarVZ() {
        double maior = 0, menor = 0, cont = 0, saldo = 0, media = 0;

        for (int i = 0; i <= pos; i++) {
            if (i == 0) {
                maior = vz[0];
                menor = vz[0];
            }

            if (vz[i] > maior) {
                maior = vz[i];
            }
            if (vz[i] < menor) {
                menor = vz[i];
            }

            cont++;
            saldo += vz[i];
            media = saldo / cont;
        }

        String saida;
        saida = "\n*** Processamento do vetor vazio ***";
        saida += "\nMaior valor:" + maior;
        saida += "\nMenor valor:" + menor;
        saida += "\nQuantidade.:" + cont;
        saida += "\nSaldo......:" + saldo;
        saida += "\nMédia......:" + String.format("%.2f", media);
        JOptionPane.showMessageDialog(null, saida);
    }

    public void vetorExplicito() {
        int maior = 0, menor = 0;

        int tot = xy.length;// pega o tamanho

        for (int i = 0; i <= tot - 1; i++) {
            if (i == 0) {
                maior = xy[i];
                menor = xy[i];
            }

            if (xy[i] > maior) {
                maior = xy[i];
            }
            if (xy[i] < menor) {
                menor = xy[i];
            }
        }

        String saida = "\n*** Executar Vetor Explicito ***";
        saida += "\nMaior valor:" + maior;
        saida += "\nMenor valor:" + menor;
        JOptionPane.showMessageDialog(null, saida);
    }

    public void controle() {
        String menu;
        menu = "\n*** Menu Principal ***";
        menu += "\n1 Processar vetor explicito";
        menu += "\n2 Processar vetor vazio";
        menu += "\n3 Finalizar";

        while (true) {
            int item = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (item) {
                case 1:
                    vetorExplicito();
                    break;

                case 2:
                    lerPos();
                    processarVZ();
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }

    }

}
