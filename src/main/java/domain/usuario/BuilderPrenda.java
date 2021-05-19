package domain.usuario;

import domain.atuendos.*;

public class BuilderPrenda {
    private Categoria categoria;
    private Tipo tipo;
    private Tela tela = new Tela();
    private RangoDeTemperaturas temperaturaDeUso = new RangoDeTemperaturas();
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

    public void setMaterial(Material material){
        this.tela.setMaterial(material);
    }

    public void setTrama(Trama trama){
        this.tela.setTrama(trama);
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

    public void setRangoTemperatura(RangoDeTemperaturas rangoDeTemperaturas){
        this.temperaturaDeUso = rangoDeTemperaturas;
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
