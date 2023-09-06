package exercise;

public class persona {

    // Atributos privados
    String firstName;
    String lastName;
    String document; // Poner el static sirve para poder acceder en el main.

    // Constructor
    public persona(String firstName, String lastName, String document) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
    }

    // Métodos get. Obtener valor.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    // Métodos set. Asignar valor.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocument(String document) {
        this.document = document;
    }

}
