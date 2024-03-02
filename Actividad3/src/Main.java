
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        while (true) {
            System.out.println("Bienvenido Al Registro De Docentes Y Estudiantes\n");
            
            System.out.println("1. Registrar Docente");
            System.out.println("2. Registrar Estudiante");
            System.out.println("3. Mostrar Docentes / Estudiantes Registrados");
            System.out.println("4. Eliminar Docentes / Estudiantes");
            System.out.println("5. Salir\n");
            System.out.print("Seleccione una opcion: ");
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
                    System.out.println("Docente Registrado Con Exito.");
                    break;
                case 2:
                    System.out.print("Nombre del estudiante: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Cedula: ");
                    int cedulaEstudiante = scanner.nextInt();
                    System.out.print("Edad: ");
                    int edadEstudiante = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Cantidad De Notas A Ingresar: ");
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
                    System.out.println("Estudiante Registrado Con Exito.");
                    break;
                case 3:
                    System.out.println("Docentes / Estudiantes Registrados:");
                    for (Persona persona : personas) {
                        persona.mostrarInformacion();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Ingrese La Cedula Del Docente O Estudiantes A Eliminar: ");
                    int cedulaEliminar = scanner.nextInt();
                    scanner.nextLine(); 
                    boolean eliminado = false;
                    for (Persona persona : personas) {
                        if (persona.getCedula() == cedulaEliminar) {
                            personas.remove(persona);
                            eliminado = true;
                            System.out.println("Persona Eliminada Con Exito.");
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("-------------------------------------------------------------------------------------------------");
                        System.out.println("No Se Encontro Ninguna Persona Con Ese Numero De Cedula.");
                        System.out.println("-------------------------------------------------------------------------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Gracias Por Usar La App De Registro De Docentes Y Estudiantes");
                    System.exit(0);
                default:
                    System.out.println("Opción No Valida.");
            }
        }
    }
}
