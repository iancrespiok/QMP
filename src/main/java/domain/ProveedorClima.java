package domain;

import java.util.*;

public class ProveedorClima {
  AccuWeatherAPI apiClima = new AccuWeatherAPI();

  public AccuWeatherAPI getApiClima() {
    return apiClima;
  }

  public Double getPromedioTemperatura(String ciudad){
    List<Map<String,Object>> condicionesClimaticas = this.getApiClima().getWeather(ciudad);

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

  public Double getTemperaturaActual(String ciudad){
    List<Map<String,Object>> condicionesClimaticas = this.getApiClima().getWeather(ciudad);
    HashMap<String,Object> horaCero = (HashMap<String,Object>)condicionesClimaticas.get(0);
    HashMap<String,Object> temperature = (HashMap<String, Object>)horaCero.get("Temperature");
    return ((Double) temperature.get("Value"));
  }

}

