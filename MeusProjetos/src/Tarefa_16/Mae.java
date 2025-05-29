
package Tarefa_16;

/**
 *
 * @author FO
 */
public class Mae extends Object {

    public String nome;
    private double area;

    public void set_area(double area) {
        this.area = area;
    }

    public void get_area() {
        //System.out.println(area + "\n" + this.nome);
        System.out.printf("%.2f", + area);
        System.out.print(" cm quadrado.");
    }

}
