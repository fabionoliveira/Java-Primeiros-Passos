/*1 - Lendo a altura e o sexo (forma: 1:feminino 2:masculino), faça um programa, calcule e exiba o peso ideal. - 
formula para homens: PESOIDEAL = (72.7 * Altura) – 58
- fórmula para mulheres: PESOIDEAL = (62.1 * Altura) – 44.7 
*/
package Tarefa_06;

import java.util.Scanner;

public class PesoIdeal_T6 {
    
    public double altura;
    public int sexo;
    public double pesoideal;
    
    public void Leitura(Scanner scan){
        
        System.out.println("Informe o sexo (1:feminino 2:masculino): ");
        sexo = scan.nextInt();
        System.out.println("Digite a sua Altura(ex: 1,76): ");
        altura = scan.nextDouble();
        
        
        
    }    
    public double getPesoIdeal(){
        if (sexo == 1){
            pesoideal = (72.7 * altura) - 58;   
    
        }else if(sexo == 2){
            pesoideal = (62.1 * altura) - 44.7;       
        }
        
        return pesoideal;

    }

}

