package ut5.ta2;

public class TElementoAB implements IElementoAB {
	protected Comparable etiqueta;
	protected IElementoAB izq;
	protected IElementoAB der;
	
	public TElementoAB(Comparable unaEtiqueta){
		etiqueta=unaEtiqueta;
		izq=null;
		der=null;
	}
	
	@Override
	public Comparable getEtiqueta() {
		// TODO Auto-generated method stub
		return etiqueta;
	}

	@Override
	public void setEtiqueta(Comparable unaEtiqueta) {
		// TODO Auto-generated method stub
		this.etiqueta = unaEtiqueta;
		
	}

	@Override
	public IElementoAB getHijoIzq() {
		// TODO Auto-generated method stub
		return izq;
	}

	@Override
	public IElementoAB getHijoDer() {
		// TODO Auto-generated method stub
		return der;
	}

	@Override
	public void setHijoIzq(IElementoAB elemento) {
		// TODO Auto-generated method stub
		this.izq=elemento;
		
	}

	@Override
	public void setHijoDer(IElementoAB elemento) {
		// TODO Auto-generated method stub
		this.der = elemento;
	}

	@Override
	public IElementoAB buscar(Comparable unaEtiqueta) {
		IElementoAB resultado = null;
		if(unaEtiqueta.compareTo(this.etiqueta) == 0){
			resultado = this;
		}
		else{
			if(unaEtiqueta.compareTo(this.etiqueta)<0){
				if(this.izq != null){
					resultado = this.izq.buscar(unaEtiqueta);
				}
			}
			else{
				if(this.der != null){
					resultado = this.der.buscar(unaEtiqueta);
				}
			}
		}
		return resultado;
	}

	public IElementoAB buscar(Comparable unaEtiqueta,int[] contador) {
		contador[0]++;
		IElementoAB resultado = null;
		if(unaEtiqueta.compareTo(this.etiqueta) == 0){
			return this;
		}
		else{
			if(unaEtiqueta.compareTo(this.etiqueta)<0){
				if(this.izq != null){
					return this.izq.buscar(unaEtiqueta,contador);
				}
			}
			else{
				if(this.der != null){
					return this.der.buscar(unaEtiqueta,contador);
				}
			}
		}
		contador[0] = -contador[0];
		return null;
	}

	public boolean insertar(IElementoAB elemento) {
		if(etiqueta.compareTo(elemento.getEtiqueta())==0)
			return false;
		if(etiqueta.compareTo(elemento.getEtiqueta())>0){
			if(izq!=null)
				return izq.insertar(elemento);
			else{
				izq=elemento;
				return true;
			}
		}
		else{
			if(der!=null)
				return der.insertar(elemento);
			else{
				der=elemento;
				return true;
			}
		}
	}
	
	public boolean insertar(IElementoAB elemento, int[] contador) {
		contador[0]++;
		if(etiqueta.compareTo(elemento.getEtiqueta().toString())==0)
			return false;
		if(etiqueta.compareTo(elemento.getEtiqueta().toString())<0){
			if(der!=null)
				return der.insertar(elemento, contador);
			else{
				der=elemento;
				return true;
			}
		}
		else{
			if(izq!=null)
				return izq.insertar(elemento, contador);
			else{
				izq=elemento;
				return true;
			}		
		}
		
	}

	@Override
	public String preOrden() {
		String resultado = this.etiqueta.toString();
		if(this.izq != null){
			resultado = resultado + " - " + this.izq.preOrden();
		}
		if(this.der != null){
			resultado = resultado + " - " + this.der.preOrden();
		}	
		return resultado;
	}

	@Override
	public String inOrden() {
		String resultado = this.etiqueta.toString();
		
		if(this.izq != null){
			resultado =  this.izq.inOrden() + " - " +  resultado;
		}
		if(this.der != null){
			resultado = resultado + " - " + this.der.inOrden();
		}	
		return resultado;
	}

	@Override
	public String postOrden() {
		String resultado = "";
		
		
		if (this.izq != null){
			resultado = this.izq.postOrden();
		}
		if (this.der != null){
			resultado += this.der.postOrden();
		}
		
		return resultado  +  " - " + this.etiqueta.toString();
	}
	
	public int getAltura(){
		int a = -1;
		int b = -1;
		if(this.izq != null){
			a = izq.getAltura();
		}
		if(this.der != null){
			b = der.getAltura();
		}
		return Math.max(a, b)+1;
	}
	
	public int getNivel(Comparable unaEtiqueta){
		int a = -1;
		int b = -1;
		if(this.etiqueta.compareTo(unaEtiqueta)==0){
			return 0;
		}
		if(this.izq != null){
			a = this.izq.getNivel(unaEtiqueta);
		}
		if(this.der != null){
			b = this.der.getNivel(unaEtiqueta);
		}
		if(a > -1){
			return a+1;
		}
		if(b > -1){
			return b+1;
		}
		return -1;
	}
	
	public int cantidadDeHojas(IElementoAB nodo){
		int i = 0;
		int d = 0;
		if(nodo.getHijoIzq()!=null){
			i = cantidadDeHojas(nodo.getHijoIzq());
		}
		if(nodo.getHijoDer()!=null){
			d = cantidadDeHojas(nodo.getHijoDer());
		}
		if(nodo.getHijoIzq()==null && nodo.getHijoDer()==null){
			return 1;
		}
		return i+d;
	}
	
	public int taamaño(){
		int i = 0;
		int d = 0;
		if(izq!=null){
			i+= izq.taamaño();
		}
		if(der!=null){
			d+=der.taamaño();
		}
		return i+d+1;
	}
		
	public int contarNivel(int nivelA,int nivel){
		
		int nodos = 0;
		if(nivelA==nivel-1){
			if(this.izq!=null){
				 nodos++;
			}
			if(this.der!=null){
				nodos++;
			}
			return nodos;
			
		}
		if(this.izq!=null){
			nodos += this.izq.contarNivel(nivelA+1, nivel);
		}
		if(this.der!=null){
			nodos += this.der.contarNivel(nivelA+1, nivel);
		}
		
		return nodos;	
	}

	@Override
	public void completarNodosExternos(int[] vectorBetas, Integer[] contador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obtenerCosto(int[] costo, int nivel) {
		// TODO Auto-generated method stub
		
	}

}
