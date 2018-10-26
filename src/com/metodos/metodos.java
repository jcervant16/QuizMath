/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import java.util.ArrayList;

/**
 *
 * @author jose1
 */
public class metodos {

    private int resultado;
    private int puntaje;
    private int vida = 3;

    public int numeroRandom(int min, int max) {
        resultado = (int) (Math.random() * (max - min) + min);
        return resultado;
    }

    public int signoRandom() {
        int retorno = numeroRandom(1, 5);
        return retorno;
    }
    
    public boolean comprobar(int x, int y, int signo) {
        boolean res = false;

        switch (signo) {
            case 1:
                res = (x + y == resultado);
                break;
            case 2:
                res = (x - y == resultado);
                break;
            case 3:
                res = (x * y == resultado);
                break;
            case 4:
                res = (x / y == resultado);
                break;

        }

        return res;
    }

    public int comprobarOperacion(int x, int y, int signo) {
        int res = 0;

        switch (signo) {
            case 1:
                res = x + y;
                break;
            case 2:
                res = x - y;
                break;
            case 3:
                res = x * y;
                break;
            case 4:
                res = x / y;
                break;
        }

        return res;
    }

    public int Addpuntos() {

        puntaje = puntaje + 10;

        return puntaje;
    }

    public int restarVidas() {
        if (vida > 0 && vida <= 3) {
            vida = vida - 1;
        } else {
            vida = 0;
        }
        
        return vida;
    }
    public int sumarVidas(){
        ArrayList<Integer> res;
        res = llenar();
        for (int i = 0; i < res.size(); i++) {
            if(puntaje == res.get(i)){
                vida++;
            }
            
        }
        return vida;
    }

    public ArrayList<Integer> llenar(){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 100; i < 10000; i= i+100) { 
            res.add(i);
        }
        return res;
    }
}
