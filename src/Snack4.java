/*
Snack4
Data in input una stringa verificare se è palindroma
*/

import java.util.Scanner;

public class Snack4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Verifica se una parola è palindroma:");
        String stringa = input.nextLine();

        input.close();

        // Verifica se la stringa è palindroma
        boolean palindroma = true;
        for (int i = 0; i < stringa.length() / 2; i++) {
            if (stringa.charAt(i) != stringa.charAt(stringa.length() - 1 - i)) {
                palindroma = false;
                break;
            }
        }

        // Stampare il risultato
        if (palindroma) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }
    }
}
