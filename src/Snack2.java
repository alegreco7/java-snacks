/*
Snack2
Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
*/

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] nomi = {
                "Alessandro",
                "Marco",
                "Luca",
                "Massimiliano",
                "Cristiano"
        };
        String[] cognomi = {
                "Greco",
                "Ronaldo",
                "Allegri",
                "Rossi",
                "Bianchi"
        };

        // Numero di invitati da generare
        int numeroInvitati = 5;

        // Oggetto per la generazione di numeri casuali
        Random rand = new Random();

        // Generazione dei nomi completi degli invitati
        for (int i = 0; i < numeroInvitati; i++) {
            // Seleziona casualmente un nome e un cognome dagli array
            String nomeCasuale = nomi[rand.nextInt(nomi.length)];
            String cognomeCasuale = cognomi[rand.nextInt(cognomi.length)];

            // Combina il nome e il cognome per formare il nome completo
            String nomeCompleto = nomeCasuale + " " + cognomeCasuale;

            // Stampa il nome completo del invitato
            System.out.println("Invitato " + (i + 1) + ": " + nomeCompleto);
        }
    }
}

