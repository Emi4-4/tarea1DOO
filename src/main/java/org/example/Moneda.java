package org.example;

public abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}
    public abstract int getValor();

    public int compareTo(Moneda moneda){
        return Integer.compare(this.getValor(), moneda.getValor());
    }

}
