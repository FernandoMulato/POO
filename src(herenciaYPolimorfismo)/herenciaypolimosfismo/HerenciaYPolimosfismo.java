package herenciaypolimosfismo;

import animales.Perro;
import animales.Gato;
import animales.Caballo;
import animales.Animal;
import animales.Conejo;
import animales.Pato;

public class HerenciaYPolimosfismo {

    public static void main(String[] args) {
        //-->Declaracion del objeto PERRO
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.Alimentarse();
        //-->Declaracion de otro objeto PERRO
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();

        //-->Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();
        //-->Declaracion del objeto Caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();
        //-->Declaracion del objeto Conejo
        Animal conejo = new Conejo("Bugs Bunny", "Zanahorias", 15, "Angora");
        conejo.Alimentarse();
        //-->Declaracion del objeto Pato
        Animal pato = new Pato("Donald", "Peces", 25, "Mandarin");
        pato.Alimentarse();
    }

}
