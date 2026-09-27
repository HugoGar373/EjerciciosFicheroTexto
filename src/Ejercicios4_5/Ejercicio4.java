package Ejercicios4_5;

import java.io.*;

public class Ejercicio4 {
    private static final String origen = "src/Ejercicios4_5/datos_con_lineas.txt";
    private static final String destino = "src/Ejercicios4_5/copia_sin_lineas.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destino))){
            String linea;
            while ((linea = br.readLine()) != null){
                if (!linea.trim().isEmpty()){
                    bw.write(linea);
                    bw.newLine();
                }
            }
            System.out.println("Copiado sin líneas vacias");
        } catch (IOException e) {
            System.out.println("Error al copiar");
        }
    }
}
