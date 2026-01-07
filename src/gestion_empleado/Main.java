package gestion_empleado;

public class Main {
    public static void main(String[] args) {
        // Instanciar las clases, cada una con sus propios atributos
        Empleado emp1 = new EmpleadoFijo("Ana", "Perez", "0101", 800);
        Empleado emp2 = new EmpleadoPorHoras("Luis", "Gomez", "0202", 40, 10);

        // datos del emplaeado fijo
        emp1.mostrarDatos();
        System.out.println("Salario: $" + emp1.calcularSalario());

        System.out.println();

        // datos del empleado por horas
        emp2.mostrarDatos();
        System.out.println("Salario: $" + emp2.calcularSalario());
    }
}
