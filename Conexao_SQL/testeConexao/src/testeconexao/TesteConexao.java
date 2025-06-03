package testeconexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteConexao {

    public static  conexaO  con;  
    
    public static void main(String[] args) throws Exception {

          con  = new conexaO ();
        
          String SQL = "Select * from tabela";
          
          PreparedStatement ps = con.getConexao().prepareStatement(SQL);
       
          ResultSet rs = ps.executeQuery();
          
          while (rs.next())  {
              System.out.println(rs.getString("nm"));
          }
      
        
    }
    
}
