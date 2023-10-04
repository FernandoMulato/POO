package parcial.labPOO.model;

public abstract class Empleado {

    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double SalarioBase) {
        this.nombre = nombre;
        this.salarioBase = SalarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.salarioBase = SalarioBase;
    }

    public abstract double calcularSalario();

}
