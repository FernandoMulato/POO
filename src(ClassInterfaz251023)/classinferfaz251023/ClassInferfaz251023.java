package classinferfaz251023;

import ejercicio.formaGeometrica.figuras.*;

public class ClassInferfaz251023 {

    /*
  En este ejemplo:
  
  La interfaz Forma define métodos calcularArea() y calcularPerimetro() que deben ser implementados por las clases que la utilicen.
  Las clases Cuadrado y Circulo implementan la interfaz Forma proporcionando implementaciones específicas para los métodos de cálculo.
  En la función main, se crean instancias de Cuadrado y Circulo, y se calculan y muestran sus áreas y perímetros.
     */
    public static void main(String[] args) {
        // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5, 0, 0);
        Circulo miCirculo = new Circulo(3, 0, 0);

        // Calcular y mostrar áreas y perímetros
        System.out.println("Area del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("Area del circulo: " + miCirculo.calcularArea());
        System.out.println("PerAmetro del circulo: " + miCirculo.calcularPerimetro());

        // Aplación nuevos métodos
        System.out.println("====== Traslacion ======");
        System.out.println("Posicion inicial cuadrado: " + miCuadrado.getX() + ", " + miCuadrado.getY());
        miCuadrado.trasladar(2, 4);
        System.out.println("Posicion del cuadrado despues de la traslacion: " + miCuadrado.getX() + ", " + miCuadrado.getY());

        System.out.println("====== Escalado ======");
        System.out.println("Radio incial del circulo: " + miCirculo.getRadio());
        miCirculo.escalar(8);
        System.out.println("Radio del circulo despues del escalado: " + miCirculo.getRadio());

        System.out.println("====== Reflexion ======");
        System.out.println("Posicion inicial: (" + miCuadrado.getX() + ", " + miCuadrado.getY() + ")");
        miCuadrado.reflejar("y");
        System.out.println("Posicion despues de la reflexion: (" + miCuadrado.getX() + ", " + miCuadrado.getY() + ")");
    }


    /*
  Este ejemplo ilustra cómo las interfaces en Java pueden ser utilizadas para definir un contrato común
  (en este caso, métodos para calcular área y perímetro) que varias clases pueden implementar de manera específica.
  Este enfoque facilita la extensión del sistema para incluir nuevas formas geométricas sin modificar el código existente.
     */
}
