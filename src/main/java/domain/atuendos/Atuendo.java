package domain.atuendos;

import java.util.List;

public class Atuendo {
    private List<Prenda> accesorios;
    private List<Prenda> prendasParteArriba;
    private Prenda prendaParteAbajo;
    private Prenda calzado;

    public List<Prenda> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(List<Prenda> accesorios) {
        this.accesorios = accesorios;
    }

    public List<Prenda> getPrendasParteArriba() {
        return prendasParteArriba;
    }

    public void setPrendasParteArriba(List<Prenda> prendasParteArriba) {
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
