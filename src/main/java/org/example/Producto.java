package org.example;

abstract class Producto{
    protected int serie;
    public Producto(int serie) {
        this.serie=serie;
    }

    public abstract String consumir();
    public int getSerie(){
        return serie;
    }
}