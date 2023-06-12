package Amics;

import java.util.Scanner;

public class Amics {
    public static void main(String[] args) {

    int contador = 1;
    int dinerstotal = 0;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Quants diners posaras?: ");
            int diners = sc.nextInt();
            dinerstotal=(dinerstotal+diners);
            contador++;
        }while (contador < 6); 
        if (contador==6){ 
            System.out.println("Diners totals: " + dinerstotal);
        }
    }
}
