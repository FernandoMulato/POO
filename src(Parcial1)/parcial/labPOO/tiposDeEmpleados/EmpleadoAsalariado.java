package parcial.labPOO.tiposDeEmpleados;

import parcial.labPOO.model.Empleado;

public class EmpleadoAsalariado extends Empleado {

    double deducciones;

    public EmpleadoAsalariado(double deducciones, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() - deducciones;
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado{" + "nombre=" + getNombre() + ", salarioBase=" + getSalarioBase() + ", deducciones=" + deducciones + '}';
    }

}
