package Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero:  ");
        String nombreFichero = sc.nextLine();

        int totalLineas = 0;
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreFichero))) {
            while (lector.readLine() != null) {
                totalLineas++;
            }
            System.out.println("El fichero contiene " + totalLineas + " líneas.");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }
    }
}