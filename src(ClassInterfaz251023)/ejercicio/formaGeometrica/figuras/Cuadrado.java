package ejercicio.formaGeometrica.figuras;

import ejercicio.formaGeometrica.interfaz.Forma;

// Implementación para un cuadrado
public class Cuadrado implements Forma {

    private double lado;
    private double x, y;

    public Cuadrado(double lado, double x, double y) {
        this.lado = lado;
        this.x = x;
        this.y = y;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public void trasladar(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void escalar(double factorEscala) {
        lado *= factorEscala;
    }

    @Override
    public void reflejar(String eje) {
        if (eje.equals("x")) {
            y = -y;
        } else if (eje.equals("y")) {
            x = -x;
        } else {
            System.out.println("Eje no válido. Utiliza 'x' o 'y'.");
        }
    }

}
