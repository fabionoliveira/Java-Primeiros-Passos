
package heranca_teste;


public class ClasseW extends ClasseY{
    
    public void m3(){
        System.out.println("W.m3");
    
    }public void m2(){
        System.out.println("W.m2");
    
    }
    public static void main(String[] args) {
        ClasseW w = new ClasseW();
        
        w.m1();
        w.m2();
        w.m3();
    }
    
}
