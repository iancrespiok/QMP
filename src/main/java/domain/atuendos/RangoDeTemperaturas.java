package domain.atuendos;

public class RangoDeTemperaturas {
  private Double temperaturaMaxima;
  private Double temperaturaMinima;
  private Boolean independienteDeTemperatura;

  public RangoDeTemperaturas(Double temperaturaMinima, Double temperaturaMaxima) {
    this.temperaturaMaxima = temperaturaMaxima;
    this.temperaturaMinima = temperaturaMinima;
    this.independienteDeTemperatura = false;
  }

  public RangoDeTemperaturas() {
    this.independienteDeTemperatura = true;
  }

  public void setTemperaturaMaxima(Double temperaturaMaxima) {
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public void setTemperaturaMinima(Double temperaturaMinima) {
    this.temperaturaMinima = temperaturaMinima;
  }

  public Double getTemperaturaMaxima() {
    return temperaturaMaxima;
  }

  public Double getTemperaturaMinima() {
    return temperaturaMinima;
  }

  public Boolean esTemperaturaValida(Double temperatura){
    return this.independienteDeTemperatura || (temperatura>temperaturaMinima && temperatura<temperaturaMaxima);
  }

}
