/*
 * b) Faça uma classe para ler uma lista de idades e salários, ao final imprima o maior e o
      menor salário dos menores de idade, o menor e o maior salário dos maiores de idade, a
      quantidade de menores de idade e quantidade dos maiores de idade. Use operadores de
      atribuição, menu, herança e switch case. (Classe Mãe: Classe11c e Filha: Executa11c)
 */
package Tarefa_11_exer_B_ifs;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe11c_if extends Object {

    public int idade;
    public double salario;

    public int MenorIdade = 0;
    public int MaiorIdade = 0;

    public double MenorSalario_MenorIdade = 0;
    public double MaiorSalario_MenorIdade = 0;
    public double MenorSalario_MaiorIdade = 0;
    public double MaiorSalario_MaiorIdade = 0;

    public void Ler() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua Idade: ");
        idade = scan.nextInt();

        System.out.print("Digite o Salário R$ ");
        salario = scan.nextDouble();

    }

    public void IdadeMe() {

        if (idade < 18){ 
            MenorIdade++;
            if (MenorIdade == 1){
                MenorSalario_MenorIdade = salario;
                MaiorSalario_MenorIdade = salario;
            }
            else if (salario < MenorSalario_MenorIdade){
                MenorSalario_MenorIdade = salario;
            }

            else if (salario > MaiorSalario_MenorIdade){
                MaiorSalario_MenorIdade = salario;
            }
        }
    }  
    
    public void IdadeMa(){
        if (idade >= 18) {
            MaiorIdade++;        
            if (MaiorIdade == 1) {
                MenorSalario_MaiorIdade = salario;
                MaiorSalario_MaiorIdade = salario;
            } 
            
            else if (salario < MenorSalario_MaiorIdade) {
                MenorSalario_MaiorIdade = salario;
            } 
            
            else if (salario > MaiorSalario_MaiorIdade) {
                MaiorSalario_MaiorIdade = salario;
            }
        }    
    }
}
