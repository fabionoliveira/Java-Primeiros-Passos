/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author FO
 */
public class Conta {

    private String cliente;
    private double saldo = 0;

    //Construtor
    public Conta() {
        System.out.println("Agencia: 1024");
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos
    protected void exibirSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }

    void sacar(double valor) {
        saldo = saldo - valor;
        System.out.println("Débito: R$" + valor);

    }

    void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Crédito: R$" + valor);
    }

    void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("transferência: " + valor);
    }

    double soma(double cc1, double cc2) {

        double total = cc1 + cc2;

        return total;

    }

}
