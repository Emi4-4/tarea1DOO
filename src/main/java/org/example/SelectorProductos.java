package org.example;

public enum SelectorProductos {
    COCACOLA(1,1000),
    SPRITE(2,900),
    FANTA(3,1100),
    SNICKERS(4,1400),
    SUPER8(5,800),
    BONOBON(6,600);

    private final int precio;
    private final int numero;
    SelectorProductos(int numero,int precio){
        this.precio = precio;
        this.numero  = numero;
    }
    public static SelectorProductos cualPosicion(int posicion){
        for (SelectorProductos producto : SelectorProductos.values()){
            if (producto.getTipoProducto() == posicion){
                return producto;
            }
        }
        return null;
    }
    public int getPrecio(){
        return precio;
    }

    public int getTipoProducto() {
        return numero;
    }
}