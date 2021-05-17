package domain.atuendos;

public class RangoDeTemperaturas {
  private Double temperaturaMaxima;
  private Double temperaturaMinima;

  public RangoDeTemperaturas(Double temperaturaMaxima, Double temperaturaMinima) {
    this.temperaturaMaxima = temperaturaMaxima;
    this.temperaturaMinima = temperaturaMinima;
  }

  public void setTemperaturaMaxima(Double temperaturaMaxima) {
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public void setTemperaturaMinima(Double temperaturaMinima) {
    this.temperaturaMinima = temperaturaMinima;
  }

  public Boolean esTemperaturaValida(Double temperatura){
    return temperatura>temperaturaMinima && temperatura<temperaturaMaxima;
  }
}
