package ex06mgm2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex06mgm2 {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(77, 88, 99));
        ArrayList<Integer> lista3 = new ArrayList<>();
        System.out.println(mezclaListas(lista1, lista2));
        System.out.println(mezclaListas(lista2, lista1));
        System.out.println(mezclaListas(lista1, lista3));
        System.out.println(mezclaListas(lista2, lista3));
    }

    public static ArrayList<Integer> mezclaListas(ArrayList<Integer> a1, ArrayList<Integer> a2) {

        ArrayList<Integer> mezcla = new ArrayList();

        int tamano1 = a1.size();
        int tamano2 = a2.size();
        int contador = 0;

        do {
            if (contador < tamano1) {
                mezcla.add(a1.get(contador));
            }

            if (contador < tamano2) {
                mezcla.add(a2.get(contador));
            }

            contador++;
            
        } while ((contador < tamano1) || (contador < tamano2));

        return mezcla;
    }

}
