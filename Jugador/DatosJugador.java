package Jugador;

import java.util.Scanner;

public class DatosJugador {

    //Variables encapsuladas 
    private String nombre;
    private int edad;

    //Constructor
    public DatosJugador(){  
    }

    //Metodos Geters y Seter
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
