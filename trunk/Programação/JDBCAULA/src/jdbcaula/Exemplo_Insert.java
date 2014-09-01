/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcaula;

import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exemplo_Insert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String operacao = JOptionPane.showInputDialog("Digite a opção:\n1-Listar\n2-Inserir\n3-Sair");
        while (!operacao.equals(" 3 ")) {
            if (operacao.equals(" 1 ")) {
                String sql = "INSERT INTO localvisitado(nome, atendente) VALUES (?,?)";
                String nome, atendente;
                nome = JOptionPane.showInputDialog("Digite o local:");
                atendente = JOptionPane.showInputDialog("Digite o atendente:");
                PreparedStatement pst = Conexao.getPreparedStatement(sql);

                try {
                    pst.setString(1, nome);
                    pst.setString(2, atendente);
                    Integer resultado = pst.executeUpdate();
                    if (resultado > 0) {
                        JOptionPane.showMessageDialog(null, " Local inserido com sucesso! ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }
                } catch (SQLException ex) {
                    System.out.println("Erro ao acessar o banco");
                }
            } else {

                if (operacao.equals(" 2 ")) {
                    String sql = "INSERT INTO localvisitado(nome, atendente) VALUES (?,?)";
                    String nome, atendente;
                    nome = JOptionPane.showInputDialog("Digite o local:");
                    atendente = JOptionPane.showInputDialog("Digite o atendente:");
                    PreparedStatement pst = Conexao.getPreparedStatement(sql);

                    try {
                        pst.setString(1, nome);
                        pst.setString(2, atendente);
                        Integer resultado = pst.executeUpdate();
                        if (resultado > 0) {
                            JOptionPane.showMessageDialog(null, " Local inserido com sucesso! ");
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro!");
                        }
                    } catch (SQLException ex) {
                        System.out.println("Erro ao acessar o banco");
                    }
                }
            }
        }
    }
}
