
package Aula_semana_02_0408;

import java.util.Scanner;

public class Exemplo_IF_ELSE {
    public int idade;
    
    public void leitura()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade:");
        idade = leitor.nextInt();
        
        if (idade <= 10)
        {System.out.println("Menor de 10 anos.");}
        else if ( idade > 10 && idade < 20)
        {System.out.println("Menor de 20 anos.");}
        else if ( idade > 20 && idade < 30)
        {System.out.println("Menor de 30 anos.");}
        else if ( idade >= 30)
        {System.out.println("Maior de 30 anos.");}
    
    }
    public static void main(String[] args)
    {
        Exemplo_IF_ELSE n1 = new Exemplo_IF_ELSE();
        
        n1.leitura();      
    
    }//FIM MAIN   

}//FIM CLASSE


