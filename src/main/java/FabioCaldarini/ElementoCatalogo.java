package FabioCaldarini;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class ElementoCatalogo implements Serializable {
    private String codiceISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

    public ElementoCatalogo(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }



    public String getCodiceISBN() {
        return codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public static Optional<ElementoCatalogo> ricercaPerISBN(List<ElementoCatalogo> archivio, String codiceISBN) {
        return archivio.stream()
                .filter(e -> e.getCodiceISBN().equals(codiceISBN))
                .findFirst();
    }

    public static List<ElementoCatalogo> ricercaPerAnnoPubblicazione(List<ElementoCatalogo> archivio, int anno) {
        return archivio.stream()
                .filter(e -> e.getAnnoPubblicazione() == anno)
                .collect(Collectors.toList());
    }

    public static List<ElementoCatalogo> ricercaPerAutore(List<ElementoCatalogo> archivio, String autore) {
        return archivio.stream()
                .filter(e -> e instanceof Libro && ((Libro) e).getAutore().equals(autore))
                .collect(Collectors.toList());
    }
}

