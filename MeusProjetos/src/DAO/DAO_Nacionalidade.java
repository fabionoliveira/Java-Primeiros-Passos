package DAO;


import Objetos.Nacionalidade;
import Conexao.Conecta;
import Objetos.Genero;


import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO_Nacionalidade {


    Conecta con;
    
    ArrayList<Nacionalidade>  lista;
    Nacionalidade             linha;
    
        public boolean incluir_Nacionalidade (Nacionalidade registro) throws Exception {
        
            boolean saida = false;
        
        con = new Conecta();
        
        String SQL = "INSERT INTO Nacionalidade (ds_Nacionalidade, abr_Nacionalidade) \n" +
                     "        VALUES (?,?)";
        
         PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        
         ps.setString(1, registro.getDs_Nacionalidade());
         ps.setString(2, registro.getAbr_Nacionalidade());
         
        
        if (ps.executeUpdate()>0) {
            saida = true;
        }
        
        return saida;
    }
    
    
    public boolean altera_Nacionalidade (Nacionalidade registro) throws Exception {
        boolean saida = false;
        
        con = new Conecta();
        
        String SQL = "UPDATE Nacionalidade\n" +
                     "SET    ds_Nacionalidade  = ?, \n" +
                     "       abr_Nacionalidade = ?  \n" +
                     "WHERE  cd_Nacionalidade  = ?    ";
        
         PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        
         ps.setString(1, registro.getDs_Nacionalidade());
         ps.setString(2, registro.getAbr_Nacionalidade());
         ps.setInt(3, registro.getCd_Nacionalidade());
        
        if (ps.executeUpdate()>0) {
            saida = true;
        }
        
        return saida;
    }
    
    public boolean Excluir_Nacionalidade (int Codigo) throws SQLException, Exception  {    
        boolean saida = false;
        
        con = new Conecta();
        
        String SQL ="DELETE FROM Nacionalidade WHERE cd_Nacionalidade = ?"; 
        
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        
        ps.setInt(1, Codigo);
        
        if (ps.executeUpdate()>0) {
            saida = true;
        }
        
        return saida;
    }
    
    
    
    public ArrayList<Nacionalidade> Consulta_Nacionalidade () throws SQLException, Exception  {
        
        con = new Conecta();
        
        String SQL ="SELECT cd_Nacionalidade, ds_Nacionalidade, abr_Nacionalidade FROM Nacionalidade"; 
        
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
         
         
         ResultSet rs = ps.executeQuery();
         
         lista = new ArrayList();
         
         while (rs.next()) {
            linha = new Nacionalidade ();
            
           
            linha.setCd_Nacionalidade(rs.getInt("cd_Nacionalidade"));
            linha.setDs_Nacionalidade(rs.getString("ds_Nacionalidade"));
            linha.setAbr_Nacionalidade(rs.getString("abr_Nacionalidade"));
            
            lista.add(linha);
         }
        
        return lista;
    }
    
 
    
     public Nacionalidade Consulta_Nacionalidade_Unitaria (int codigo) throws SQLException, Exception  {
        
        con = new Conecta();
        
        String SQL ="SELECT cd_Nacionalidade, ds_Nacionalidade, abr_Nacionalidade \n" +
                    "FROM Nacionalidade\n" +
                    "WHERE cd_Nacionalidade = ?"; 
        
        
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
         
        ps.setInt(1, codigo);
        
        ResultSet rs = ps.executeQuery();
         
                 
         while (rs.next()) {
            linha = new Nacionalidade ();
            
           
            linha.setCd_Nacionalidade(rs.getInt("cd_Nacionalidade"));
            linha.setDs_Nacionalidade(rs.getString("ds_Nacionalidade"));
            linha.setAbr_Nacionalidade(rs.getString("abr_Nacionalidade"));
            
        
         }
        
        return linha;
    }
}
