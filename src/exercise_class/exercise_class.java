package exercise_class;

import call.unicauca.edu.co.ex_atrr; // ex_atrr y control espacio para que aparezca el import. Alt shif F para organizar código.

public class exercise_class {

    public static void main(String[] args) {

        ex_atrr atrr = new ex_atrr();// Crea la instancia de la clase externa ex_atrr.java

        System.out.println("Access var: ");
        System.out.println("Import name I1: " + atrr.name);// Muestra el contenido de la variable name de la clase externa.

        atrr.name = "Camilo"; // Cambia el nombre.

        System.out.println("Import name I2: " + atrr.name);// Muestra el contenido de la variable name modificada de la clase externa.
        System.out.println("Import year: " + atrr.year_hbd);// Muestra el contenido de la variable year_hbd de la clase externa.
    }
}
