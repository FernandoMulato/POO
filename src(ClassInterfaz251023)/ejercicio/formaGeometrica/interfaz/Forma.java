package ejercicio.formaGeometrica.interfaz;

// Definición de la interfaz Forma

/*
  contexto de un sistema que maneja diferentes formas geométricas. Imagina que tienes una interfaz
  Forma con métodos para calcular el área y el perímetro de la forma. Luego, tienes clases que implementan esta interfaz para formas específicas,
  como un cuadrado y un círculo.
 */
public interface Forma {

    double calcularArea();

    double calcularPerimetro();

    void trasladar(double dx, double dy);

    void escalar(double factorEscala);

    void reflejar(String eje);
}
