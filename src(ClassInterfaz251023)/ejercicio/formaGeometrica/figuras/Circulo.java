package ejercicio.formaGeometrica.figuras;

import ejercicio.formaGeometrica.interfaz.Forma;

// Implementación para un círculo
public class Circulo implements Forma {

    private double radio;
    private double x, y;

    public Circulo(double radio, double x, double y) {
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void trasladar(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void escalar(double factorEscala) {
        radio *= factorEscala;
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
