package gestion_empleado;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoFijo("Ana", "Perez", "0101", 800);
        Empleado emp2 = new EmpleadoPorHoras("Luis", "Gomez", "0202", 40, 10);

        emp1.mostrarDatos();
        System.out.println("Salario: $" + emp1.calcularSalario());

        System.out.println();

        emp2.mostrarDatos();
        System.out.println("Salario: $" + emp2.calcularSalario());
    }
}
