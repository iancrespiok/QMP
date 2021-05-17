package domain.uniformes;

import domain.atuendos.Prenda;

public abstract class Sastre {
  public Uniforme fabricarUniforme(){
    return new Uniforme(this.fabricarParteSuperior(), this.fabricarParteInferior(), this.fabricarCalzado());
  }

  protected abstract Prenda fabricarCalzado();

  protected abstract Prenda fabricarParteInferior();

  protected abstract Prenda fabricarParteSuperior();
}
