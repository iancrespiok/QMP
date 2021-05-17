package domain.uniformes;

import domain.atuendos.*;
import domain.usuario.BuilderPrenda;

public class SastreINSU extends Sastre{
  public Prenda fabricarParteSuperior(){
    BuilderPrenda builderPrenda = new BuilderPrenda();
    builderPrenda.setCategoria(Categoria.PARTE_SUPERIOR);
    builderPrenda.setTipo(Tipo.CHOMBA);
    builderPrenda.setTela(new Tela(Material.ALGODON, Trama.A_CUADROS));
    builderPrenda.setColorPrimario(new Color(0,0,0));
    builderPrenda.setColorSecundario(new Color(0,27,210));
    return builderPrenda.toPrenda();
  }

  public Prenda fabricarParteInferior(){
    BuilderPrenda builderPrenda = new BuilderPrenda();
    builderPrenda.setCategoria(Categoria.PARTE_INFERIOR);
    builderPrenda.setTipo(Tipo.PANTALON);
    builderPrenda.setTela(new Tela(Material.FRIZA));
    builderPrenda.setColorPrimario(new Color(256,256,256));
    return builderPrenda.toPrenda();
  }

  public Prenda fabricarCalzado(){
    BuilderPrenda builderPrenda = new BuilderPrenda();
    builderPrenda.setCategoria(Categoria.CALZADO);
    builderPrenda.setTipo(Tipo.ZAPATO);
    builderPrenda.setTela(new Tela(Material.CUERO));
    builderPrenda.setColorPrimario(new Color(256,256,256));
    return builderPrenda.toPrenda();
  }
}
