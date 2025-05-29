
package Aula05_Lista_Prof;

public class Main_Listas {
    
    public static void main(String[] args) {
        
        Listas myLi = new Listas (5);
        
        myLi.addElemento("a");
        myLi.addElemento("b");
        myLi.addElemento("c");
        myLi.addElemento("d");
        myLi.addElemento("e");
        myLi.addElemento("f");
        myLi.addElemento(5);
        myLi.addElemento(55.5);
        myLi.addElemento(true);
        myLi.addElemento(-99);
        myLi.addElemento("c");
        myLi.addElemento(57.77f);
        myLi.delElemento(0);
        myLi.delElemento(6);
        
        
        System.out.println(myLi.imprimeLista());
        
        System.out.println(myLi.delElemento(0));
        System.out.println(myLi.delElemento(6));
        System.out.println(myLi.imprimeLista());
        
        myLi.addElemento("X");
        myLi.addElemento("X");
        myLi.addElemento("x");
        myLi.addElementoPosLivre("@");
        myLi.addElementoPosLivre("@");
        myLi.addElementoPosLivre("@");
        
        System.out.println(myLi.imprimeLista());
        
        
    }

}
