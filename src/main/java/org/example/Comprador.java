package org.example;

public class Comprador {
    private String sonido;
    private int vuelto=0;
    public Comprador(Moneda moneda, int cualProducto, Expendedor exp)
            throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto p=exp.comprarProducto(moneda,cualProducto);
        Moneda mon=exp.getVuelto();
        while (mon!=null){
            vuelto+= mon.getValor();
        }
        if (p!=null){
            sonido=p.consumir();
        } else {
            sonido=null;
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queCompraste() {
        return sonido;
    }
}
