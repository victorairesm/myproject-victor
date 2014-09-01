/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbcaula;

import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class JDBCAULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         String sql = "SELECT * FROM  localvisitado";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            ResultSet rs = pst.executeQuery();
            System.out.println("Dados do local visitado: ");
            while(rs.next())
            {
                System.out.println("Nome:" + rs.getString("nome"));
                System.out.println("Atendente:" + rs.getString("atendente"));  
                System.out.println("local id:" + rs.getInt("localvisitadoid"));
                System.out.println("-----------------------------------------------");
            }
        } catch (SQLException ex) {
           System.out.println("Erro no acesso ao banco de dados.");
    }
    
}
}