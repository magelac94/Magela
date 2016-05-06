/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL1;

public class Parcial1 {
    
    public static void main(String[] args) {
        Curso AED1 = new Curso("AED1");
        
        // CARGAR ALUMNOS DE LA CLASE
        ManejadorArchivosGenerico leoArchivo = new ManejadorArchivosGenerico();
        String[] archivoAlumno;        
        archivoAlumno = leoArchivo.leerArchivo("src/PARCIAL1/alumnosAED1.txt");
        for (int i = 0; i < archivoAlumno.length; i++) {            
            try {
                Alumno unAlumno = new Alumno(archivoAlumno[i]);     // creo alumno
                AED1.insertarAlumno(unAlumno);                      // lo inserto en la clase
            } catch (Exception e) {
                System.out.println("Error en el Formato del Archivo, Alumno no ingresado:\n\t" + archivoAlumno[i]);
            }
        }
        /**
         * Cargar los alumnos en AED1 a partir del archivo "alumnosAED1.txt”
         * Cada línea tiene solamente el nombre del alumno Utilizando el
         * manejador de archivos generico, leer el archivo alumnosAED1.txt Para
         * cada linea: crear una instancia de alumno agregar el alumno a la
         * lista de alumnos del curso
         *
         */
        
        Conjunto<Alumno> Habilitados = new Conjunto<>();

        // CARGAR ALUMNOS HABILITADOS
        //  ManejadorArchivosGenerico leoArchivo = new ManejadorArchivosGenerico();
        //  String[] archivoAlumno;                 
        archivoAlumno = leoArchivo.leerArchivo("src/PARCIAL1/habilitados.txt");
        for (int i = 0; i < archivoAlumno.length; i++) {            
            try {
                Alumno unAlumno = new Alumno(archivoAlumno[i]); // Ingreso un Alumno
                INodo elNodo = new Nodo<>(unAlumno, unAlumno.getNombre()); // Creo un nodo con el alumno
                Habilitados.insertar(elNodo);                              // Lo ingreso como Habilitado         
            } catch (Exception e) {
                System.out.println("Error en el Formato del Archivo, Alumno no ingresado:\n\t" + archivoAlumno[i]);
            }
        }
        /**
         * Cargar los alumnos en Habilitados a partir del archivo
         * "habilitados.txt” Cada línea tiene solamente el nombre del alumno
         * Utilizando el manejador de archivos generico, leer el archivo
         * habilitados.txt Para cada linea: crear una instancia de alumno
         * agregar el alumno a la lista de alumnos habilitados
         *
         */
 
        System.out.println(AED1.imprimirAlumnosSeparador(" ; "));        // bien
        System.out.println(Habilitados.imprimir(" ; "));                // bien

        System.out.println("ahora vemos los que están habilitados pero no se han matriculado en AED1");
        System.out.println(AED1.noInscriptos(Habilitados).imprimir(" ; "));
        
    }
}
