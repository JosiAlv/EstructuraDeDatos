package Ejercicio_1;

public class Vehiculo {
    // Atributos de la clase
    private String nombre;
    private String color;
    private String modelo;
    private String tamano;
    private String marca;

    // Constructor de la clase
    public Vehiculo () {
        System.out.println("Soy el constructor");
    }
    public Vehiculo (String nom, String col, String mod, String tam, String mar) {
        this.nombre = nom;
        this.color = col;
        this.modelo = mod;
        this.tamano = tam;
        this.marca = mar;
    }

    public void MostrarVehiculo(){
        System.out.println("El nombre es " + nombre);
        System.out.println("El color es " + color);
        System.out.println("El modelo es " + modelo);
        System.out.println("El tamano es " + tamano);
        System.out.println("El marca es " + marca);
    }

    public String MostrarNombre (){
        return nombre;
    }
    public void Mover(){
        System.out.println("Soy el metodo Mover");
    }
    public void Frenar(){
        System.out.println("Soy el metodo Frenar");
    }
    public void GirarALaDerecha() {
        System.out.println("Soy el metodo Girar_a_la_derecha");
    }
    public void GirarALaIzquierda() {
        System.out.println("Soy el metodo Girar_a_la_izquierda");
    }
    public void CambiarDeCarril() {
        System.out.println("Soy el metodo Cambiar_de_carril");
    }

    public void SetColor(String NuevoColor){
        color = NuevoColor;
    }
}
