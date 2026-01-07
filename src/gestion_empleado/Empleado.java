package gestion_empleado;

public class Empleado {
    // Atributos comunes a todos los empleados (protegidos para que solo subclases puedan acceder)
    protected String nombre;
    protected String apellido;
    protected String documento;

    // Constructor de la clase Empleado
    public Empleado(String nombre, String apellido, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    // Método para mostrar los datos del empleado (Compartido por todas las subclases)
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Documento: " + documento);
    }

    // Método para calcular el salario (debe ser sobrescrito por las subclases)
    public double calcularSalario() {
        return 0.0;
    }
}
