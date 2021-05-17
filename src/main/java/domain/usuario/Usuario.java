package domain.usuario;

import domain.atuendos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Exception;

public class Usuario {
    List<Prenda> guardarropa = new ArrayList<Prenda>();
    //TODO
    // Crear clase borrador en vez de usar la de prenda
    BuilderPrenda borrador = new BuilderPrenda();

    public List<Prenda> getGuardarropa() {
        return guardarropa;
    }

    private void agregarPrendas(Prenda ... prendas){
        Collections.addAll(this.guardarropa,prendas);
    }

    public void guardarPrenda() throws Exception {
        if(borrador.esValida()){
            this.agregarPrendas(borrador.toPrenda());
        }else {
            Exception excepcion = new Exception("La prenda que intentas guardar es invalida");
            throw excepcion;
        }
    }

    public void setearTipo(Tipo tipo){
        borrador.setTipo(tipo);
    }

    public void setearCategoria(Categoria categoria){
        borrador.setCategoria(categoria);
    }

    public void setearTela(Tela tela){
        borrador.setTela(tela);
    }

    public void setearColorPrimario(Color color){
        borrador.setColorPrimario(color);
    }

    public void setearColorSecundario(Color color){
        borrador.setColorSecundario(color);
    }

}

