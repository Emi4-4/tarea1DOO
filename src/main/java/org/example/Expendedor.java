package org.example;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Moneda> moneda;
    private int precio;

    public Expendedor(int numBebida, int precioBebidas) {
        coca = new Deposito<Producto>();
        sprite = new Deposito<Producto>();
        moneda = new Deposito<Moneda>();
        precio =precioBebidas;

        if (numBebida > 0) {
            for (int i = 0; i < numBebida; i = i + 1) {
                Bebida cokita = new CocaCola(i);
                Bebida sprit = new Sprite(i);
                coca.addProducto(cokita);
                sprite.addProducto(sprit);
            }
        }
    }
    public Moneda getVuelto() {
        return moneda.getProducto();
    }
    public Bebida comprarProducto(Moneda m, int cual) {
        Producto producto = null;
        if (m==null) {
            return null; // aca va una exception
        } else {
            // falta implementar compra
            return null;
        }


    }

}