package ut5.ta2;

public class PruebaBusqueda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
		TArbolBB arbol = new TArbolBB();
		String consultas [] =  manejador.leerArchivo("consultas.txt");
		for(int i = 0;i<consultas.length;i++){
			TElementoAB elemento = new TElementoAB(consultas[i]);
			arbol.insertar(elemento);
		}
		System.out.println("-------------------------------");
		System.out.println(arbol.buscar("gato").getEtiqueta());
		System.out.println(arbol.contador[0]);//2
		System.out.println(arbol.buscar("zorro"));
		System.out.println(arbol.contador[0]);//-2
		System.out.println(arbol.buscar("foca"));
		System.out.println(arbol.contador[0]);//-3
		System.out.println(arbol.buscar("aguila").getEtiqueta());
		System.out.println(arbol.contador[0]);//4
		System.out.println(arbol.buscar("perro").getEtiqueta());
		System.out.println(arbol.contador[0]);//1
		System.out.println("-------------------------------");
		System.out.println("NIVEL DE PERRO:");//0
	    System.out.println(arbol.getNivel("perro"));
	    System.out.println("NIVEL DE AGUILA:");//3
	    System.out.println(arbol.getNivel("aguila"));
	    System.out.println("NIVEL DE MAPACHE:");//2
	    System.out.println(arbol.getNivel("mapache"));
	    System.out.println("NIVEL DE ELEFANTE:");//2
	    System.out.println(arbol.getNivel("elefante"));
	    System.out.println("-------------------------------");
		System.out.println("POSTORDEN");
		System.out.println(arbol.postOrden());
		//aguila,elefante,mapache,gato,tigre,toro,perro
		System.out.println("INORDEN");
		System.out.println(arbol.inOrden());
		System.out.println("PREORDEN");
		System.out.println(arbol.preOrden());
		//aguila,elefante,gato,mapache,perro,tigre,toro
		System.out.println("ALTURA");
		System.out.println(arbol.getAltura());
	}

}
