package domain.atuendos;

import java.util.List;

public class Atuendo {
    private Prenda accesorio;
    private Prenda prendasParteArriba;
    private Prenda prendaParteAbajo;
    private Prenda calzado;

    public Atuendo(Prenda accesorios, Prenda prendasParteArriba, Prenda prendaParteAbajo, Prenda calzado) {
        this.accesorio = accesorios;
        this.prendasParteArriba = prendasParteArriba;
        this.prendaParteAbajo = prendaParteAbajo;
        this.calzado = calzado;
    }

    public Prenda getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Prenda accesorio) {
        this.accesorio = accesorio;
    }

    public Prenda getPrendaParteArriba() {
        return prendasParteArriba;
    }

    public void setPrendaParteArriba(Prenda prendasParteArriba) {
        this.prendasParteArriba = prendasParteArriba;
    }

    public Prenda getPrendaParteAbajo() {
        return prendaParteAbajo;
    }

    public void setPrendaParteAbajo(Prenda prendaParteAbajo) {
        this.prendaParteAbajo = prendaParteAbajo;
    }

    public Prenda getCalzado() {
        return calzado;
    }

    public void setCalzado(Prenda calzado) {
        this.calzado = calzado;
    }
}
