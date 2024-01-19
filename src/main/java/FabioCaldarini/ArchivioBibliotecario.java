package FabioCaldarini;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ArchivioBibliotecario implements Serializable {
    private List<ElementoCatalogo> archivio = new ArrayList<>();

    public void aggiungiElemento(ElementoCatalogo elemento) {
        archivio.add(elemento);
    }

    public boolean rimuoviElementoPerISBN(String isbn) {
        Optional<ElementoCatalogo> elementoDaRimuovere = archivio.stream()
                .filter(elemento -> elemento.getCodiceISBN().equals(isbn))
                .findFirst();

        if (elementoDaRimuovere.isPresent()) {
            archivio.remove(elementoDaRimuovere.get());
            return true;
        } else {
            return false;
        }
    }


    public List<ElementoCatalogo> getArchivio() {
        return archivio;
    }
    public Optional<ElementoCatalogo> ricercaPerISBN(String codiceISBN) {
        return ElementoCatalogo.ricercaPerISBN(archivio, codiceISBN);
    }

    public List<ElementoCatalogo> ricercaPerAnnoPubblicazione(int anno) {
        return ElementoCatalogo.ricercaPerAnnoPubblicazione(archivio, anno);
    }

    public List<ElementoCatalogo> ricercaPerAutore(String autore) {
        return ElementoCatalogo.ricercaPerAutore(archivio, autore);
    }




}


