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
public class LocaisVisitados {
    
   private String nomelocal;
   private String nomeatendente;
   private Integer localvisitadoid;
   private byte[] imagem;

    public String getNomelocal() {
        return nomelocal;
    }

    public void setNomelocal(String nomelocal) {
        this.nomelocal = nomelocal;
    }

    public String getNomeatendente() {
        return nomeatendente;
    }

    public void setNomeatendente(String nomeatendente) {
        this.nomeatendente = nomeatendente;
    }

    public Integer getLocalvisitadoid() {
        return localvisitadoid;
    }

    public void setLocalvisitadoid(Integer localvisitadoid) {
        this.localvisitadoid = localvisitadoid;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
}
