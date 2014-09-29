/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Aluno
 */
public class Ranking {
    
    private Integer rankingid;
    private String nome;
    private Integer casosresolvidos;
    private String datalateracao;

    public Integer getRankingid() {
        return rankingid;
    }

    public void setRankingid(Integer rankingid) {
        this.rankingid = rankingid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCasosresolvidos() {
        return casosresolvidos;
    }

    public void setCasosresolvidos(Integer casosresolvidos) {
        this.casosresolvidos = casosresolvidos;
    }

    public String getDatalateracao() {
        return datalateracao;
    }

    public void setDatalateracao(String datalateracao) {
        this.datalateracao = datalateracao;
    }
    
}
