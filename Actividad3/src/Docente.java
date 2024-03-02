public class Docente implements Persona {

    private String nombre;
    private int cedula;
    private int edad;
    private int salario;

    public Docente(String nombre, int cedula, int edad, int salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.salario = salario;
    }
   
    
    @Override
    public void mostrarInformacion() {
        System.out.println("\t Docente ");
        System.out.println("Nombre: " + nombre );
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: "+ edad);
        System.out.println("Salario: " + salario);

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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
}
