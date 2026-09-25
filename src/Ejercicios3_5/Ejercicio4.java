package Ejercicios3_5;

import java.io.File;

public class Ejercicio4 {
    public static void main(String[] args) {
        File directorio = new File("copias");
        File fichero = new File(directorio, "config.txt");

        if (fichero.delete()) {
            System.out.println("Fichero 'config.txt' eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el fichero 'config.txt' o no existe.");
        }

        if (directorio.delete()) {
            System.out.println("Directorio 'copias' eliminado correctamente.");
        } else {
            System.out.println("No se ha podido eliminar el directorio 'copias' (no existe o no está vacío).");
        }
    }
}
