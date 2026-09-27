package Ejercicios4_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    private static final String ruta= "src/Ejercicios4_5/datos.txt";

    public static void main(String[] args) {
        Scanner palabra;
        palabra = new Scanner (System.in);
        System.out.println("Introduce palabra: ");
        String palabras = palabra.nextLine().toLowerCase();

        int lineasContienen = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea=br.readLine()) != null) {
                if (linea.toLowerCase().contains(palabras)) {
                    lineasContienen++;
                }
            }
            System.out.println(lineasContienen + " líneas contienen la palabra");
        } catch (IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
}
