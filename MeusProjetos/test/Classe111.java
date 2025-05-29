
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FO
 */
public class Classe111 extends Object{

    public char sexo;
    public double salario;
    public int mulher = 0;
    public int homem = 0;
    public double saldom;
    public double saldoh;
    public double mediam;
    public double mediah;

    public void Ler() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite F para mulher ou H para Homen");
        sexo = (char) System.in.read();
        System.out.print("Digite o Salário:\nR$ ");
        salario = scan.nextDouble();
        switch (sexo) {
            case 'f':
            case 'F':
                mulher++;
                saldom += salario;
                break;
            case 'h':
            case 'H':
                homem++;
                saldoh += salario;
                break;
            default:
                System.out.println("erro, errrrrrroooo");
                System.exit(0);
        }
    }

    public double getMediaM() {
        return mediam = saldom / mulher;
    }

    public double getMediaH() {
        return mediah = saldoh / homem;
    }

    public void exibir() {
        System.out.println("Quantidade Mulheres: " + mulher);
        System.out.println("Quantidade Homens: " + homem);
        System.out.println("Saldo Mulheres: " + String.format("%.2f", saldom));
        System.out.println("Saldo Homens: " + String.format("%.2f", saldoh));
        System.out.println("Média Mulheres: " + String.format("%.2f", mediam));
        System.out.println("Média Homens: " + String.format("%.2f", mediah));
    }
    /*
public static void main(String[] args) {
Classe11b ex1 = new Classe11b();
ex1.Ler();
ex1.getMediaM();
ex1.getMediaH();
ex1.exibir();
}
     */
}


