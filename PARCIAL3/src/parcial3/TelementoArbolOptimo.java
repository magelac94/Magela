/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

import parcial3.ArbolesEInterfaces.TElementoArbolBB;

/**
 *
 * @author Magela
 * @param <T>
 */
public class TelementoArbolOptimo <T> extends TElementoArbolBB {
    private int frecuencia;
    
    public TelementoArbolOptimo(Object datos, Comparable etiqueta, int frecuencia) {
        super(datos, etiqueta);
        this.frecuencia = frecuencia;
    }
    @Override
    public int calcularCostoExito(int[] frecExito,int nivel,int[] contador )
    {
        int izq = 0;
        int der = 0;
        int res = 0;
        if(this.getHijoIzq()!= null)
        {
            izq = this.getHijoIzq().calcularCostoExito(frecExito,nivel+1,contador);
        }
        contador[0]++;
        res = frecExito[contador[0]]*nivel;
        if(this.getHijoDer()!= null)
        {
            der = this.getHijoDer().calcularCostoExito(frecExito,nivel+1,contador);
        }
        return izq+der+res; 
    }    
    
    public int calcularCosto(int[] frecExito,int[] frecNoExito,int nivel,int[] contadorExito,int[] contadorNoExito )
    {
        int izq = 0;
        int der = 0;
        int res = 0;
        
        if(this.getHijoIzq()!= null)
        {
            izq = this.getHijoIzq().calcularCosto(frecExito,frecNoExito,nivel+1,contadorExito,contadorNoExito);
        }
        else
        {
            izq = (frecNoExito[contadorNoExito[0]])*(nivel+1);
            contadorNoExito[0]++;
        }
         contadorExito[0]++;
        res = frecExito[contadorExito[0]]*nivel;
        if(this.getHijoDer()!= null)
        {
            der = this.getHijoDer().calcularCosto(frecExito,frecNoExito,nivel+1,contadorExito,contadorNoExito);
        }
        else
        {
            der = (frecNoExito[contadorNoExito[0]])*(nivel+1);
            contadorNoExito[0]++;
        }
        return izq+der+res;
    }
    public int calcularCostoNoExito(int[] frecNoExito, int nivel, int[] contador){
        int izq = 0;
        int der = 0;
        
        if(this.getHijoIzq() != null){
            izq = this.getHijoIzq().calcularCostoNoExito(frecNoExito, nivel + 1, contador);
        }else{
            izq = (frecNoExito[contador[0]])*(nivel+1);
            contador[0]++;
        }
        if(this.getHijoDer() != null){
            der = this.getHijoDer().calcularCostoNoExito(frecNoExito, nivel + 1, contador);
        }else{
            der = (frecNoExito[contador[0]])*(nivel+1);
            contador[0]++;
        }
        return izq + der ;  
    }
    }
