/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janela;

import Modelo.Suspeitos;
import Dao.SuspeitosDAO;
import UTIL.ManipularImagem;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class SuspeitosGUI extends javax.swing.JInternalFrame {

    List<Suspeitos> lista = new ArrayList<Suspeitos>();
    SuspeitosDAO dao;
    Integer posicaoLista;
    BufferedImage imagem;

    /**
     * Creates new form Suspeitos
     */
    public SuspeitosGUI() {
        initComponents();
        dao = new SuspeitosDAO();
        lista = dao.Listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomesuspeito = new javax.swing.JTextField();
        txtOcupacao = new javax.swing.JTextField();
        txtEsporte = new javax.swing.JTextField();
        txtCabelo = new javax.swing.JTextField();
        txtCarro = new javax.swing.JTextField();
        txtTracos = new javax.swing.JTextField();
        txtOutros = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        cbxSexo = new javax.swing.JComboBox();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        lblExibicao = new javax.swing.JLabel();
        btnTodos = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setText("Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnUltimo)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo))
                .addContainerGap())
        );

        jLabel1.setText("Nome:");

        jLabel2.setText("Sexo:");

        jLabel3.setText("Ocupação:");

        jLabel4.setText("Esporte:");

        jLabel5.setText("Cabelo:");

        jLabel6.setText("Carro:");

        jLabel7.setText("Traços:");

        jLabel8.setText("Outros:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnConsultar)
                    .addComponent(btnRemover)
                    .addComponent(btnNovo)
                    .addComponent(btnAtualizar))
                .addContainerGap())
        );

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        txtCodigo.setEditable(false);

        jLabel9.setText("Código");

        jLabel10.setText("Imagem:");

        btnSelecionar.setText("Selecionar Imagem");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        lblExibicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExibicao.setForeground(new java.awt.Color(204, 0, 0));
        lblExibicao.setText("Todos os registros");

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1)))
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomesuspeito)
                                    .addComponent(txtOcupacao)
                                    .addComponent(txtEsporte)
                                    .addComponent(txtCabelo)
                                    .addComponent(txtCarro)
                                    .addComponent(txtTracos)
                                    .addComponent(txtOutros)
                                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSelecionar))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblExibicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTodos)
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExibicao)
                    .addComponent(btnTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomesuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCabelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTracos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelecionar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        Suspeitos jogo = lista.get(0);

        txtCodigo.setText(jogo.getSuspeitoid().toString());
        txtNomesuspeito.setText(jogo.getNomesuspeito());
        cbxSexo.setSelectedItem(jogo.getSexo());
        txtOcupacao.setText(jogo.getOcupacao());
        txtEsporte.setText(jogo.getEsporte());
        txtCabelo.setText(jogo.getCabelo());
        txtCarro.setText(jogo.getCarro());
        txtTracos.setText(jogo.getTracos());
        txtOutros.setText(jogo.getOutros());
        exibeImagem(jogo.getImagem());

        posicaoLista = 0;
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (posicaoLista > 0) {
            posicaoLista = posicaoLista - 1;
            Suspeitos jogo = lista.get(posicaoLista);

            txtCodigo.setText(jogo.getSuspeitoid().toString());
            txtNomesuspeito.setText(jogo.getNomesuspeito());
            cbxSexo.setSelectedItem(jogo.getSexo());
            txtOcupacao.setText(jogo.getOcupacao());
            txtEsporte.setText(jogo.getEsporte());
            txtCabelo.setText(jogo.getCabelo());
            txtCarro.setText(jogo.getCarro());
            txtTracos.setText(jogo.getTracos());
            txtOutros.setText(jogo.getOutros());
            exibeImagem(jogo.getImagem());

        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        Suspeitos jogo = lista.get(lista.size() - 1);

        txtCodigo.setText(jogo.getSuspeitoid().toString());
        txtNomesuspeito.setText(jogo.getNomesuspeito());
        cbxSexo.setSelectedItem(jogo.getSexo());
        txtOcupacao.setText(jogo.getOcupacao());
        txtEsporte.setText(jogo.getEsporte());
        txtCabelo.setText(jogo.getCabelo());
        txtCarro.setText(jogo.getCarro());
        txtTracos.setText(jogo.getTracos());
        txtOutros.setText(jogo.getOutros());
        exibeImagem(jogo.getImagem());

        posicaoLista = lista.size() - 1;
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if (posicaoLista < (lista.size() - 1)) {
            posicaoLista = posicaoLista + 1;
            Suspeitos jogo = lista.get(posicaoLista);

            txtCodigo.setText(jogo.getSuspeitoid().toString());
            txtNomesuspeito.setText(jogo.getNomesuspeito());
            cbxSexo.setSelectedItem(jogo.getSexo());
            txtOcupacao.setText(jogo.getOcupacao());
            txtEsporte.setText(jogo.getEsporte());
            txtCabelo.setText(jogo.getCabelo());
            txtCarro.setText(jogo.getCarro());
            txtTracos.setText(jogo.getTracos());
            txtOutros.setText(jogo.getOutros());
            exibeImagem(jogo.getImagem());
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Suspeitos jogo = new Suspeitos();

        jogo.setNomesuspeito(txtNomesuspeito.getText());
        jogo.setSexo(cbxSexo.getSelectedItem().toString());
        jogo.setOcupacao(txtOcupacao.getText());
        jogo.setEsporte(txtEsporte.getText());
        jogo.setCabelo(txtCabelo.getText());
        jogo.setCarro(txtCarro.getText());
        jogo.setTracos(txtTracos.getText());
        jogo.setOutros(txtOutros.getText());
        jogo.setImagem(ManipularImagem.getImgBytes(imagem));

        Boolean retorno = dao.Cadastrar(jogo);
        if (retorno = true) {
            JOptionPane.showMessageDialog(null, "Suspeito inserido com sucesso");
            lista = dao.Listar();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro");
        }

        limparDados();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String consulta
                = JOptionPane.showInputDialog("Informe o nome do suspeito a ser"
                        + " consultado ");

        boolean encontrou = false;

        int i = 0;
        lista = dao.Consultar(consulta);
        encontrou = (lista.size() > 0);
        String saidaLabel = "";
        if (encontrou == false) {
            saidaLabel = "Filtrando por: " + consulta + ". Nenhum registro encontrado";
            limparDados();
        } else {
            saidaLabel = "Filtrando por: " + consulta + ". Exibindo " + lista.size() + " registros";

            Modelo.Suspeitos jogo = lista.get(posicaoLista);
            posicaoLista = 0;
            txtCodigo.setText(jogo.getSuspeitoid().toString());
            txtNomesuspeito.setText(jogo.getNomesuspeito());
            cbxSexo.setSelectedItem(jogo.getSexo());
            txtOcupacao.setText(jogo.getOcupacao());
            txtEsporte.setText(jogo.getEsporte());
            txtCabelo.setText(jogo.getCabelo());
            txtCarro.setText(jogo.getCarro());
            txtTracos.setText(jogo.getTracos());
            txtOutros.setText(jogo.getOutros());
            exibeImagem(jogo.getImagem());
        }
        lblExibicao.setText(saidaLabel);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparDados();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir o suspeito?");

        if (confirma == 0) {

            Suspeitos obj = new Suspeitos();
            obj.setSuspeitoid(Integer.parseInt(txtCodigo.getText()));
            Boolean retorno = dao.Excluir(obj);
            if (retorno) {
                limparDados();
                JOptionPane.showMessageDialog(null, "Suspeito excluído com sucesso!");
                lista = dao.Listar();
            } else {
                JOptionPane.showMessageDialog(null, "Falha na exclusão do registro!");
                lista = dao.Listar();
            }

        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Suspeitos jogo = new Suspeitos();

        jogo.setNomesuspeito(txtNomesuspeito.getText());
        jogo.setSexo(cbxSexo.getSelectedItem().toString());
        jogo.setOcupacao(txtOcupacao.getText());
        jogo.setEsporte(txtEsporte.getText());
        jogo.setCabelo(txtCabelo.getText());
        jogo.setCarro(txtCarro.getText());
        jogo.setTracos(txtTracos.getText());
        jogo.setOutros(txtOutros.getText());
        jogo.setImagem(ManipularImagem.getImgBytes(imagem));
        jogo.setSuspeitoid(Integer.parseInt(txtCodigo.getText()));

        Boolean retorno = dao.Atualizar(jogo);
        if (retorno) {
            JOptionPane.showMessageDialog(null, "Suspeito atualizado com sucesso!");
            limparDados();
            lista = dao.Listar();
        } else {
            JOptionPane.showMessageDialog(null, "Falha na atualização do registro!");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            imagem = ManipularImagem.setImagemDimensao(file.getAbsolutePath(), 160, 160);
            lblImagem.setIcon(new ImageIcon(imagem));
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        lista = dao.Listar();
        lblExibicao.setText("Todos os registros");

        Modelo.Suspeitos jogo = lista.get(posicaoLista);
        posicaoLista = 0;
        txtCodigo.setText(jogo.getSuspeitoid().toString());
        txtNomesuspeito.setText(jogo.getNomesuspeito());
        cbxSexo.setSelectedItem(jogo.getSexo());
        txtOcupacao.setText(jogo.getOcupacao());
        txtEsporte.setText(jogo.getEsporte());
        txtCabelo.setText(jogo.getCabelo());
        txtCarro.setText(jogo.getCarro());
        txtTracos.setText(jogo.getTracos());
        txtOutros.setText(jogo.getOutros());
        exibeImagem(jogo.getImagem());
    }//GEN-LAST:event_btnTodosActionPerformed

    private void exibeImagem(byte[] minhaimagem) {
        //primeiro verifica se tem a imagem
        //se tem convert para inputstream que é o formato reconhecido pelo ImageIO

        if (minhaimagem != null) {
            InputStream input = new ByteArrayInputStream(minhaimagem);
            try {
                imagem = ImageIO.read(input);
            } catch (IOException ex) {
            }
            lblImagem.setIcon(new ImageIcon(imagem));

        } else {
            lblImagem.setIcon(null);
            imagem = null;
        }

    }
    
    public void limparDados() {
        txtCodigo.setText("");
        txtNomesuspeito.setText("");
        cbxSexo.setSelectedIndex(-1);
        txtOcupacao.setText("");
        txtEsporte.setText("");
        txtCabelo.setText("");
        txtCarro.setText("");
        txtTracos.setText("");
        txtOutros.setText("");
        lblImagem.setIcon(null);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuspeitosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuspeitosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuspeitosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuspeitosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuspeitosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblExibicao;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtCabelo;
    private javax.swing.JTextField txtCarro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEsporte;
    private javax.swing.JTextField txtNomesuspeito;
    private javax.swing.JTextField txtOcupacao;
    private javax.swing.JTextField txtOutros;
    private javax.swing.JTextField txtTracos;
    // End of variables declaration//GEN-END:variables
}
