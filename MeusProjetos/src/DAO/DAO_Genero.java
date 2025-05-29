package DAO; // data Access objetct CRUD create read update delete 

import Objetos.Genero;
import Conexao.Conecta;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DAO_Genero {

    Conecta con;
    
    ArrayList<Genero>  lista;
    Genero             linha;
    
      public boolean altera_Genero (Genero registro) throws Exception {
         
           boolean saida = false;
          
           con = new Conecta();
          
           String SQL = "UPDATE Genero\n" +
                        "SET  ds_Genero = ?,\n" +
                        "     abr_Genero = ?\n" +
                        "WHERE cd_Genero = ?";
           
           PreparedStatement ps = con.getConexao().prepareStatement(SQL);
         
           ps.setString(1, registro.getDs_genero());
           ps.setString(2, registro.getAbr_Genero());
           ps.setInt(3, registro.getCd_genero());
               
           if(ps.executeUpdate()>0) {
               saida=true;
           }
           
           return saida;
      }
    
      public boolean incluir_Genero (Genero registro) throws Exception {
         
           boolean saida = false;
          
           con = new Conecta();
          
           String SQL = "INSERT INTO Genero (  ds_Genero, abr_Genero) \n" +
                        "             VALUES ( ?, ?)";
           
           PreparedStatement ps = con.getConexao().prepareStatement(SQL);
         
           ps.setString(1, registro.getDs_genero());
           ps.setString(2, registro.getAbr_Genero());
               
           if(ps.executeUpdate()>0) {
               saida=true;
           }
           
           return saida;
      }
      
      
      public boolean exclui_Genero (int Codigo) throws Exception {
          boolean saida = false;
          
          con = new Conecta();
          
           String SQL = "DELETE FROM Genero WHERE cd_Genero =?";

           PreparedStatement ps = con.getConexao().prepareStatement(SQL);
         
           ps.setInt(1, Codigo);
           
           if(ps.executeUpdate()>0) {
               saida=true;
           }
           
           
          return saida;
          
      }
    
      public Genero  Consulta_Genero_Unitaria (int codigo) throws Exception {
        
         con = new Conecta();
         
         String SQL = "SELECT cd_Genero, ds_Genero, abr_Genero FROM genero\n" +
                      "WHERE cd_Genero = ?";
         
         PreparedStatement ps = con.getConexao().prepareStatement(SQL);
         
         ps.setInt(1, codigo);
         ResultSet rs = ps.executeQuery();
         
         lista = new ArrayList();
         
         while (rs.next()) {
            linha = new Genero ();
            
            linha.setCd_genero(rs.getInt("cd_Genero"));
            linha.setDs_genero(rs.getString("ds_Genero"));
            linha.setAbr_Genero(rs.getString("abr_Genero"));
            
            
         }
             
        return linha;
      
    }
   
    
      public ArrayList<Genero>  Consulta_Genero () throws Exception {
        
         con = new Conecta();
         
         String SQL = "SELECT cd_Genero, ds_Genero, abr_Genero FROM genero";
         
         PreparedStatement ps = con.getConexao().prepareStatement(SQL);
         
         ResultSet rs = ps.executeQuery();
         
         lista = new ArrayList();
         
         while (rs.next()) {
            linha = new Genero ();
            
            linha.setCd_genero(rs.getInt("cd_Genero"));
            linha.setDs_genero(rs.getString("ds_Genero"));
            linha.setAbr_Genero(rs.getString("abr_Genero"));
            
            lista.add(linha);
         }
             
        return lista;
      
    }
    

    
}
