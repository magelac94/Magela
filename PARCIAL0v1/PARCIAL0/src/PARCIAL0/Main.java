/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL0;

public class Main {

    public static void main(String[] args) {
        /**
         * Cargar los alumnos a partir del archivo "alumnos.txt"
         *
         * Utilizando el manejador de archivos generico leer el archivo
         * alumnos.txt Para cada linea: separarla por coma para obtener los dos
         * campos del alumno El primer campo debe ser numerico El segundo campo
         * String Una vez obtenidos estos valores crear una instancia de alumno
         * agregar el alumno a la lista de alumnos del curso
         *
         */
        Curso elCurso = new Curso("AED1", 2016, 1);         // El curso

        ManejadorArchivosGenerico leoArchivo = new ManejadorArchivosGenerico(); // Manejador de Archivos para lectura y escritura
        String[] archivoAlumno;                   // Array para almacenar lineas del archivo
        archivoAlumno = leoArchivo.leerArchivo("src/PARCIAL0/alumnos.txt");   // Leo archivo
        for (int i = 0; i < archivoAlumno.length; i++) {                      // Recorro archivo
            try {
                String[] columnas = archivoAlumno[i].split("\\,");            // Separo por ,
                Alumno unAlumno = new Alumno(Integer.parseInt(columnas[0]), columnas[1]);
                elCurso.insertarAlumno(unAlumno);                                // Ingreso el nodo a la lista de alumnos
            } catch (Exception e) {
                System.out.println("Error en el Formato del Archivo, Alumno no ingresado:\n\t" + archivoAlumno[i]);
            }
        }

        System.out.println(elCurso.imprimirAlumnosSeparador(" ; "));
        System.out.println("Ahora ordenamos");
        System.out.println(elCurso.listarOrdenadoPorCodigo());

    }
}
