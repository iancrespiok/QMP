package domain.atuendos;

import java.awt.*;

public class Prenda {
    private Categoria categoria;
    private String tipo;
    private String tela;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(Categoria categoria, String tipo, String tela, Color colorPrimario, Color colorSecundario) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.tela = tela;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTela() {
        return tela;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }
}
