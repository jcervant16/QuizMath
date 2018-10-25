/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

/**
 *
 * @author jose1
 */
public class metodos {
    private static int resultado;
    private int puntaje;
    
    public int numeroRandom(int min, int max){
       resultado = (int)(Math.random()*(max-min)+min);
        return resultado;
    }
    public int signoRandom(){
        int retorno = numeroRandom(1,5);
        return retorno;
    }
    public boolean comprobar(int x, int y,int signo){
        boolean res = false;
        
        switch(signo){
            case 1: res = (x+y == resultado);
            break;
            case 2: res = (x-y == resultado);
            break;
            case 3: res = (x*y == resultado);
            break;
            case 4: res = (x/y == resultado);
            break;
              
        }
        
        return res;
    }
    public int comprobarOperacion(int x, int y, int signo){
        int res = 0;
         
        switch(signo){
            case 1: res = x+y;
            break;
            case 2: res = x-y;
            break;
            case 3: res = x*y;
            break;
            case 4: res = x/y;
            break;
              
        }
        
        return res;
    }
    public int Addpuntos(){
        
            puntaje = puntaje + 10;
        
        return puntaje;
    }
    public int actualizarVidas(int vida){
        if(vida > 0 && vida<=3){
             vida = vida - 1;
        }else{
            vida = 0;
        }
        
        return vida;
    }
}
