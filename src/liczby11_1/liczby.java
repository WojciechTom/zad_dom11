package liczby11_1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class liczby {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        int liczba = 0;
        do {


            try {
                liczba = scan.nextInt();
                if (liczba > 0) {
                    lista.add(liczba);
                } else if (liczba == 0 ){
                    System.out.println("Liczba nie może być zerem - proszę podać liczbę wiekszą od zera");
                }
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawny typ wprowadzonych danych. Proszę ponownie wprowadzić poprawną liczbę.");
                scan.nextLine();
            }



        } while (liczba >= 0);


        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }


        System.out.println("Suma liczb:");

        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i == lista.size() - 1) {
                System.out.print("=");
            } else {
                System.out.print("+");
            }
            suma = suma + lista.get(i);
        }

        System.out.println(suma);


        int max = 0;
        int min = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (max < lista.get(i)) {
                max = lista.get(i);
            }

            if (i == 0) {
                min = lista.get(i);
            } else if (min > lista.get(i)) {
                min = lista.get(i);
            }
        }


        if (lista.size() == 0 ){
            System.out.println("Max liczb: - \nMin liczb: - ");
        } else {
            System.out.println("Max liczb: " + max + "\nMin liczb: " + min);
        }

    }


}

