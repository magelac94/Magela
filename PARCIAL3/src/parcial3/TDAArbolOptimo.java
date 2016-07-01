/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial3;

import parcial3.ArbolesEInterfaces.TArbolBB;
import parcial3.ArbolesEInterfaces.TElementoArbolBB;

/**
 *
 * @author Magela
 */
public class TDAArbolOptimo extends TArbolBB {
    int[][] W;
    int[][] P;
    int[][] R;
    public TDAArbolOptimo(int cantElem)
    {
        super();
        crearMatrices(cantElem);   
    }
    private void crearMatrices(int cantElem)
    {
        W = new int[cantElem +1][cantElem+1];
        P = new int[cantElem +1][cantElem+1];
        R = new int[cantElem +1][cantElem+1];
    }
    public void encontrarOptimo(int cantElem, int[]frecExito, int[]frecNoExito)
    {
     int i,j,k,kraiz,h;
     int min,pesoSubArboles;
     kraiz=0;
     /*
     paso1
     h=0
     bucle en i de 0 a n 
     y completamos wii = frecNoExito
     pii = frecExito
     */
     for(i=0;i<=cantElem; i++)
     {
         this.W[i][i] = frecNoExito[i];
         this.P[i][i] = this.W[i][i];
     }
    /* Paso2
     wij = Wii +aj +bj
     */
    for(i=0;i< cantElem;i++)
    {
        for(j=i+1;j<=cantElem;j++)
        {
            this.W[i][j]= this.W[i][j-1]+frecExito[j]+frecNoExito[j];
        }
    }
    /*Paso3
        h=1 pij=wij +pii+pjj
    */
    Util u = new Util();
    u.imprimirMatriz(W);
    
   
    for(i=0;i<cantElem;i++)
    {
        j= i+1;
      this.P[i][j]= this.W[i][j]+this.P[i][i]+this.P[j][j];
      this.R[i][j]=j;
    }
    u.imprimirMatriz(P);
    u.imprimirMatriz(R);
    /*Paso4
    h>=2    
    */
    kraiz=0;
    for(h=2;h<cantElem+1;h++)
    {
        for(i=0;i<cantElem-h+1;i++)
        {
            j=i+h;
            min = Integer.MAX_VALUE;
            //encontrar k y min
            for(k=i+1;k<=j;k++)
            {
                int auxmin = this.P[i][k-1]+this.P[k][j];
                if(min>auxmin)
                {
                    kraiz = k;
                    min=auxmin;
                }
                this.P[i][j] = min + this.W[i][j];
                this.R[i][j]=kraiz;
            }
        }
    }
    System.out.println("Matriz W:");
    u.imprimirMatriz(W);
    System.out.println("Matriz P:");
    u.imprimirMatriz(P);
    System.out.println("Matriz R:");
    u.imprimirMatriz(R);
    }
    public void armarArbolBinario(int i,int j,String[]claves)
    {
      TElementoArbolBB unNodo;
      int unaRaiz;
      if(i<j)
      {
          unaRaiz = this.R[i][j];
          unNodo= new TelementoArbolOptimo(claves[unaRaiz],claves[unaRaiz],0);
          this.insertar(unNodo);
          armarArbolBinario(i,unaRaiz-1,claves);
          armarArbolBinario(unaRaiz,j,claves);
      }
      
    }
    public int calcularCostoExito(int[]frecExito, int[]contador)
    {
        if(raiz != null)
        {
            return raiz.calcularCostoExito(frecExito,1,contador);
        }
        else
        {
            return 0;
        }
    }
    public int calcularCostoNoExito(int[] frecNoExito) {
        int[] contador = new int[1];
        contador[0] = 0;
        if (this.raiz != null) {
            return raiz.calcularCostoNoExito(frecNoExito,1,contador);
        }else{
            return 0;
        }
    }
    public int calcularCosto(int[] frecExito, int[] frecNoExito)
    {
        if(raiz != null)
        {
            int[] contadorExito= new int[1];
            contadorExito[0]=0;
            int[] contadorNoExito= new int[1];
            contadorNoExito[0]=0;
            return raiz.calcularCosto(frecExito, frecNoExito, 1, contadorExito, contadorNoExito);         
        }
        else
        {
            return 0;
        }
    }
    
    
    public class Util {
    public void imprimirMatriz(int [][] matriz) {
		System.out.println("-------------------------");
	
		for(int i = 0;i < matriz.length; i++) {	
			for(int j = 0; j < matriz.length; j++) {
					System.out.print(matriz[i][j] + " ");
						}
			System.out.println();
		}
    }
}
    
    
}
