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
                + "esporte, cabelo, carro, tracos, outros) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNomesuspeito());
            pst.setString(2, obj.getOcupacao());
            pst.setString(3, obj.getEsporte());
            pst.setString(3, obj.getCabelo());
            pst.setString(3, obj.getCarro());
            pst.setString(3, obj.getTracos());
            pst.setString(3, obj.getOutros());

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
    
        public Boolean Excluir(Suspeitos obj)
    {
        Boolean retorno = false;
        String sql = "DELETE FROM suspeito WHERE suspeitoid=?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setInt(1, obj.getSuspeitoid());
            Integer resultado = psm.executeUpdate();
            if(resultado>0) {
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
               
               while(resultado.next()) {
                   Suspeitos obj = new Suspeitos();
                   obj.setSuspeitoid(resultado.getInt("suspeitoid"));
                   obj.setNomesuspeito(resultado.getString("nome"));
                   obj.setOcupacao(resultado.getString("ocupacao"));
                   obj.setEsporte(resultado.getString("esporte"));
                   obj.setCabelo(resultado.getString("cabelo"));
                   obj.setCarro(resultado.getString("carro"));
                   obj.setTracos(resultado.getString("tracos"));
                   obj.setOutros(resultado.getString("outros"));
                   lista.add(obj);
               }
               
           } catch(SQLException ex) {
               System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
               lista = null;
           }
           
        return lista;
    }
    
}
