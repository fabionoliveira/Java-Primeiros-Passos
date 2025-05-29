/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Objetos.Departamento;
import Conexao.Conecta;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author FO
 */
public class DAO_Departamento {

    Conecta con;

    ArrayList<Departamento> lista;
    Departamento linha;

    public boolean altera_Departamento(Departamento registro) throws Exception {

        boolean saida = false;

        con = new Conecta();

        String SQL = "UPDATE Departamento\n"
                + "SET  nm_Departamento = ?,\n"
                + "     abr_Departamento = ?\n"
                + "WHERE cd_Departamento = ?";

        PreparedStatement ps = con.getConexao().prepareStatement(SQL);

        ps.setString(1, registro.getDs_Departamento());
        ps.setString(2, registro.getAbr_Departamento());
        ps.setInt(3, registro.getCod_Departamento());

        if (ps.executeUpdate() > 0) {
            saida = true;
        }

        return saida;
    }

    public boolean incluir_Departamento(Departamento registro) throws Exception {

        boolean saida = false;

        con = new Conecta();

        String SQL = "INSERT INTO Departamento (  nm_Departamento, abr_Departamento) \n"
                + "             VALUES ( ?, ?)";

        PreparedStatement ps = con.getConexao().prepareStatement(SQL);

        ps.setString(1, registro.getDs_Departamento());
        ps.setString(2, registro.getAbr_Departamento());

        if (ps.executeUpdate() > 0) {
            saida = true;
        }

        return saida;
    }

    public boolean exclui_Departamento(int Codigo) throws Exception {
        boolean saida = false;

        con = new Conecta();

        String SQL = "DELETE FROM Departamento WHERE cd_Departamento =?";

        PreparedStatement ps = con.getConexao().prepareStatement(SQL);

        ps.setInt(1, Codigo);

        if (ps.executeUpdate() > 0) {
            saida = true;
        }

        return saida;

    }

    public Departamento Consulta_Departamento_Unitaria(int codigo) throws Exception {

        con = new Conecta();

        String SQL = "SELECT cd_Departamento, nm_Departamento, abr_Departamento FROM Departamento\n"
                + "WHERE cd_Departamento = ?";

        PreparedStatement ps = con.getConexao().prepareStatement(SQL);

        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();

        lista = new ArrayList();

        while (rs.next()) {
            linha = new Departamento();

            linha.setCod_Departamento(rs.getInt("cd_Departamento"));
            linha.setDs_Departamento(rs.getString("nm_Departamento"));
            linha.setAbr_Departamento(rs.getString("abr_Departamento"));

        }

        return linha;

    }

    public ArrayList<Departamento> Consulta_Departamento() throws Exception {

        con = new Conecta();

        String SQL = "SELECT cd_Departamento, nm_Departamento, abr_Departamento FROM Departamento";

        PreparedStatement ps = con.getConexao().prepareStatement(SQL);

        ResultSet rs = ps.executeQuery();

        lista = new ArrayList();

        while (rs.next()) {
            linha = new Departamento();

            linha.setCod_Departamento(rs.getInt("cd_Departamento"));
            linha.setDs_Departamento(rs.getString("nm_Departamento"));
            linha.setAbr_Departamento(rs.getString("abr_Departamento"));

            lista.add(linha);
        }

        return lista;

    }

}
