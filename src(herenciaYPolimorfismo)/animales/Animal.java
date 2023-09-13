package animales;

public abstract class Animal {

    private String nombre, tipoAlimentacion;
    private int edad;

    // Constructor
    public Animal(String nombre, String tipoAlimentacion, int edad) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
    }

    /**
     * @Tittle METODO ABSTRACTO
     * @Content Este metodo se crea cuando declaramos abstract la funcion
     */
    public abstract void Alimentarse();

    public void Moverse() {
        System.out.println("El animal se esta moviendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
