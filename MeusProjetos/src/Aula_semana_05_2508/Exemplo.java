package Aula_semana_05_2508;

public class Exemplo {

    public static void main(String args[]) {
        // modulo relativo
        int x = -10;
        System.out.print("modulo absoluto de -10:" + Math.abs(x));

        // modulo relativo ou resto
        int a = 5, b = 3;

        x = (a % b);

        System.out.println("\nMOD - modulo relativo entre 5 e 3:" + x);

        // Div ou quociente inteiro 
        x = (int) (a / b);

        System.out.println("Div ou quociente inteiro entre 5 e 3:" + x);

    }

}
