/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janela;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Aluno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int delay = 5000;   // delay de 5 seg.
    int interval = 1000;  // intervalo de 1 seg.
    Timer timer = new Timer();
    
    timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                // colocar tarefas aqui ...
            }
        }, delay, interval);

//Leia mais em: Como configurar o timer para executar tarefas em intervalos constantes http://www.devmedia.com.br/como-configurar-o-timer-para-executar-tarefas-em-intervalos-constantes/2144#ixzz3K6znv3wU
    }
    
}
