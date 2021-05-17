package domain.usuario;

import domain.AccuWeatherAPI;
import domain.atuendos.Atuendo;
import domain.atuendos.Categoria;
import domain.atuendos.Prenda;
import java.util.*;
import java.util.stream.Collectors;

public class Recomendador {
  Integer contador;

  public Atuendo recomendar(String ciudad, Usuario usuario){
    Double temperaturaEnLaCiudad = temperaturaEnLaCiudad(ciudad);
    List<Prenda> guardarropaUsuario = usuario.getGuardarropa();
    List<Prenda> prendasRecomendadas = prendasPorTemperatura(guardarropaUsuario, temperaturaEnLaCiudad);
    return atuendoDeListaPrendas(prendasRecomendadas);
  }

  private Atuendo atuendoDeListaPrendas(List<Prenda> prendasRecomendadas) {
    Prenda parteSuperior = elegirUnaDe(prendasRecomendadas, Categoria.PARTE_SUPERIOR);
    Prenda parteInferior = elegirUnaDe(prendasRecomendadas, Categoria.PARTE_INFERIOR);
    Prenda accesorio = elegirUnaDe(prendasRecomendadas, Categoria.ACCESORIO);
    Prenda calzado = elegirUnaDe(prendasRecomendadas, Categoria.CALZADO);
    Atuendo atuendo = new Atuendo(parteSuperior,parteInferior,accesorio,calzado);
    return atuendo;
  }

  private Prenda elegirUnaDe(List<Prenda> prendas, Categoria categoria) {
    return prendas.
        stream().
        filter(prenda -> prenda.getCategoria()==categoria).
        collect(Collectors.toList()).
        get(0);
  }


  private List<Prenda> prendasPorTemperatura(List<Prenda> prendas, Double temperatura) {
    return prendas.
        stream().
        filter(prenda -> prenda.getTemperaturaDeUso().esTemperaturaValida(temperatura)).
        collect(Collectors.toList());
  }

  private Double temperaturaEnLaCiudad(String ciudad) {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
    return getPromedioDeTemperaturas(condicionesClimaticas);
  }

  private Double getPromedioDeTemperaturas(List<Map<String, Object>> condicionesClimaticas){
    List<Double> temperaturas = new ArrayList<>();
    for(int i=0; i<12; i++){
      HashMap<String,Object> horaCero = (HashMap<String,Object>)condicionesClimaticas.get(i);
      HashMap<String,Object> temperature = (HashMap<String, Object>)horaCero.get("Temperature");
      temperaturas.add((Double) temperature.get("Value"));
    }
    return temperaturas.
        stream().
        mapToDouble(d->d).
        average().
        getAsDouble();
  }

}


