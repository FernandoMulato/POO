package parcial1_labpoo;

import parcial.labPOO.model.Empleado;
import parcial.labPOO.tiposDeEmpleados.EmpleadoAsalariado;
import parcial.labPOO.tiposDeEmpleados.EmpleadoPorHoras;
import java.util.Scanner;

public class Parcial1_LabPOO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado[] arrayEmpleados = new Empleado[10];

        arrayEmpleados[0] = new EmpleadoAsalariado(30000, "Fernando", 2000000);
        arrayEmpleados[1] = new EmpleadoAsalariado(100000, "Maria", 1500000);
        arrayEmpleados[2] = new EmpleadoAsalariado(400000, "Juan", 4000000);
        arrayEmpleados[3] = new EmpleadoAsalariado(600000, "Daniel", 8000000);
        arrayEmpleados[4] = new EmpleadoAsalariado(350000, "Oscar", 6000000);
        arrayEmpleados[5] = new EmpleadoPorHoras(45, 30000, "Lucia", 0);
        arrayEmpleados[6] = new EmpleadoPorHoras(32, 30000, "Martha", 0);
        arrayEmpleados[7] = new EmpleadoPorHoras(60, 30000, "Luis", 0);
        arrayEmpleados[8] = new EmpleadoPorHoras(200, 30000, "Manuel", 0);
        arrayEmpleados[9] = new EmpleadoPorHoras(40, 30000, "Hernando", 0);

        System.out.println("==== Empleados Asalariados ====");
        for (Empleado empleado : arrayEmpleados) {
            if (empleado.getSalarioBase() != 0) {
                System.out.println(empleado);
            }
        }

        System.out.println("==== Empleados Por horas ====");
        for (Empleado empleado : arrayEmpleados) {
            if (empleado.getSalarioBase() == 0) {
                System.out.println(empleado);
            }
        }

        arrayEmpleados[9].setNombre("Lucas");

        System.out.println("==== Empleados Por horas ====");
        for (Empleado empleado : arrayEmpleados) {
            if (empleado.getSalarioBase() == 0) {
                System.out.println(empleado);
            }
        }

        String nombreABuscar;
        System.out.println("==== Buscar Empleados ====");
        System.out.println("Ingrese el nombre del empleado a buscar: ");
        nombreABuscar = entrada.next();

        for (int i = 0; i < 10; i++) {
            if (arrayEmpleados[i].getNombre().equals(nombreABuscar)) {
                System.out.println(arrayEmpleados[i]);
                break;
            }
        }
    }

}
