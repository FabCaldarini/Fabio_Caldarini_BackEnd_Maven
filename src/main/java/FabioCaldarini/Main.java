package FabioCaldarini;

import java.util.Scanner;

public class Main {
    private static ArchivioBibliotecario archivio = new ArchivioBibliotecario();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inizializzaArchivio();


        Libro libroAggiunto = new Libro("444444444", "Titolo Aggiunto", 2023, 200, "Autore Aggiunto", "Genere Aggiunto");
        archivio.aggiungiElemento(libroAggiunto);
        System.out.println("Aggiunto un nuovo libro: " + libroAggiunto);


        System.out.print("Inserisci il codice ISBN per la ricerca: ");
        String isbnRicerca = scanner.nextLine();
        ricercaPerISBN(isbnRicerca);


        System.out.print("Inserisci l'anno di pubblicazione per la ricerca: ");
        int annoRicerca = scanner.nextInt();
        ricercaPerAnnoPubblicazione(annoRicerca);


        scanner.nextLine();
        System.out.print("Inserisci l'autore per la ricerca: ");
        String autoreRicerca = scanner.nextLine();
        ricercaPerAutore(autoreRicerca);

        System.out.print("Inserisci il codice ISBN per la rimozione: ");
        String isbnRimozione = scanner.nextLine();
        rimuoviElementoPerISBN(isbnRimozione);


    }

    private static void inizializzaArchivio() {
        archivio.aggiungiElemento(new Libro("123456789", "Il Signore123", 1954, 1000, "EPICODE", "Fantasy"));
        archivio.aggiungiElemento(new Libro("987654321", "Harry Pizza", 1997, 400, "Fabio Caldarini", "Fantasy"));
        archivio.aggiungiElemento(new Libro("555555555", "Anime123", 1949, 300, "Giovanni Rossi", "Distopia"));
        archivio.aggiungiElemento(new Rivista("111111111", "Non lo so", 2022, 50, Rivista.Periodicità.MENSILE));
        archivio.aggiungiElemento(new Rivista("222222222", "Valentino Rossi", 2022, 60, Rivista.Periodicità.MENSILE));
        archivio.aggiungiElemento(new Rivista("333333333", "Gazzetta", 2022, 40, Rivista.Periodicità.MENSILE));
        archivio.aggiungiElemento(new Rivista("444444444", "Scuola Guida", 2023, 30, Rivista.Periodicità.SETTIMANALE));
    }

    private static void ricercaPerISBN(String isbn) {
        System.out.println("\nRicerca per ISBN (" + isbn + "):");
        archivio.ricercaPerISBN(isbn).ifPresentOrElse(
                elemento -> System.out.println("Risultato della ricerca: " + elemento),
                () -> System.out.println("Nessun elemento trovato con il codice ISBN specificato.")
        );
    }

    private static void ricercaPerAnnoPubblicazione(int anno) {
        System.out.println("\nRicerca per Anno di Pubblicazione (" + anno + "):");
        archivio.ricercaPerAnnoPubblicazione(anno).forEach(System.out::println);
    }

    private static void ricercaPerAutore(String autore) {
        System.out.println("\nRicerca per Autore (" + autore + "):");
        archivio.ricercaPerAutore(autore).forEach(System.out::println);
    }

    private static void rimuoviElementoPerISBN(String isbn) {
        System.out.println("\nRimuovi Elemento per ISBN (" + isbn + "):");
        boolean rimozioneEffettuata = archivio.rimuoviElementoPerISBN(isbn);

        if (rimozioneEffettuata) {
            System.out.println("Elemento rimosso con successo.");
        } else {
            System.out.println("Nessun elemento trovato con il codice ISBN specificato.");
        }
    }

}






