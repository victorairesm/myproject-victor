/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Modelo.Cidades;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class CidadesDAO {
    
        public Boolean Cadastrar(Cidades obj) {

        Boolean retorno = false;

        String sql = "INSERT INTO cidade(nome, descricao,"
                + "dica1, dica2, dica3, item1, item2) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNomecidade());
            pst.setString(2, obj.getDescricao());
            pst.setString(3, obj.getDica1());
            pst.setString(4, obj.getDica2());
            pst.setString(5, obj.getDica3());
            pst.setString(6, obj.getItem1());
            pst.setString(7, obj.getItem2());

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
        
        public Boolean Excluir(Cidades obj)
    {
        Boolean retorno = false;
        String sql = "DELETE FROM cidade WHERE cidadeid=?";
        PreparedStatement psm = Conexao.getPreparedStatement(sql);
        try {
            psm.setInt(1, obj.getCidadeid());
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
    
    public List<Cidades> Listar() {
        List<Cidades> lista = new ArrayList<Cidades>();
        String sql = "SELECT * FROM cidade";
           PreparedStatement psm = Conexao.getPreparedStatement(sql);
           try {
               ResultSet resultado = psm.executeQuery();
               
               while(resultado.next()) {
                   Cidades obj = new Cidades();
                   obj.setCidadeid(resultado.getInt("cidadeid"));
                   obj.setNomecidade(resultado.getString("nome"));
                   obj.setDescricao(resultado.getString("descricao"));
                   obj.setDica1(resultado.getString("dica1"));
                   obj.setDica2(resultado.getString("dica2"));
                   obj.setDica3(resultado.getString("dica3"));
                   obj.setItem1(resultado.getString("item1"));
                   obj.setItem2(resultado.getString("Item2"));
                   lista.add(obj);
               }
               
           } catch(SQLException ex) {
               System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());
               lista = null;
           }
           
        return lista;
    }
    
    public Cidades Consultar(Cidades obj2) {

        String sql = "SELECT * FROM cidade WHERE nome = ?";
        Cidades obj = null;
        PreparedStatement psm = Conexao.getPreparedStatement(sql);

        try {
            psm.setString(1, obj2.getNomecidade());
            ResultSet resultado = psm.executeQuery();

            if (resultado.next()) {
                obj = new Cidades();
                obj.setCidadeid(resultado.getInt("cidadeid"));
                obj.setNomecidade(resultado.getString("nome"));
                obj.setDescricao(resultado.getString("descricao"));
                obj.setDica1(resultado.getString("dica1"));
                obj.setDica2(resultado.getString("dica2"));
                obj.setDica3(resultado.getString("dica3"));
                obj.setItem1(resultado.getString("item1"));
                obj.setItem2(resultado.getString("item2"));

            }

        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco: " + ex.getMessage().toString());

        }

        return obj;
    }
    
}

