package liczby11_2;

import java.util.ArrayList;
import java.util.Random;

public class liczby {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();

        Random rn = new Random();
        for (int i = 0 ; i<50;i++){
        lista.add(rn.nextDouble()*1000);
        }

        double max = 0;
        double min = 0;
        double suma = 0;
        for (int i = 0 ; i<lista.size(); i++) {

            if (i == 0){
                max = lista.get(i);
            } else if (max < lista.get(i)) {
                max = lista.get(i);
            }


            if (i == 0) {
                min = lista.get(i);
            } else if (min > lista.get(i)) {
                min = lista.get(i);
            }

            suma = suma + lista.get(i);

        }



        System.out.println("Max liczb: " + max + "\nMin liczb: " + min + "\nŚrednia: " + suma/lista.size());

        System.out.println("LIczby większe od średniej: ");
        for (int i = 0 ; i<lista.size(); i++) {
            if (lista.get(i) > suma/lista.size()){
                System.out.print(Math.round(lista.get(i)*100)/100.00 + ", ");
            }
        }

    }
}
