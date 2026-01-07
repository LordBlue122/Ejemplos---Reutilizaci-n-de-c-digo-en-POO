package gestion_empleado;

public class EmpleadoFijo extends Empleado {
    private double salarioMensual;

    public EmpleadoFijo(String nombre, String apellido, String documento, double salarioMensual) {
        super(nombre, apellido, documento);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
