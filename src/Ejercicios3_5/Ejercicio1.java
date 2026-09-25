package Ejercicios3_5;

import java.io.File;

public class Ejercicio1 {
    public static void main(String[] args) {
        File directorio = new File("copias");
        if (directorio.mkdir()) {
            System.out.println("Directorio 'copias' creado correctamente.");
        } else {
            System.out.println("El directorio 'copias' ya existe.");
        }
    }
}
