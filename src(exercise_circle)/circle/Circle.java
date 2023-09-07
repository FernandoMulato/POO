package circle;

// Clase concreta que extiende la clase FormaGeometrica
public class Circle extends GeometricForm {

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }
}
