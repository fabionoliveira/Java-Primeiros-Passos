/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciofundamentos;

import java.util.Random;

/**
 *
 * @author FO
 */
public class Veiculo {
    
    int ano;
    String cor;

    public Veiculo() {
        Random gerachassi = new Random();
        Random geraplaca = new Random();
        int chassi = gerachassi.nextInt(3000);
        int placa = geraplaca.nextInt(77000);
        String letras = "BRASIL";
        System.out.println("Chassi: " + chassi);
        System.out.println("Placa: " + letras + placa);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
