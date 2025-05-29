
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aluno
 */
public class Conecta {
    private Connection conexao;
	public Conecta() throws Exception{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Projeto2022";
            conexao = DriverManager.getConnection(url,"usuario","senha");
        
        }
	public Connection getConexao(){
		return conexao;
        }
}
