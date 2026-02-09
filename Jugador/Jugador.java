package Jugador;

import java.util.Scanner;

public class Jugador {
    public static void Datos(){
        Scanner scanner = new Scanner(System.in);

        DatosJugador jugador = new DatosJugador();

        //Obtenemos nombre del jugador
        System.out.println("\nIngresa tu Nombre: ");
        jugador.setNombre(scanner.nextLine());

        //Obtenemos edad del jugador
        System.out.println("\nIngresa tu Edad: ");
        jugador.setEdad(scanner.nextInt());

        //Imprimimos datos en pantalla
        System.out.println("\nDatos del Jugador");
        System.out.println("Nombre: " + jugador.getNombre());
        System.out.println("Edad: " + jugador.getEdad());
    }
}
