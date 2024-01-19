package FabioCaldarini;

public class Rivista extends ElementoCatalogo {
    public enum Periodicità {
        SETTIMANALE, MENSILE, SEMESTRALE
    }

    private Periodicità periodicità;

    public Rivista(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "codiceISBN='" + getCodiceISBN() + '\'' +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", numeroPagine=" + getNumeroPagine() +
                "periodicità=" + periodicità +
                '}';
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }
}

