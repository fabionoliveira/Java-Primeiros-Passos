
package Aula_semana_03_1108;

//public class Classe2 {
import java.util.Scanner;
public class Classe2 {
    // atributos
    public double CatetoA, CatetoB, Hipotenusa;
    public String saida;
    public void lerCatetos(Scanner leitor) {
    System.out.println("Digite os catetos A:");
    CatetoA = leitor.nextDouble();
    System.out.println("Digite os catetos B:");
    CatetoB= leitor.nextDouble(); }
    //System.out.println("Digite os catetos A e B:");
    public void calcularHipotenusa() {
    Hipotenusa =
    Math.sqrt(Math.pow(CatetoA,2) +
    Math.pow(CatetoB,2) ); }
    public void exibirTudo() {
    saida = "\nCatetoA: " + CatetoA;
    saida += "\nCatetoB: " + CatetoB;
    saida += "\nHipotenusa: "
    + String.format("= %.2f", Hipotenusa);
    System.out.println(saida );
    System.out.println(); }

    public static void main(String args[]) {
     Scanner leitor = new
     Scanner(System.in);
     Classe2 c1 = new Classe2 ( );

     c1.lerCatetos(leitor);
     c1.calcularHipotenusa();
     c1.exibirTudo();
     System.exit(0); } 
}



