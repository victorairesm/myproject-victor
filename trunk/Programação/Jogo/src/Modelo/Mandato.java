/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Victor
 */
public class Mandato {
    
    private static Suspeitos suspeito;
    private static Boolean mandatoEmitido;

    public static void limpaMandato() {
        suspeito = null;
        mandatoEmitido = false;
    }
    
    public static Suspeitos getSuspeito() {
        return suspeito;
    }

    public static void setSuspeito(Suspeitos aSuspeito) {
        suspeito = aSuspeito;
    }

    public static Boolean getMandatoEmitido() {
        return mandatoEmitido;
    }

    public static void setMandatoEmitido(Boolean aMandatoEmitido) {
        mandatoEmitido = aMandatoEmitido;
    }
    
}
