/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

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
}
