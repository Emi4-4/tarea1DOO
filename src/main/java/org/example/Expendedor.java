package org.example;

public class Expendedor {
    private Deposito<Producto> cocacola;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> super8;
    private Deposito<Producto> snickers;
    private Deposito<Producto> bonobon;
    private Deposito<Moneda> monedaVuelto;


    public Expendedor(int numeroProductos) {
        cocacola = new Deposito<Producto>();
        sprite = new Deposito<Producto>();
        fanta = new Deposito<Producto>();
        super8 = new Deposito<Producto>();
        snickers = new Deposito<Producto>();
        bonobon = new Deposito<Producto>();

        monedaVuelto = new Deposito<Moneda>();

        if (numeroProductos > 0) {
            for (int i = 0; i < numeroProductos; i = i + 1) {
                Bebida cocas = new CocaCola(100+i);
                Bebida sprit = new Sprite(200+i);
                Bebida fantas = new Fanta(300+i);
                Dulce super8s = new Super8(400+i);
                Dulce snicker = new Snickers(500+i);
                Dulce bonbons =new BonoBon(600+i);

                cocacola.addProducto(cocas);
                sprite.addProducto(sprit);
                fanta.addProducto(fantas);
                super8.addProducto(super8s);
                snickers.addProducto(snicker);
                bonobon.addProducto(bonbons);

            }
        }
    }
    public Moneda getVuelto() {
        return monedaVuelto.getProducto();
    }
    public Producto comprarProducto(Moneda m, int cual) {
        Producto producto = null;
        if (m==null) {
            return null; // aca va una exception
        } else {
            SelectorProductos productos = SelectorProductos.cualPosicion(cual);
            if(productos==null){
                monedaVuelto.addProducto(m);
                // qué pasa si no hay producto
                return null;
            } else {

                switch (productos) {
                    case COCACOLA:
                        if (m.getValor() < productos.getPrecio()){
                            monedaVuelto.addProducto(m);
                        } else if(m.getValor() == productos.getPrecio()) {
                            producto=cocacola.getProducto();
                            if (producto==null){
                                monedaVuelto.addProducto(m);
                                //
                            }
                        } else {
                            producto = cocacola.getProducto();
                            if (producto == null) {
                                monedaVuelto.addProducto(m);
                            } else {
                                int vuelto = (m.getValor() - productos.getPrecio()) / 100;
                                for (int i = 0; i < vuelto; i++) {
                                    monedaVuelto.addProducto(new Moneda100());
                                }
                            }
                        }
                        break;
                    case SPRITE:
                        if (m.getValor() < productos.getPrecio()){
                            monedaVuelto.addProducto(m);
                        } else if(m.getValor() == productos.getPrecio()) {
                            producto=sprite.getProducto();
                            if (producto==null){
                                monedaVuelto.addProducto(m);
                                //
                            }
                        } else {
                            producto = sprite.getProducto();
                            if (producto == null) {
                                monedaVuelto.addProducto(m);
                            } else {
                                int vuelto = (m.getValor() - productos.getPrecio()) / 100;
                                for (int i = 0; i < vuelto; i++) {
                                    monedaVuelto.addProducto(new Moneda100());
                                }
                            }
                        }
                        break;
                    case FANTA:
                        if (m.getValor() < productos.getPrecio()){
                            monedaVuelto.addProducto(m);
                        } else if(m.getValor() == productos.getPrecio()) {
                            producto=fanta.getProducto();
                            if (producto==null){
                                monedaVuelto.addProducto(m);
                                //
                            }
                        } else {
                            producto = fanta.getProducto();
                            if (producto == null) {
                                monedaVuelto.addProducto(m);
                            } else {
                                int vuelto = (m.getValor() - productos.getPrecio()) / 100;
                                for (int i = 0; i < vuelto; i++) {
                                    monedaVuelto.addProducto(new Moneda100());
                                }
                            }
                        }
                        break;
                    case SUPER8:
                        if (m.getValor() < productos.getPrecio()){
                            monedaVuelto.addProducto(m);
                        } else if(m.getValor() == productos.getPrecio()) {
                            producto=super8.getProducto();
                            if (producto==null){
                                monedaVuelto.addProducto(m);
                                //
                            }
                        } else {
                            producto = super8.getProducto();
                            if (producto == null) {
                                monedaVuelto.addProducto(m);
                            } else {
                                int vuelto = (m.getValor() - productos.getPrecio()) / 100;
                                for (int i = 0; i < vuelto; i++) {
                                    monedaVuelto.addProducto(new Moneda100());
                                }
                            }
                        }
                        break;
                    case SNICKERS:
                        if (m.getValor() < productos.getPrecio()){
                            monedaVuelto.addProducto(m);
                        } else if(m.getValor() == productos.getPrecio()) {
                            producto=snickers.getProducto();
                            if (producto==null){
                                monedaVuelto.addProducto(m);
                                //
                            }
                        } else {
                            producto = snickers.getProducto();
                            if (producto == null) {
                                monedaVuelto.addProducto(m);
                            } else {
                                int vuelto = (m.getValor() - productos.getPrecio()) / 100;
                                for (int i = 0; i < vuelto; i++) {
                                    monedaVuelto.addProducto(new Moneda100());
                                }
                            }
                        }
                        break;
                    case BONOBON:
                        if (m.getValor() < productos.getPrecio()){
                            monedaVuelto.addProducto(m);
                        } else if(m.getValor() == productos.getPrecio()) {
                            producto=bonobon.getProducto();
                            if (producto==null){
                                monedaVuelto.addProducto(m);
                                //
                            }
                        } else {
                            producto = bonobon.getProducto();
                            if (producto == null) {
                                monedaVuelto.addProducto(m);
                            } else {
                                int vuelto = (m.getValor() - productos.getPrecio()) / 100;
                                for (int i = 0; i < vuelto; i++) {
                                    monedaVuelto.addProducto(new Moneda100());
                                }
                            }
                        }
                        break;
                }
            }
        }
        return producto;
    }

}