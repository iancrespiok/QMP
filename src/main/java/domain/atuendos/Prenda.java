package domain.atuendos;


import java.lang.management.OperatingSystemMXBean;

public class Prenda {
    private Categoria categoria;
    private Tipo tipo;
    private Tela tela;
    private Color colorPrimario;
    private Color colorSecundario = null;
    private RangoDeTemperaturas temperaturaDeUso;

    public Prenda(Categoria categoria, Tipo tipo, Tela tela, RangoDeTemperaturas temperaturaDeUso,Color colorPrimario, Color colorSecundario) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.tela = tela;
        this.temperaturaDeUso = temperaturaDeUso;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Prenda(Categoria categoria, Tipo tipo, Tela tela,RangoDeTemperaturas temperaturaDeUso, Color colorPrimario) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.tela = tela;
        this.temperaturaDeUso = temperaturaDeUso;
        this.colorPrimario = colorPrimario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Tela getTela() {
        return tela;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public RangoDeTemperaturas getTemperaturaDeUso() {
        return temperaturaDeUso;
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

    public Boolean esParaCalor(){
        return this.temperaturaDeUso.getTemperaturaMinima() > 19;
    }

    public String descripcion(){
        String texto = this.getTipo() + " de " + this.getTela().getMaterial() + " con trama " + this.getTela().getTrama() + " y de color " + this.getColorPrimario().descripcion();
        return texto;
    }

}
