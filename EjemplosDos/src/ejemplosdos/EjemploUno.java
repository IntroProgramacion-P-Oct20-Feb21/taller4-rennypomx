/*
 *  1. Inicio
    2. (nombre,x(30)[{a-z}, {BS}, {A-Z}])

    3. Escribir "Ingrese el nombre de la persona"
    4. Leer nombre
    5. Escribir "El nombre ingresado es " + nombre
    6. Fin
*/
package ejemplosdos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemploUno {

    /**
     * @param args the command line arguments
     */
    // 1. Inicio
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // 2. (nombre,x(30)[{a-z}, {BS}, {A-Z}])
        String nombre;
        
        // 3. Escribir "Ingrese el nombre de la persona"
        System.out.println("Ingrese el nombre de la persona");
        // 4. Leer nombre
        nombre = entrada.nextLine();
        
        // 5. Escribir "El nombre ingresado es " + nombre
        System.out.printf("El nombre ingresado es %s\n", nombre);
        
    } // 6. Fin
    
}
