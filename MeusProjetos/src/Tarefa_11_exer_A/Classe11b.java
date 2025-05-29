/*  Faça uma classe para lista de sexos e salários, sexo será do tipo caractere ‘F’ ou ‘f’ para
mulher e ‘H’ ou ‘h’ para homem, se o usuário digitar algo diferente destes caracteres
exiba “Sexo inválido, digite novamente!”. Ao final imprima o saldo e a média dos
salários dos homens, e mesmo das mulheres. Use operadores de atribuição, menu,
herança e switch case. (Classe Mãe: Classe11b e Filha: Executa11b)
*/
package Tarefa_11_exer_A;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class Classe11b extends Object {

    public char sexo;
    public double salario;
    public int mulher = 0;
    public int homem = 0;
    public double saldom;
    public double saldoh;
    public double mediam;
    public double mediah;

    public void Ler(){
        
        String entrada = JOptionPane.showInputDialog(null, "Digite \"F\" para Mulher ou \"H\" para Homem","Entrada Dados",3);
        sexo = entrada.charAt(0);
        
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Salário:\nR$ ","Entrada Dados",3));
               
        switch (sexo) {
            case 'f':
            case 'F':
                mulher++;
                saldom += salario;
                break;
            case 'h':
            case 'H':
                homem++;
                saldoh += salario;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Sexo inválido, digite novamente!\nDigite ( F ou H )","Erro",0);
               
        }
        
    }
       
    
    public double getMediaM() {

        return mediam = saldom / mulher;
    }

    public double getMediaH() {

        return mediah = saldoh / homem;
    }

    public void exibir() {
        String saida;
        saida =  "\nQuantidade Mulheres : " + mulher;
        saida += "\nQuantidade Homens   : " + homem;
        saida += "\n\nSaldo e Médias dos Salários.";
        saida += "\nSaldo Mulheres...R$ " + String.format("%.2f", saldom);
        saida += "\nSaldo Homens.....R$ " + String.format("%.2f", saldoh);
        saida += "\nMédia Mulheres...R$ " + String.format("%.2f", mediam);
        saida += "\nMédia Homens.....R$ " + String.format("%.2f", mediah);
        JOptionPane.showMessageDialog(null, saida,"Resultados",1);
       
    }
}
