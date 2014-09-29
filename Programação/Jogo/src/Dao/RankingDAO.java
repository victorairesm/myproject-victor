/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Modelo.Ranking;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class RankingDAO {
    
    public Boolean Cadastrar(Ranking obj) {
        Boolean retorno = false;

        String sql = "INSERT INTO ranking(nome, casosresolvidos, dataalteracao) VALUES (?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNome());
            pst.setInt(2, obj.getCasosresolvidos());
            pst.setString(3, obj.getDatalateracao());

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
    
    public Boolean Excluir(Ranking obj) {
        Boolean retorno = false;
        String sql = "DELETE FROM ranking WHERE ranking_id=?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setInt(1, obj.getRankingid());
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
    
        public List<Ranking> Listar() {
        List<Ranking> lista = new ArrayList<Ranking>();
        String sql = "SELECT * FROM ranking";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            ResultSet resultado = psm.executeQuery();

            while (resultado.next()) {
                Ranking obj = new Ranking();
                obj.setRankingid(resultado.getInt("ranking_id"));
                obj.setNome(resultado.getString("nome"));
                obj.setCasosresolvidos(resultado.getInt("casosresolvidos"));
                obj.setDatalateracao(resultado.getString("dataalteracao"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
            lista = null;
        }

        return lista;
    }
    
}
