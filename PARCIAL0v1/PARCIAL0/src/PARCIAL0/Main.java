/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL0;

public class Main {

    public static void main(String[] args) {
        Curso elCurso = new Curso("AED1", 2016, 1);

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
        String[] alumnos;
        alumnos = ManejadorArchivosGenerico.leerArchivo("src/PARCIAL0/alumnos.txt");

        for (int i = 0; i < alumnos.length; i++) {

            String[] columnas = alumnos[i].split(",");

            Alumno nuevoAlumno = new Alumno(Integer.parseInt(columnas[0]), columnas[1]);
            elCurso.insertarAlumno(nuevoAlumno);

        }

        System.out.println(elCurso.imprimirAlumnosSeparador(" ; "));
        System.out.println("ahora ordenamos");
        System.out.println(elCurso.listarOrdenadoPorCodigo());

    }
}
