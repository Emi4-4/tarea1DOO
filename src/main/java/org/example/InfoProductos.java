package org.example;

public enum InfoProductos{
    COCACOLA(1500),
    SPRITE(2500),
    FANTA(2100),
    SNICKERS(1000),
    SUPER8(500);

    private final int precio;
    InfoProductos(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
}