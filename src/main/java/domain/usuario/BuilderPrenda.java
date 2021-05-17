package domain.usuario;

import domain.atuendos.*;

public class BuilderPrenda {
    private Categoria categoria;
    private Tipo tipo;
    private Tela tela;
    private RangoDeTemperaturas temperaturaDeUso;
    private Color colorPrimario;
    private Color colorSecundario;

    public BuilderPrenda() {
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public void setTemperaturaMinimaDeUso(Double temperaturaMinimaDeUso){
        this.temperaturaDeUso.setTemperaturaMinima(temperaturaMinimaDeUso);
    }

    public void setTemperaturaMaximaDeUso(Double temperaturaMaximaDeUso){
        this.temperaturaDeUso.setTemperaturaMaxima(temperaturaMaximaDeUso);
    }

    public boolean esValida() {
        return true;
        //TODO
    }

    public Prenda toPrenda() {
        Prenda prenda = new Prenda(categoria,tipo,tela,temperaturaDeUso,colorPrimario);
        if(colorSecundario==null){
            return prenda;
        }else{
            prenda.setColorSecundario(colorSecundario);
            return prenda;
        }
    }
}
