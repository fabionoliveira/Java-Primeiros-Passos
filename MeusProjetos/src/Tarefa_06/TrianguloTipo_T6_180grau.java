/*
3 - Encontre o TIPO do triângulo, escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva 
se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
− Triângulo Retângulo: possui um ângulo reto. (igual a 90o)
− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90 graus)
− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90 graus)
*/
package Tarefa_06;

import java.util.Scanner;

public class TrianguloTipo_T6_180grau {
    public double angulo1;
    public double angulo2;
    public double angulo3;
    public String tipo;
    
    public void Leitor(Scanner scan){
        
        System.out.println("Digite o valor do 1º ângulo: ");
        angulo1 = scan.nextDouble();
        System.out.println("Digite o valor do 2º ângulo: ");
        angulo2 = scan.nextDouble();
        System.out.println("Digite o valor do 3º ângulo: ");
        angulo3 = scan.nextDouble();
        
        //soma dos angulos internos informados tem que ser menor que 180 graus
         double soma = (angulo1 + angulo2 + angulo3);
        
        if ( soma > 180){
            
            tipo = "Para ser um Triangulo:\n Á Soma dos ângulos informados tem que ser menor que 180 graus.\nE a soma foi : "+String.valueOf(soma);       
        
        }
        
        if ( soma <= 180){
            if( angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
                if (angulo1 < 90 && angulo2 < 90){
                tipo = "Triângulo Retângulo: \nPossui um ângulo reto. (igual a 90 graus.)";
                } else if (angulo1 < 90 && angulo3 < 90){
                    tipo = "Triângulo Retângulo: \nPossui um ângulo reto. (igual a 90 graus.)";            
                } else if (angulo2 < 90 && angulo3 < 90){
                    tipo = "Triângulo Retângulo: \nPossui um ângulo reto. (igual a 90 graus.)";            
                }
        
            } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
                if (angulo1 < 90 && angulo2 < 90){         
                    tipo = "Triângulo Obtusângulo: \nPossui um ângulo obtuso. (maior que 90 graus).";
                } else if (angulo1 < 90 && angulo3 < 90){
                    tipo = "Triângulo Obtusângulo: \nPossui um ângulo obtuso. (maior que 90 graus).";
                }else if (angulo2 < 90 && angulo3 < 90){
                    tipo = "Triângulo Obtusângulo: \nPossui um ângulo obtuso. (maior que 90 graus).";
                } 

            } else if(angulo1 < 90 && angulo2 < 90 && angulo3 < 90){

                tipo = "Triângulo Acutângulo: \nPossui três ângulos agudos. (menor que 90 graus).";
            }
        }

    }
    
    public String getTipoTriangulo(){
    
        return tipo;
    }

}


