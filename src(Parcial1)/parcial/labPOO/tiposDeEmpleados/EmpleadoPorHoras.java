package parcial.labPOO.tiposDeEmpleados;

import parcial.labPOO.model.Empleado;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(int horasTrabajadas, double tarifaPorHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" + "nombre=" + getNombre() + ", salarioBase=" + getSalarioBase() + ", horasTrabajadas=" + horasTrabajadas + ", tarifaPorHora=" + tarifaPorHora + '}';
    }

}
