/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeconexao;


import java.sql.Connection;
import java.sql.DriverManager;

public class conexaO {
    
	private Connection conexao;
	public conexaO() throws Exception{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=teste";
            conexao = DriverManager.getConnection(url,"usuario","senha");
        
        }
	public Connection getConexao(){
		return conexao;
        }
}

