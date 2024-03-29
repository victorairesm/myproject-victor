/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.LocaisVisitados;
import Dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class LocaisVisitadosDAO {

    public Boolean Cadastrar(LocaisVisitados obj) {

        Boolean retorno = false;

        String sql = "INSERT INTO localvisitado(nome, atendente, imagem) VALUES (?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNomelocal());
            pst.setString(2, obj.getNomeatendente());
            pst.setBytes(3, obj.getImagem());

            Integer resultado = pst.executeUpdate();
            if (resultado > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            return false;
        }
        return retorno;
    }

    public Boolean Excluir(LocaisVisitados obj) {
        Boolean retorno = false;
        String sql = "DELETE FROM localvisitado WHERE localvisitadoid=?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setInt(1, obj.getLocalvisitadoid());
            Integer resultado = psm.executeUpdate();
            if (resultado > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco: " + ex.getMessage());
        }
        return retorno;
    }

    public List<LocaisVisitados> Listar() {
        List<LocaisVisitados> lista = new ArrayList<LocaisVisitados>();
        String sql = "SELECT * FROM localvisitado";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();

            while (resultado.next()) {
                LocaisVisitados obj = new LocaisVisitados();
                obj.setLocalvisitadoid(resultado.getInt("localvisitadoid"));
                obj.setNomeatendente(resultado.getString("atendente"));
                obj.setNomelocal(resultado.getString("nome"));
                obj.setImagem(resultado.getBytes("imagem"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            lista = null;
        }

        return lista;
    }
    
        public List<LocaisVisitados> ListarTres() {
        List<LocaisVisitados> lista = new ArrayList<LocaisVisitados>();
        String sql = "SELECT * FROM localvisitado ORDER BY RANDOM() LIMIT 3";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();

            while (resultado.next()) {
                LocaisVisitados obj = new LocaisVisitados();
                obj.setLocalvisitadoid(resultado.getInt("localvisitadoid"));
                obj.setNomeatendente(resultado.getString("atendente"));
                obj.setNomelocal(resultado.getString("nome"));
                obj.setImagem(resultado.getBytes("imagem"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            lista = null;
        }

        return lista;
    }

    public List<LocaisVisitados> Consultar(String filtro) {
        List<LocaisVisitados> lista = new ArrayList<LocaisVisitados>();
        String sql = "SELECT * FROM localvisitado WHERE nome ILIKE ?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setString(1, "%" + filtro + "%");
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                LocaisVisitados obj = new LocaisVisitados();
                obj.setLocalvisitadoid(resultado.getInt("localvisitadoid"));
                obj.setNomeatendente(resultado.getString("atendente"));
                obj.setNomelocal(resultado.getString("nome"));
                obj.setImagem(resultado.getBytes("imagem"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            lista = null;
        }

        return lista;
    }
    
    public Boolean Atualizar(LocaisVisitados obj) {

        Boolean retorno = false;

        String sql = "UPDATE localvisitado SET nome = ?, atendente = ?,"
                + "imagem = ? "
                + "WHERE localvisitadoid = ?";
       
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNomelocal());
            pst.setString(2, obj.getNomeatendente());
            pst.setBytes(3, obj.getImagem());
            pst.setInt(4, obj.getLocalvisitadoid());

            Integer resultado = pst.executeUpdate();
            if (resultado > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            return false;
        }
        return retorno;
    }

}
