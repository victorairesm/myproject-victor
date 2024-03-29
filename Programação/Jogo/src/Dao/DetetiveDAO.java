/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Detetive;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class DetetiveDAO {

    public Boolean Cadastrar(Detetive obj) {

        Boolean retorno = false;

        String sql = "INSERT INTO detetive(nome, email,"
                + "numerocasos, nomeequipe,imagem) VALUES (?,?,?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getEmail());
            pst.setInt(3, obj.getNcasos());
            pst.setString(4, obj.getEquipe());
            pst.setBytes(5, obj.getImagem());

            Integer resultado = pst.executeUpdate();

            retorno = (resultado > 0);

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            return false;
        }
        return retorno;
    }

    public Boolean Excluir(Detetive obj) {
        Boolean retorno = false;
        String sql = "DELETE FROM detetive WHERE detetiveid=?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setInt(1, obj.getDetetiveid());

            Integer resultado = psm.executeUpdate();

            retorno = (resultado > 0);

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco: " + ex.getMessage());
        }
        return retorno;
    }

    public List<Detetive> Listar() {
        List<Detetive> lista = new ArrayList<Detetive>();
        String sql = "SELECT * FROM detetive";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();

            while (resultado.next()) {
                Detetive obj = new Detetive();
                obj.setDetetiveid(resultado.getInt("detetiveid"));
                obj.setNome(resultado.getString("nome"));
                obj.setEmail(resultado.getString("email"));
                obj.setNcasos(resultado.getInt("numerocasos"));
                obj.setEquipe(resultado.getString("nomeequipe"));
                obj.setImagem(resultado.getBytes("imagem"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            lista = null;
        }

        return lista;
    }

    public Boolean Atualizar(Detetive obj) {

        Boolean retorno = false;

        String sql = "UPDATE detetive SET nome = ?, email = ?,"
                + "numerocasos = ?, nomeequipe = ?,imagem = ?"
                + " WHERE detetiveid = ?";

        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getEmail());
            pst.setInt(3, obj.getNcasos());
            pst.setString(4, obj.getEquipe());
            pst.setBytes(5, obj.getImagem());
            pst.setInt(6, obj.getDetetiveid());

            Integer resultado = pst.executeUpdate();

            retorno = (resultado > 0);

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            return false;
        }
        return retorno;
    }

    public List<Detetive> Consultar(String filtro) {
        List<Detetive> lista = new ArrayList<Detetive>();
        String sql = "SELECT * FROM detetive WHERE nome ILIKE ?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setString(1, "%" + filtro + "%");
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                Detetive obj = new Detetive();
                obj.setDetetiveid(resultado.getInt("detetiveid"));
                obj.setNome(resultado.getString("nome"));
                obj.setEmail(resultado.getString("email"));
                obj.setNcasos(resultado.getInt("numerocasos"));
                obj.setEquipe(resultado.getString("nomeequipe"));
                obj.setImagem(resultado.getBytes("imagem"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            lista = null;
        }

        return lista;
    }
    
        public Detetive ConsultarEmail(String filtro) {
        Detetive retorno = null;
        String sql = "SELECT * FROM detetive WHERE email = ?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setString(1, filtro);
            ResultSet resultado = psm.executeQuery();
            if (resultado.next()) {
                retorno = new Detetive();
                retorno.setDetetiveid(resultado.getInt("detetiveid"));
                retorno.setNome(resultado.getString("nome"));
                retorno.setEmail(resultado.getString("email"));
                retorno.setNcasos(resultado.getInt("numerocasos"));
                retorno.setEquipe(resultado.getString("nomeequipe"));
                retorno.setImagem(resultado.getBytes("imagem"));
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
        }

        return retorno;
    }

}
