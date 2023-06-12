package User;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Quina es la teva edat?: ");
    int edat = sc.nextInt();
    
    System.out.println("Quinas van ser las tevas antigues notes?: ");
    float nota = sc.nextFloat();
    float notasuma;
    notasuma=(notasuma+nota);

    System.out.println("Vas tindre mes notes (Y/N): ");
    char resposta = sc.next().charAt(0);
        if(resposta=='Y'){
            System.out.println("Quinas van ser las tevas antigues notes?: ");
            char nota2 = sc.next().charAt(0);
            notasuma=(notasuma+nota2);
        }

    System.out.println("Amb quin genere t'identifiques? (H-Home /D-Dona /O- Other): ");
    char genere = sc.next().charAt(0);

    System.out.print("La edat del usuari es: " + edat, "La nota del usuari es: " + notasuma,"El usuari s'identifica com:" + genere);
    
    }
}