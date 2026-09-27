package Ejercicios_Ampliacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero al cuál envíar las frases");
        String fichero = frase.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            System.out.println("Introduce las frases: ");
            while (true) {
                String frase1 = frase.nextLine();
                if (frase1.isEmpty()){
                    break;
                }
                bw.write(frase1);
                bw.newLine();
            }
            System.out.println("Frases escritas");
        }
        catch (IOException e){
            System.out.println("Error al escribir");
        }
    }
}
