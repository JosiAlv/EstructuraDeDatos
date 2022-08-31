package Ejercicio_1;

public class Main {
    public static void main(String [] args) {
        Vehiculo v1 = new Vehiculo();

        v1.GirarALaDerecha();

        // Crear el metodo en la clase vehiculo Cambiar de carril y llamarlo desde la clase Main

        v1.CambiarDeCarril();

        Vehiculo v2 = new Vehiculo("Turbo", "Blanco", "Vagoneta", "4x4", "Toyota");
        v2.Mover();
        //Crear un metodo en la clase Vehiculo que me permita mostrar todos sus atributos
        v2.MostrarVehiculo();

        //crear un metodo que retorne el nombre del vehiculo
        System.out.println(v2.MostrarNombre());

        v2.SetColor("Rojo");
        v2.MostrarVehiculo();

    }
}
