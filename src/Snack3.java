/*
Snack3
Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
*/

public class Snack3 {
    public static void main(String[] args) {
        // Array di numeri interi
        int[] numeri = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Variabile per memorizzare la somma degli elementi in posizione dispari
        int sommaDispari = 0;

        for (int i = 0; i < numeri.length; i++) {
            // Verifica se l'indice è pari
            if (i % 2 == 0) {
                // Aggiungi il valore dell'elemento alla somma totale
                sommaDispari += numeri[i];
            }
        }

        // Stampare la somma degli elementi in posizione dispari
        System.out.println("La somma degli elementi in posizione dispari è: " + sommaDispari);
    }
}