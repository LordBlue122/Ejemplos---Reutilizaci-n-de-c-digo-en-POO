package gestion_empleado;

public class Empleado {
    protected String nombre;
    protected String apellido;
    protected String documento;

    public Empleado(String nombre, String apellido, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Documento: " + documento);
    }

    public double calcularSalario() {
        return 0.0;
    }
}
