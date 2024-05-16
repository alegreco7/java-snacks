/*
Snack5
Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
Continuare a chiedere una nuova stringa finchè non si inserisce 0.
*/

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Inserisci una stringa o 0 per uscire:");
            String stringa = input.nextLine();

            // Uscita se l'utente inserisce 0
            if (stringa.equals("0")) {
                break;
            }

            // Contatori per caratteri alfabetici, numeri e simboli non alfanumerici
            int caratteriAlfabetici = 0;
            int numeri = 0;
            int simboliNonAlfanumerici = 0;

            // Analizza ogni carattere della stringa
            for (int i = 0; i < stringa.length(); i++) {
                char carattere = stringa.charAt(i);

                // Controlla se il carattere è alfabetico
                if (Character.isLetter(carattere)) {
                    caratteriAlfabetici++;
                }
                // Controlla se il carattere è un numero
                else if (Character.isDigit(carattere)) {
                    numeri++;
                }
                // Controlla se il carattere è un simbolo non alfanumerico
                else if (!Character.isWhitespace(carattere)) {
                    simboliNonAlfanumerici++;
                }
            }

            System.out.println("Caratteri alfabetici: " + caratteriAlfabetici);
            System.out.println("Numeri: " + numeri);
            System.out.println("Simboli non alfanumerici: " + simboliNonAlfanumerici);
        }

        input.close();
    }
}

