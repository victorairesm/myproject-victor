/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Código.LocaisVisitados;
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

        String sql = "INSERT INTO localvisitado(nome, atendente) VALUES (?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, obj.getNomelocal());
            pst.setString(2, obj.getNomeatendente());

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
    
    public List<LocaisVisitados> Listar() {
        List<LocaisVisitados> lista = new ArrayList<LocaisVisitados>();
        String sql = "SELECT * FROM localvisitado";
           PreparedStatement psm = Conexao.getPreparedStatement(sql);
           try {
               ResultSet resultado = psm.executeQuery();
               
               while(resultado.next()) {
                   LocaisVisitados obj = new LocaisVisitados();
                   obj.setNomeatendente("atendente");
                   obj.setNomelocal("nome");
                   lista.add(obj);
               }
               
           } catch(SQLException ex) {
               lista = null;
           }
           
        return lista;
    }

}
