package org.example.day1;

public class Product {
    private long id;
    private String name;
    private String categoria;
    private double prezzo;

    public Product(long id, String name, String categoria, double prezzo) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrezzo() {
        return prezzo;
    }
    public void creaProdotto(){

    }
}
