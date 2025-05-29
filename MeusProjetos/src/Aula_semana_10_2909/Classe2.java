/*
 * Exemplo Classe2 do comando while com acumulador
 */
package Aula_semana_10_2909;

/**
 *
 * @author FO
 */
import java.util.Scanner;

 

public class Classe2 
{
   public String resp = "não";
   public float valor = 0; 
   public float saldo = 0;
   
   
public void ler () 
{ 
    
    Scanner leitor = new Scanner(System.in);
    
    
    while ( resp.equals("não") )
    { 
        System.out.println("\nDigite valor:");
        valor = leitor.nextFloat();

 

        saldo = saldo + valor; // acumulador

 

        System.out.println("\nDeseja sair ?");
        resp = leitor.next(); 
    } 

 

}
public void exibir()
{   
    String saida;
    saida="Saldo Acumulado= R$ "+ String.format("= %.2f", saldo ) ;
    System.out.println( saida );
}

 

public static void main(String args[])
{
  Classe2 c2 = new Classe2();
  
  c2.ler();
  
  c2.exibir(); 

 

  System.exit(0);

 

}

 

}