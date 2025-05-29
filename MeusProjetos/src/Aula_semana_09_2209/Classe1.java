/*
 * Instanciando um Objeto
Quando o objeto é chamado dentro de uma aplicação ocorre o que chamamos de
instanciação do objeto. De fato, um objeto pode ter várias instâncias com valores
alterados de atributos. Vários objetos instanciados podem trocar informações entre si,
estas informações recebem o nome de Mensagens. (Um objeto usando um método de
outro objeto).
 */
package Aula_semana_09_2209;

public class Classe1
{
int x=10;
void listar () {System.out.println( x ); }
public static void main (String [] args )
{
Classe1 ob1 = new Classe1( ); // instanciamento de ob1 com new
ob1.listar();
Classe1 ob2 = new Classe1( ); // instanciamento de ob2 com new
System.out.println( ob1.x + ob2.x );
}}