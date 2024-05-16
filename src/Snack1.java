/*
Snack1
Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
*/

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero inserito è pari");
        } else {
            System.out.println("Il numero inserito è dispari ");
        }

        scanner.close();
    }
}
