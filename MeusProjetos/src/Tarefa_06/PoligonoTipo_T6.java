/*2 - Encontre o TIPO do poligono, escreva um programa para ler o número de lados de um polígono regular e a 
medida do Lado (em cm).
− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. 
− Se o número de lados for igual a 3 o tipo será “TRIÂNGULO”, calcule e mostre a área do triângulo 
− Se o número de lados for igual a 4 o tipo será “QUADRADO”, calcule e mostre a área do quadrado. 
− Se o número de lados for igual a 5 o tipo será “PENTÁGONO”, calcule e mostre a área do pentágono. 
*/
package Tarefa_06;

import java.util.Scanner;

public class PoligonoTipo_T6 {
    
    public int Lado;
    public double medida;
    public double area;
    public String tipo;
    
    public void Leitura(Scanner scan){
        
        System.out.println("Digite o número de Lados: ");
        Lado = scan.nextInt();
        System.out.println("Digite a medida (em cm) : ");
        medida = scan.nextDouble();
        
        
    }
    
    public String getTipoPoligono(){
        area = ((Math.pow(medida, 2)* Lado) /(4 * Math.tan(Math.PI/Lado)));
        
        if (Lado < 3){
            
            tipo = "NÃO É UM POLÍGONO.";        
            
        } else if (Lado > 5){
            
            tipo = "POLÍGONO NÃO IDENTIFICADO.";
            
        } else if (Lado == 3){
            
            tipo = "O tipo de polígono será \"TRIÂNGULO\" e sua área é: "+ String.format("%.3f", area)+" cm2.";
            
        } else if (Lado == 4){
           
            tipo = "O tipo de polígono será \"QUADRADO\" e sua área é: "+ String.format("%.3f", area)+" cm2.";
           
        } else if (Lado == 5){
                       
            tipo = "O tipo de polígono será \"PENTÁGONO\" e sua área é: "+ String.format("%.3f", area)+" cm2.";
        }    
                           
        return tipo;
    }
}
    