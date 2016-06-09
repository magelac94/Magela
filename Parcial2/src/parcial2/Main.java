package parcial2;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
         System.out.printf("PRUEBA");
        TArbolBB arbol = new TArbolBB();

        arbol.insertar(new TElementoAB(10, null));
        arbol.insertar(new TElementoAB(1, null));
        arbol.insertar(new TElementoAB(84, null));
        arbol.insertar(new TElementoAB(20, null));
        arbol.insertar(new TElementoAB(45, null));
        arbol.insertar(new TElementoAB(23, null));
        arbol.insertar(new TElementoAB(7, null));
        arbol.insertar(new TElementoAB(100, null));

        imprimirRecorridas(arbol);

        System.out.println("¿Existe elemento 100? " + (arbol.buscar(100) != null));
        System.out.println("¿Existe elemento 10? " + (arbol.buscar(10) != null));
        System.out.println("¿Existe elemento 7? " + (arbol.buscar(7) != null));
        System.out.println("¿Existe elemento 23? " + (arbol.buscar(23) != null));

        System.out.println("Eliminando nodos...");

        arbol.eliminar(100);
        arbol.eliminar(10);
        arbol.eliminar(7);
        arbol.eliminar(23);
        arbol.eliminar(10000);

        imprimirRecorridas(arbol);

        System.out.println("¿Existe elemento 100? " + (arbol.buscar(100) != null));
        System.out.println("¿Existe elemento 10? " + (arbol.buscar(10) != null));
        System.out.println("¿Existe elemento 7? " + (arbol.buscar(7) != null));
        System.out.println("¿Existe elemento 23? " + (arbol.buscar(23) != null));

        // Cargo datos del archivo a un arbol nuevo
        TArbolBB arbol2 = cargarArchivoAArbol("src/parcial2/claves.txt");
        imprimirRecorridas(arbol2);
        
        // Mando resultado de recorridos a un archivo
        String[] recorridos = new String[1];
        recorridos[0] = stringRecorridas(arbol2);
        ManejadorArchivosGenerico.escribirArchivo("src/parcial2/resultado.txt", recorridos);
        

    }

    private static void imprimirRecorridas(TArbolBB arbol) {
        System.out.println("Recorridas:\n");
        System.out.printf("%s " + arbol.preOrden() + "\n", "Preorden");
        System.out.printf("%s " + arbol.inOrden() + "\n", "Inorden");
        System.out.printf("%s " + arbol.postOrden() + "\n", "Postorden");
        System.out.println("\n");

    }

    private static String stringRecorridas(TArbolBB arbol) {
        String recorridos;
        recorridos = "Preorden: " + arbol.preOrden() + "\n";
        recorridos = recorridos + "Inorden: " + arbol.inOrden() + "\n";
        recorridos = recorridos + "PostOrden: " + arbol.postOrden() + "\n";
        return recorridos;

    }
    
    private static TArbolBB cargarArchivoAArbol(String string) {

        // Cargar Datos de Archivo
        TArbolBB arbol2 = new TArbolBB(); // Creo arbol nuevo
        ManejadorArchivosGenerico leoArchivo = new ManejadorArchivosGenerico();
        String[] archivoClaves;
        archivoClaves = leoArchivo.leerArchivo(string, false);
        for (int i = 0; i < archivoClaves.length; i++) {
            try {
                IElementoAB unElemento = new TElementoAB(archivoClaves[i], null); // creo elemento
                arbol2.insertar(unElemento);
            } catch (Exception e) {
                System.out.println("Error en el Formato del Archivo, Alumno no ingresado:\n\t" + archivoClaves[i]);
            }
        }
        return arbol2;

    }
    
           


}
