
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        while (true) {
            System.out.println("1. Registrar Docente");
            System.out.println("2. Registrar Estudiante");
            System.out.println("3. Eliminar Persona");
            System.out.println("4. Mostrar Personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del docente: ");
                    String nombreDocente = scanner.nextLine();
                    System.out.print("Cedula: ");
                    int cedulaDocente = scanner.nextInt();
                    System.out.print("Edad: ");
                    int edadDocente = scanner.nextInt();
                    System.out.print("Salario: ");
                    int salarioDocente = scanner.nextInt();
                    scanner.nextLine();
                    personas.add(new Docente(nombreDocente, cedulaDocente, edadDocente, salarioDocente));
                    System.out.println("Docente registrado con éxito.");
                    break;
                case 2:
                    System.out.print("Nombre del estudiante: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Cedula: ");
                    int cedulaEstudiante = scanner.nextInt();
                    System.out.print("Edad: ");
                    int edadEstudiante = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Número de notas: ");
                    int numNotas = scanner.nextInt();
                    scanner.nextLine();
                    List<Double> notas = new ArrayList<>();
                    for (int i = 0; i < numNotas; i++) {
                        System.out.print("Nota " + (i + 1) + ": ");
                        double nota = scanner.nextDouble();
                        notas.add(nota);
                    }
                    scanner.nextLine();
                    personas.add(new Estudiante(nombreEstudiante, cedulaEstudiante, edadEstudiante, notas));
                    System.out.println("Estudiante registrado con éxito.");
                    break;
                case 3:
                    System.out.print("Ingrese el índice de la persona a eliminar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    if (indice >= 0 && indice < personas.size()) {
                        personas.remove(indice);
                        System.out.println("Persona eliminada con éxito.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Personas registradas:");
                    for (Persona persona : personas) {
                        persona.mostrarInformacion();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
