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
public class PessoaFisica {

    public static void main(String[] args) {
        Conta cc1 = new Conta();

        cc1.setCliente("Magda");
        System.out.println("Cliente: " + cc1.getCliente());
        cc1.exibirSaldo();
        cc1.setSaldo(7000);
        cc1.exibirSaldo();
        cc1.depositar(3000);
        cc1.exibirSaldo();

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        Conta cc2 = new Conta();

        cc2.setCliente("Solange");
        System.out.println("Cliente: " + cc2.getCliente());
        cc2.exibirSaldo();
        cc2.setSaldo(8900);
        cc2.getSaldo();
        cc2.exibirSaldo();
        cc2.depositar(8900);
        cc2.exibirSaldo();

        System.out.println("----------------------------");
        System.out.println("Transferência");
        System.out.println("Cliente: " + cc1.getCliente());
        System.out.println("Favorecido: " + cc2.getCliente());
        cc1.transferir(cc2, 2000);
        System.out.println("");
        System.out.println("Cliente: " + cc1.getCliente());
        cc1.exibirSaldo();
        System.out.println("Cliente: " + cc2.getCliente());
        cc2.exibirSaldo();
        System.out.println("----------------------------");
        System.out.println("Relatório gerencial");
        Conta gerente = new Conta();
        double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
        System.out.println("Saldo total nas contas: R$ " + relatorio);
    }

}
