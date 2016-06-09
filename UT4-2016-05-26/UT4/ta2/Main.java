package ut5.ta2;

public class Main {

	public static void main(String[] args) {
		
		TArbolBB arbol = new TArbolBB();
		String[] lineas = ManejadorArchivosGenerico.leerArchivo("consultas.txt");
				
		for(int i=0;i<lineas.length;i++){
			if(lineas[i]!=null){
				TElementoAB elemento = new TElementoAB(lineas[i]);
				arbol.insertar(elemento);
			}
		}
		
		System.out.println(arbol.preOrden());//perro,gato,elefante,aguila,mapache,toro,tigre
		System.out.println(arbol.inOrden());//aguila,elefante,mapache,gato,tigre,toro,perro
		System.out.println(arbol.postOrden());//aguila,elefante,mapache,gato,tigre,toro,perro
		
		System.out.print("TAMAÑO: ");
		System.out.println(arbol.tamaño());//7
		System.out.print("CANTIDAD DE HOJAS: ");
		System.out.println(arbol.cantidadDeHojas());//3
		System.out.print("ALTURA: ");
		System.out.println(arbol.getAltura());//3
		System.out.print("CANTIDAD DE NODOS EN NIVEL 2: ");//3
		System.out.println(arbol.contarNivel(2));
		
	}
}