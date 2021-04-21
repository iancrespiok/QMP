package domain.usuario;

import domain.atuendos.Prenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {
    List<Prenda> guardarropa = new ArrayList<Prenda>();

    public Usuario(List<Prenda> prendas) {
        this.guardarropa = prendas;
    }

    public void agregarPrendas(Prenda ... prendas){
        Collections.addAll(this.guardarropa,prendas);
    }
}

