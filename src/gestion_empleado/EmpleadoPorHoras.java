package gestion_empleado;

public class EmpleadoPorHoras extends Empleado {
    // Nuevo atributos propios para calcular el salario
    @SuppressWarnings("FieldMayBeFinal")
    private int horasTrabajadas;
    @SuppressWarnings("FieldMayBeFinal")
    private double tarifaPorHora;

    // constructor de la subclase con horas trabajadas y tarifa por hora siendo integrados
    public EmpleadoPorHoras(String nombre, String apellido, String documento, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, apellido, documento);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // metodo sobreescrito para calcular el salario
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
