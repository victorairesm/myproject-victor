/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Codigo.Detetive;
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

        String sql = "INSERT INTO detetive(detetiveid, nome, email"
                + "numerocasos, nomeequipe) VALUES (?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getEmail());
            pst.setString(2, obj.getEquipe());
            pst.setString(3, obj.getNome());
            pst.setInt(4, obj.getNcasos());

            Integer resultado = pst.executeUpdate();
            if (resultado > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco");
            return false;
        }
        return retorno;
    }
    
    public List<Detetive> Listar() {
        List<Detetive> lista = new ArrayList<Detetive>();
        String sql = "SELECT * FROM detetive";
           PreparedStatement psm = Conexao.getPreparedStatement(sql);
           try {
               ResultSet resultado = psm.executeQuery();
               
               while(resultado.next()) {
                   Detetive obj = new Detetive();
                   obj.setDetetiveid(resultado.getInt("detetiveid"));
                   obj.setNome(resultado.getString("nome"));
                   obj.setEmail(resultado.getString("email"));
                   obj.setNcasos(resultado.getInt("numerocasos"));
                   obj.setEquipe(resultado.getString("nomeequipe"));
                   lista.add(obj);
               }
               
           } catch(SQLException ex) {
               lista = null;
           }
           
        return lista;
    }
    
}
