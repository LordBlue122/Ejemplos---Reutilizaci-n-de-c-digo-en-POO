package gestion_empleado;

// Subclase que representa a un empleado fijo
public class EmpleadoFijo extends Empleado {
    @SuppressWarnings("FieldMayBeFinal")
    // Nuevo atributo propio
    private double salarioMensual;

    // Constructor de la subclase con salario mensual siendo integrado
    public EmpleadoFijo(String nombre, String apellido, String documento, double salarioMensual) {
        super(nombre, apellido, documento);
        this.salarioMensual = salarioMensual;
    }

    // metodo sobreescrito para calcular el salario
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
