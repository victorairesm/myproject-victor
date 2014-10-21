/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Suspeitos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class SuspeitosDAO {

    public Boolean Cadastrar(Suspeitos obj) {

        Boolean retorno = false;

        String sql = "INSERT INTO suspeito(nome, ocupacao,"
                + "esporte, cabelo, carro, tracos, outros, imagem, sexo) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNomesuspeito());
            pst.setString(2, obj.getOcupacao());
            pst.setString(3, obj.getEsporte());
            pst.setString(4, obj.getCabelo());
            pst.setString(5, obj.getCarro());
            pst.setString(6, obj.getTracos());
            pst.setString(7, obj.getOutros());
            pst.setBytes(8, obj.getImagem());
            pst.setString(9, obj.getSexo());

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

    public Boolean Excluir(Suspeitos obj) {
        Boolean retorno = false;
        String sql = "DELETE FROM suspeito WHERE suspeitoid=?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setInt(1, obj.getSuspeitoid());
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

    public List<Suspeitos> Listar() {
        List<Suspeitos> lista = new ArrayList<Suspeitos>();
        String sql = "SELECT * FROM suspeito";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();

            while (resultado.next()) {
                Suspeitos obj = new Suspeitos();
                obj.setSuspeitoid(resultado.getInt("suspeitoid"));
                obj.setSexo(resultado.getString("sexo"));
                obj.setNomesuspeito(resultado.getString("nome"));
                obj.setOcupacao(resultado.getString("ocupacao"));
                obj.setEsporte(resultado.getString("esporte"));
                obj.setCabelo(resultado.getString("cabelo"));
                obj.setCarro(resultado.getString("carro"));
                obj.setTracos(resultado.getString("tracos"));
                obj.setOutros(resultado.getString("outros"));
                obj.setImagem(resultado.getBytes("imagem"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            lista = null;
        }

        return lista;
    }

    public List<Suspeitos> Consultar(String filtro) {
        List<Suspeitos> lista = new ArrayList<Suspeitos>();
        String sql = "SELECT * FROM suspeito WHERE nome ILIKE ?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setString(1, "%" + filtro + "%");
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                Suspeitos obj = new Suspeitos();
                obj.setSuspeitoid(resultado.getInt("suspeitoid"));
                obj.setSexo(resultado.getString("sexo"));
                obj.setNomesuspeito(resultado.getString("nome"));
                obj.setOcupacao(resultado.getString("ocupacao"));
                obj.setEsporte(resultado.getString("esporte"));
                obj.setCabelo(resultado.getString("cabelo"));
                obj.setCarro(resultado.getString("carro"));
                obj.setTracos(resultado.getString("tracos"));
                obj.setOutros(resultado.getString("outros"));
                obj.setImagem(resultado.getBytes("imagem"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            lista = null;
        }

        return lista;
    }

    public Boolean Atualizar(Suspeitos obj) {

        Boolean retorno = false;

        String sql = "UPDATE suspeito SET nome = ?, sexo = ?, ocupacao = ?,"
                + "esporte = ?, cabelo = ?,carro = ?, tracos = ?,"
                + "outros = ?, imagem = ? WHERE suspeitoid = ?";

        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNomesuspeito());
            pst.setString(2, obj.getSexo());
            pst.setString(3, obj.getOcupacao());
            pst.setString(4, obj.getEsporte());
            pst.setString(5, obj.getCabelo());
            pst.setString(6, obj.getCarro());
            pst.setString(7, obj.getTracos());
            pst.setString(8, obj.getOutros());
            pst.setBytes(9, obj.getImagem());
            pst.setInt(10, obj.getSuspeitoid());

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
    
        public Suspeitos ListarRandom() {
        Suspeitos retorno = new Suspeitos();
        String sql = "SELECT * FROM detetive ORDER BY RANDOM() LIMIT 1;";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();

            if (resultado.next()) {
                Suspeitos obj = new Suspeitos();
                obj.setSuspeitoid(resultado.getInt("suspeitoid"));
                obj.setSexo(resultado.getString("sexo"));
                obj.setNomesuspeito(resultado.getString("nome"));
                obj.setOcupacao(resultado.getString("ocupacao"));
                obj.setEsporte(resultado.getString("esporte"));
                obj.setCabelo(resultado.getString("cabelo"));
                obj.setCarro(resultado.getString("carro"));
                obj.setTracos(resultado.getString("tracos"));
                obj.setOutros(resultado.getString("outros"));
                obj.setImagem(resultado.getBytes("imagem"));
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            retorno = null;
        }

        return retorno;
    }

}
