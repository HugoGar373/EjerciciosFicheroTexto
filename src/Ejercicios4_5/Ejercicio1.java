package Ejercicios4_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    private static final String RUTA = "datos.txt";

    public static void main(String[] args) {
        int contadorLineas = 0;
        try (BufferedReader lector = new BufferedReader(new FileReader(RUTA))) {
            while (lector.readLine() != null) {
                contadorLineas++;
            }
            System.out.println("Número total de líneas: " + contadorLineas);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}