package Ejercicios3_5;

import java.io.File;

public class Ejercicio3 {
    public static void main(String[] args) {
        File directorio = new File("copias");
        File[] elementos = directorio.listFiles();

        if (elementos != null) {
            for (File elemento : elementos) {
                if (elemento.isDirectory()) {
                    System.out.println("Directorio: " + elemento.getName());
                } else if (elemento.isFile()) {
                    System.out.println("Fichero: " + elemento.getName());
                }
            }
        } else {
            System.out.println("El directorio no existe o está vacío.");
        }
    }
}