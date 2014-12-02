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
        String sql = "SELECT * FROM suspeito ORDER BY RANDOM() LIMIT 1;";
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
                retorno = obj;
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            retorno = null;
        }

        return retorno;
    }

    public List<String> retornaCabelo() {
        String sql = "SELECT DISTINCT cabelo FROM suspeito ORDER BY cabelo";
        List<String> retorno = new ArrayList<>();
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                String cabelo = resultado.getString("cabelo");
                retorno.add(cabelo);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            retorno = null;
        }
        return retorno;
    }

    public List<String> retornaCarro() {
        String sql = "SELECT DISTINCT carro FROM suspeito ORDER BY carro";
        List<String> retorno = new ArrayList<>();
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                String carro = resultado.getString("carro");
                retorno.add(carro);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            retorno = null;
        }
        return retorno;
    }

    public List<String> retornaEsporte() {
        String sql = "SELECT DISTINCT esporte FROM suspeito ORDER BY esporte";
        List<String> retorno = new ArrayList<>();
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                String esporte = resultado.getString("esporte");
                retorno.add(esporte);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            retorno = null;
        }
        return retorno;
    }

    public List<String> retornaOcupacao() {
        String sql = "SELECT DISTINCT ocupacao FROM suspeito ORDER BY ocupacao";
        List<String> retorno = new ArrayList<>();
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                String ocupacao = resultado.getString("ocupacao");
                retorno.add(ocupacao);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            retorno = null;
        }
        return retorno;
    }

    public List<String> retornaTracos() {
        String sql = "SELECT DISTINCT tracos FROM suspeito ORDER BY tracos";
        List<String> retorno = new ArrayList<>();
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                String tracos = resultado.getString("tracos");
                retorno.add(tracos);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            retorno = null;
        }
        return retorno;
    }

    public List<String> retornaOutros() {
        String sql = "SELECT DISTINCT outros FROM suspeito ORDER BY outros";
        List<String> retorno = new ArrayList<>();
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();
            while (resultado.next()) {
                String outros = resultado.getString("outros");
                retorno.add(outros);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            retorno = null;
        }
        return retorno;
    }

    public List<Suspeitos> buscaMandato(String ocupacao, String esporte, String carro,
            String sexo, String outros, String cabelo, String tracos) {

        List<Suspeitos> lista = new ArrayList<Suspeitos>();
        try {
            String sql = "SELECT * FROM SUSPEITO WHERE";
            if (cabelo.isEmpty() == false) {
                sql = sql + "cabelo= '" + cabelo + "' AND";
            }
            if (carro.isEmpty() == false) {
                sql = sql + "carro= '" + carro + "' AND";
            }
            if (sexo.isEmpty() == false) {
                sql = sql + "sexo= '" + sexo + "' AND";
            }
            if (esporte.isEmpty() == false) {
                sql = sql + "esporte= '" + esporte + "' AND";
            }
            if (ocupacao.isEmpty() == false) {
                sql = sql + "ocupacao= '" + ocupacao + "' AND";
            }
            if (tracos.isEmpty() == false) {
                sql = sql + "tracos= '" + tracos + "' AND";
            }
            if (outros.isEmpty() == false) {
                sql = sql + "outros= '" + outros + "' AND";
            }
            sql = sql.substring(0, sql.length() - 5);

            PreparedStatement psm = Conexao.getPreparedStatement(sql);

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

        } catch (Exception ex) {
            System.out.println(" Erro ao acessar o banco" + ex.getMessage().toString());
        }
        return lista;
    }

}
