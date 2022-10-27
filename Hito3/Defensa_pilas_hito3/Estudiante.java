package Defensa_pilas_hito3;

public class Estudiante {
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String Sede;
    private int NotaFinal;
    private String CI;

    public Estudiante(String Nombres, String Apellidos, int Edad, String Sede, int NotaFinal, String CI) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Sede = Sede;
        this.NotaFinal = NotaFinal;
        this.CI = CI;

    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public String getSede() {
        return Sede;
    }

    public int getNotaFinal() {
        return NotaFinal;
    }

    public String getCI() {
        return CI;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setSede(String sede) {
        Sede = sede;
    }

    public void setNotaFinal(int notaFinal) {
        NotaFinal = notaFinal;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public void mostrarEstudiante() {
        System.out.println("Mostrando datos del estudiante");
        System.out.println("Nombre: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sede: " + this.getSede());
        System.out.println("NotaFinal: " + this.getNotaFinal());
        System.out.println("CI: " + this.getCI());
        System.out.println("\n");
    }

}

