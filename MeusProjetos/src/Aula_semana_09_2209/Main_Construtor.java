/*
 * Construtor
Toda classe possui um método chamado de CONSTRUTOR, que serve para
instanciar um objeto a partir de uma classe. A função construtora ou construtor pode se
apresentar de duas maneiras. Construtor Vazio e construtor com argumentos, se
aparecer os dois construtores em uma única classe dizemos que está havendo uma
sobrecarga de construtores, uma característica do chamado Polimorfismo.

No void main( ) do exemplo ao
lado, é instanciado um objeto c1
usando o construtor vazio sem
argumentos, depois é instanciado o
objeto c2 a partir da mesma classe
porém usando o construtor com
argumentos. Depois enviamos o
vetor x[] do objeto c1 para dentro do
objeto c2 através do construtor com
parâmetros para que sejam exibidos
os valores do vetor x[];
O construtor com argumentos da
Classe1, além de instanciar um
objeto também é utilizado para fazer
a impressão dos valores do vetor x[]
na tela. 
 */
package Aula_semana_09_2209;

/**
 *
 * @author FO
 */
public class Main_Construtor {
    

 public int x []= {1,2,3,4,5} ;
 
 Main_Construtor () {} // construtor vazio
 
 Main_Construtor ( int [] tb )
 {
 for ( int valor: tb )
 {
 System.out.println ( valor );
 } 
 }
 
public static void main (String []args) 
{
 Main_Construtor c1 = new Main_Construtor ();
 
 Main_Construtor c2 = new Main_Construtor ( c1.x );
 
 System.out.println();
 
 for ( int valor: c2.x )
 {
 System.out.println ( valor );
 }
 
}
 
}