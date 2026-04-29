package org.example;

import java.util.ArrayList;

public class Deposito<E> {
    private final ArrayList<E> Productos;
    public Deposito() {
        Productos=new ArrayList<>();
    }
    public void addProducto(E producto) {
        Productos.add(producto);
    }
    public E getProducto(){
        if (!Productos.isEmpty()) {
           return Productos.remove(0);
        } else {
            return null;
        }
    }
}
