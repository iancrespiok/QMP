package domain.usuario;

import domain.atuendos.*;
import domain.clima.Alerta;
import domain.clima.RepositorioAlertasMeteoreologicas;
import domain.usuario.acciones.AccionPorAlerta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;
import java.util.stream.Collectors;

public class Usuarie {
    private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
    private BuilderPrenda borrador = new BuilderPrenda();
    private List<LocalDate> usosServicioAccuWeather = new ArrayList<>();
    private List<AccionPorAlerta> accionesPorAlerta = new ArrayList<>();

    public Usuarie() {
    }

    public List<AccionPorAlerta> getAccionesPorAlerta() {
        return accionesPorAlerta;
    }

    public void setAccionesPorAlerta(List<AccionPorAlerta> accionesPorAlerta) {
        this.accionesPorAlerta = accionesPorAlerta;
    }

//    public void ejecutarAcciones(){
//        Alerta alerta = RepositorioAlertasMeteoreologicas.getInstance().ultimaAlerta();
//        accionesPorAlerta.stream()
//            .map(accion -> accion.ejecutar(alerta));
//    }

    public Guardarropa getGuardarropa(Integer posicion){
        return this.guardarropas.get(posicion);
    }

    public void agregarPrendas(Guardarropa guardarropa, Prenda ... prendas){
        Integer guardarropaPosicion = guardarropas.indexOf(guardarropa);
        Guardarropa guardarropaElegido = guardarropas.get(guardarropaPosicion);
        guardarropaElegido.agregarPrendas(prendas);
    }

    public void agregarGuardarropa(Guardarropa guardarropa){
        guardarropas.add(guardarropa);
    }

    public void guardarPrenda(Integer posicionGuardarropas) throws Exception {
        if(borrador.esValida()){
            this.guardarropas.get(posicionGuardarropas).agregarPrendas(borrador.toPrenda());
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

    public List<Prenda> todaSuRopa() {
        List<Prenda> todaLaRopaDelUsuario = new ArrayList<>();
        guardarropas.forEach(guardarropa -> todaLaRopaDelUsuario.addAll(guardarropa.getPrendas()));
        return todaLaRopaDelUsuario;
    }
}

