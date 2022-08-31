package Campeonato.Clases;

import java.util.Scanner;

public class Main3 {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE DATOS DE JUGADORES");
        String nombreCompleto, apellidos, ci;
        int edad, i, nJugadores = 3;

        Jugador[] jugadores = new Jugador[nJugadores];

        for (i = 0; i < nJugadores; i = i + 1) {
            System.out.println("Ingrese el nombre del jugador " + (i+1) + ": ");
            nombreCompleto = leer.next();
            System.out.println("Ingrese el apellidos del jugador " + (i+1) + ": ");
            apellidos = leer.next();
            System.out.println("Ingrese el CI del jugador " + (i+1) + ": ");
            ci = leer.next();
            System.out.println("Ingrese edad del jugador " + (i+1) + ": ");
            edad = leer.nextInt();

            Jugador jug = new Jugador();
            jug.setNombreCompleto(nombreCompleto);
            jug.setApellidos(apellidos);
            jug.setCI(ci);
            jug.setEdad(edad);
            jug.mostrarJugador();

            jugadores [i] = jug;
        }

        Equipo eq1 = new Equipo("Club Saltena", "Varones", jugadores);
        eq1.mostrarEquipo();
    }
}
