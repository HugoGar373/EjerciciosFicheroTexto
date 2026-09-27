package Ejercicios4_5;

import java.io.*;

public class Ejercicio3 {
    private static final String origen = "src/Ejercicios4_5/datos.txt";
    private static final String destino = "src/Ejercicios4_5/copia.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destino))){
                 String linea;
                 while ((linea = br.readLine()) != null){
                     bw.write(linea);
                     bw.newLine();
                 }
            System.out.println("Fichero copiado correctamente");
             } catch (IOException e){
            System.out.println("Error al copiar");
        }

    }
}