/*
 * Classe 1 While incremento e decremento static
 */
package Aula_semana_10_2909;

/**
 *
 * @author FO
 */
public class Classe1 
{
   static public int contador= 0;
   static public int diminuir= 50;

 

public static void calcular ()
{
    
  while (contador < 10)
    { 
        contador = contador + 2;
        diminuir= diminuir - 2; 
    } 

 

}

 

public static void exibir () 
{
  System.out.println("\nContador:"+contador + " " + " Diminuir:" + diminuir);

 

}

 

public static void main(String []args) 
{
   exibir();     
   calcular();
   exibir(); 
   
   System.exit(0); 
} 

 

}