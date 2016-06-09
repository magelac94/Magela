package ut5.ta2;

public class TArbolBB implements IArbolBB{
	protected IElementoAB raiz;
	public static int[] contador;
	
	public TArbolBB(){
		contador = new int[1];
		contador[0]=0;
		raiz=null;
	}
	

	@Override
	public boolean insertar(IElementoAB unElemento) {
		if(raiz==null){
			raiz = unElemento;
			return true;
		}
		else
			return raiz.insertar(unElemento);
	}

	public boolean insertarContador(IElementoAB unElemento) {
		contador[0]=1;
		if(raiz==null){
			raiz = unElemento;
			return true;
		}
		else{
			return raiz.insertar(unElemento, contador);
		}
	}

	@Override
	public IElementoAB buscar(Comparable unaEtiqueta) {
		contador[0]=0;
		if(raiz!=null){
			 return raiz.buscar(unaEtiqueta, contador);
		}
		else
			return null;
	}

	@Override
	public String preOrden() {
		return raiz.preOrden();
	}

	@Override
	public String inOrden() {
		if(this.raiz!=null){
			return raiz.inOrden();
		}
		return "";
	}

	@Override
	public String postOrden() {
		if (raiz != null)	
			return raiz.postOrden();
		return "";
	}
	
	public int getAltura(){
		if(raiz != null){
			return raiz.getAltura();
		}else{
			return -1;
		}
	}
	
	public int getNivel(Comparable etiqueta){
		if(raiz != null){
			return raiz.getNivel(etiqueta);
		}else{
			return -1;
		}
	}
	public int cantidadDeHojas(){
		if(raiz != null)
			return raiz.cantidadDeHojas(raiz);
		else
			return -1;
	}
	
	public int tamaño(){
		if(raiz == null) 
			return 0;
		else
			return ((TElementoAB)raiz).taamaño();
	}
	
	public int contarNivel(int nivel){
		if(raiz != null){
			if(nivel==0)
				return 1;
			else
				return raiz.contarNivel(0, nivel);
		}
		else
			return -1;
	}

}
