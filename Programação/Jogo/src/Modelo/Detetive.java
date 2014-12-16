/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    private byte[] imagem;

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

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getPatente() {
        String retorno = "";
        if (this.getNcasos() < 3) {
            retorno = "Recruta";
            return retorno;
        } else {
            if (this.getNcasos() < 5) {
                retorno = "Oficial";
                return retorno;
            } else {
                if (this.getNcasos() < 8) {
                    retorno = "Delegado";
                    return retorno;
                } else {
                    retorno = "Herói de Guerra";
                    return retorno;
                }
            }
        }
    }
}
