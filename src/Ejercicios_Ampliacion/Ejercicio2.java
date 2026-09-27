package Ejercicios_Ampliacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero: ");
        String fichero = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))){
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;
                if (contador == 24) {
                    System.out.println("Pulsa intro para continuar");
                    sc.nextLine();
                }
            }
        }
        catch (IOException e){
            System.out.println("Error al leer el fichero");
        }
    }
}
