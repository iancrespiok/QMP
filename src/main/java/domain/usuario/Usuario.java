package domain.usuario;

import domain.atuendos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Exception;
import java.util.stream.Collectors;

public class Usuario {
    private List<Prenda> guardarropa = new ArrayList<Prenda>();
    private BuilderPrenda borrador = new BuilderPrenda();
    private List<LocalDate> usosServicioAccuWeather = new ArrayList<>();

    public List<Prenda> getGuardarropa() {
        return guardarropa;
    }

    public void agregarPrendas(Prenda ... prendas){
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

    public void setearMaterial(Material material){
        borrador.setMaterial(material);
    }

    public void setearTrama(Trama trama){
        borrador.setTrama(trama);
    }

    public void setearColorPrimario(Color color){
        borrador.setColorPrimario(color);
    }

    public void setearColorSecundario(Color color){
        borrador.setColorSecundario(color);
    }

    public void setearTemperaturaMaxima(Double temperatura){ borrador.setTemperaturaMaximaDeUso(temperatura);}

    public void setearTemperaturaMinima(Double temperatura){ borrador.setTemperaturaMinimaDeUso(temperatura);}

    public void setearRangoTemperatura(RangoDeTemperaturas rangoDeTemperaturas){borrador.setRangoTemperatura(rangoDeTemperaturas);}

    public void usoServicioAccuWeather() {
        this.getUsosServicioAccuWeather().add(LocalDate.now());
    }

    public List<LocalDate> getUsosServicioAccuWeather() {
        return usosServicioAccuWeather;
    }

    public Integer usosServicioAccuWeatherUltimoDia() {
        return this.getUsosServicioAccuWeather().
            stream().
            filter(fecha -> fecha.isEqual(LocalDate.now())).
            collect(Collectors.toList()).
            size();
    }
}

