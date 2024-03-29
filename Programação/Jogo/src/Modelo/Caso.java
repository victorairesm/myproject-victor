/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Dao.CidadesDAO;
import Dao.SuspeitosDAO;
import java.util.List;

/**
 *
 * @author Aluno
 */

public class Caso {
    private Suspeitos suspeito;
    private List<Cidades> cidades;
    private Integer passos;
    private Boolean mandato;
    private Detetive detetive;
    
    public Caso() {
        this.passos = 0;
        this.mandato = false;
        CidadesDAO daoCidade = new CidadesDAO();
        cidades = daoCidade.ListarRandom();
        SuspeitosDAO daoSuspeito = new SuspeitosDAO();
        this.suspeito = daoSuspeito.ListarRandom();
        //CARREGAR OS SUSPEITOSsdf
        //CARREGAR CIDADES
        
    }

    public Suspeitos getSuspeito() {
        return suspeito;
    }

    public void setSuspeito(Suspeitos suspeito) {
        this.suspeito = suspeito;
    }

    public List<Cidades> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidades> cidades) {
        this.cidades = cidades;
    }

    public Integer getPassos() {
        return passos;
    }

    public void setPassos(Integer passos) {
        this.passos = passos;
    }

    public Boolean getMandato() {
        return mandato;
    }

    public void setMandato(Boolean mandato) {
        this.mandato = mandato;
    }

    public Detetive getDetetive() {
        return detetive;
    }

    public void setDetetive(Detetive detetive) {
        this.detetive = detetive;
    }
}
