
package exerprofessor3003;

/**
 *
 * @author FO
 */
public class Professor1 {
    
    protected int cd_professor;
    protected String nm_professor;
    protected String ds_cargo;
    protected double vlr_horaaula;
    protected double vlr_cargahoraria;
    
    
    public double CalculaSalario(){
        double salario = this.vlr_cargahoraria * this.vlr_horaaula * 5.25 * 1.5; 
        
        return salario;       
        
    }
    
    
    
    public int getcd_professor(){
        
        return cd_professor;
    }
    
    public void setcd_professor(int cd_professor){
            
        this.cd_professor = cd_professor;
    
    }
    
    
    public String getNm_professor() {
        return nm_professor;
    }

    public void setNm_professor(String nm_professor) {
        this.nm_professor = nm_professor;
    }

    public String getDs_cargo() {
        return ds_cargo;
    }

    public void setDs_cargo(String ds_cargo) {
        this.ds_cargo = ds_cargo;
    }

    public double getVlr_horaaula() {
        return vlr_horaaula;
    }

    public void setVlr_horaaula(double vlr_horaaula) {
        this.vlr_horaaula = vlr_horaaula;
    }

    public double getVlr_cargahoraria() {
        return vlr_cargahoraria;
    }

    public void setVlr_cargahoraria(double vlr_cargahoraria) {
        this.vlr_cargahoraria = vlr_cargahoraria;
    }
    
   
    public static void main(String[] args) {
        
        Professor1  pro = new Professor1();
        Coordenador coo = new Coordenador();
        Diretor     dir = new Diretor();
        
        pro.setcd_professor(10);
        pro.setDs_cargo("Pleno");
        pro.setNm_professor("Marcos");
        pro.setVlr_cargahoraria(8);
        pro.setVlr_horaaula(10);
        
        
        System.out.println("Cargo = " + pro.ds_cargo);
        System.out.println("Nome = " + pro.nm_professor);
        System.out.println("Carga Horaria = " + pro.vlr_cargahoraria);
        System.out.println("Hora Aula = " + pro.vlr_horaaula);
        System.out.println("Salario = R$" + String.format("%.2f", pro.CalculaSalario()));
        
        System.out.println("---------------------------------------------");
        coo.setcd_professor(10);
        coo.setDs_cargo("Pleno");
        coo.setNm_professor("Monica");
        coo.setVlr_cargahoraria(12);
        coo.setVlr_horaaula(20);
        
        
        System.out.println("Cargo = " + coo.ds_cargo);
        System.out.println("Nome = " + coo.nm_professor);
        System.out.println("Carga Horaria = " + coo.vlr_cargahoraria);
        System.out.println("Hora Aula = " + coo.vlr_horaaula);
        System.out.println("Salario = R$" + String.format("%.2f", coo.CalculaSalario()));
        System.out.println("Salario + Bonus = R$" + String.format("%.2f", coo.CalculaSalario(1000)));
        
        System.out.println("---------------------------------------------");
        dir.setcd_professor(10);
        dir.setDs_cargo("Pleno");
        dir.setNm_professor("Luciana");
        dir.setVlr_cargahoraria(20);
        dir.setVlr_horaaula(30);
        
        
        System.out.println("Cargo = " + dir.ds_cargo);
        System.out.println("Nome = " + dir.nm_professor);
        System.out.println("Carga Horaria = " + dir.vlr_cargahoraria);
        System.out.println("Hora Aula = " + dir.vlr_horaaula);
        System.out.println("Salario = R$" + String.format("%.2f", dir.CalculaSalario()));
        System.out.println("Salario + Bonus = R$" + String.format("%.2f", dir.CalculaSalario(1000)));
    }
    
}