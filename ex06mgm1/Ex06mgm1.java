package ex06mgm1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex06mgm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Frambuesa", "Raspberry");
        diccionario.put("Casa", "House");
        diccionario.put("Manzana", "Apple");
        diccionario.put("Verde", "Green");
        diccionario.put("Agua", "Water");
        diccionario.put("Hola", "Hello");
        diccionario.put("Gato", "Cat");
        diccionario.put("Azul", "Blue");

        int acierto = 0;

        ArrayList<String> espanol = new ArrayList(diccionario.keySet());
        ArrayList<String> ingles = new ArrayList(diccionario.values());

        System.out.println("Test de inglés, reponder s/n");
       
        for (int i = 0; i < 5; i++) {
            String azarEspanol = espanol.get((int) (Math.random() * ((7 - 0) + 1)) + 0);
            String azarIngles = ingles.get((int) (Math.random() * ((7 - 0) + 1)) + 0);

            System.out.println("¿ " + azarEspanol + " es " + azarIngles + " ?: ");
            String contesta = sc.nextLine();

            if (contesta.equals("s") && diccionario.get(azarEspanol).equals(azarIngles)) {
                acierto++;
            }
            if (contesta.equals("n") && (!diccionario.get(azarEspanol).equals(azarIngles))) {
                acierto++;
            }

        }
        
        System.out.println("Has acertado: " + acierto + " preguntas.");
    }

}
