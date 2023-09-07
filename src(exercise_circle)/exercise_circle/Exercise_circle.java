package exercise_circle;

import circle.Circle;

public class Exercise_circle {

    public static void main(String[] args) {

        // Crear un objeto Circle
        Circle circle = new Circle(5.0);

        // Calcular y mostrar el área del círculo
        double area = circle.calculateArea();
        System.out.println("Circle area: " + area);
    }

}
