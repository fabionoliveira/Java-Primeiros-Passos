
package ed_212_aula04_objetos;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class ED_212_Aula04_Objetos {

   
    public static void main(String[] args) {
       
        int [] numeros = {10,15,-1,33,77,54,-2,77};
        int [] numeros2 = {44,66,-5,-7,-3,33,77,54,-2};
        int x = 77;
        
        QtdeNegativos local_Exec01 = new QtdeNegativos (numeros);
        QtdeNegativos local2_Exec01 = new QtdeNegativos (numeros2);
        
        QtdeElementosIguais local_Exerc02 = new QtdeElementosIguais(numeros, x);
        Array_Boolean local_Exerc03 = new Array_Boolean(numeros);
        MaiorPosicao local_Exerc04 = new MaiorPosicao(numeros);
        SubstituiElementos local_Exerc05 = new SubstituiElementos(numeros);
        
        JOptionPane.showMessageDialog(null, local_Exec01.ContaNegativos() );
        JOptionPane.showMessageDialog(null, local2_Exec01.ContaNegativos() );
        
        JOptionPane.showMessageDialog(null, local_Exerc02.NumIguais() );
        JOptionPane.showMessageDialog(null, Arrays.toString(local_Exerc03.Remodelada_exerc04(numeros)) );
        JOptionPane.showMessageDialog(null, local_Exerc04.MaiorEPosicao(numeros) );
        JOptionPane.showMessageDialog(null, Arrays.toString(local_Exerc05.TrocaElementos(numeros)) );
        
        
        
    }
    
}
