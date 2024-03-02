
import java.util.List;

public class Estudiante implements Persona{
    
    private String nombre;
    private int cedula;
    private int edad;
    private List<Double> notas;

    public Estudiante(String nombre, int cedula, int edad, List<Double> notas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.notas = notas;
    }

    
    @Override
    public void mostrarInformacion() {
        System.out.println("\t Estudiante");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Notas: " + notas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    
    
    
    
}
