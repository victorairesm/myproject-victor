/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

/**
 *
 * @author Marcos
 */
public class Detetive {
    
   private String nome;
   private String email;
   private Integer ncasos;
   private String equipe;
   private Integer detetiveid;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNcasos() {
        return ncasos;
    }

    public void setNcasos(Integer ncasos) {
        this.ncasos = ncasos;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Integer getDetetiveid() {
        return detetiveid;
    }

    public void setDetetiveid(Integer detetiveid) {
        this.detetiveid = detetiveid;
    }
   
}