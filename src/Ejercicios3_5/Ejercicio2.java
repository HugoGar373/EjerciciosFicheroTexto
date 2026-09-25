package Ejercicios3_5;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        File directorio = new File("copias");
        File fichero = new File(directorio, "config.txt");

        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero 'config.txt' creado correctamente.");
            } else {
                System.out.println("El fichero 'config.txt' ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }
}