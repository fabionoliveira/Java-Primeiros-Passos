/*
 * [10:42] ELISEU LEMES DA SILVA
    Uso do while dentro do menu com operadores de atribuição aritméticos
 */
package Aula_semana_11_0610;

import javax.swing.JOptionPane;

public class Classe3 {

    public double cont = 0, salario, salariomaior = 0,
            salariomenor = 0, media = 0, saldo = 0;

    public void salarios() {
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um salário:"));

        cont++;  // contar a quantidade de salarios

        if (cont == 1) {
            salariomenor = salario;  // inicializando os salarios maior e menor
            salariomaior = salario;
        }

        if (salario < salariomenor) {
            salariomenor = salario;
        }

        if (salario > salariomaior) {
            salariomaior = salario;
        }

        saldo += salario;  // faz o somatório ou acumulo dos salarios

        media = saldo / cont; // faz o calculo da média acumulada

    }

    public void exibir() {
        String saida = "\nSalário Menor:" + salariomenor;
        saida += "\nSalário Maior:" + salariomaior;
        saida += "\nMédia de Salários:" + media;
        saida += "\nSaldo dos Salários:" + saldo;
        JOptionPane.showMessageDialog(null, saida);
    }

    public static void main(String[] agrs) {

        Classe3 m = new Classe3();

        String menu;
        menu = "\n1 Ler valor\n2 resultados\n3 sair\nitem:";
        while (true) {
            int itemmenu = Integer.parseInt(
                    JOptionPane.showInputDialog(null, menu));

            if (itemmenu == 1) {
                m.salarios();
            } else if (itemmenu == 2) {
                m.exibir();
            } else if (itemmenu == 3) {
                System.exit(0);
            } else {
                //System.out.println("Selecione um item válido!");
                JOptionPane.showMessageDialog(null, "Selecione um item válido!","Erro",0);
                System.out.println();
            }
        }
    }

}
