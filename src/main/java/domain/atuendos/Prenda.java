package domain.atuendos;


public class Prenda {
    private Categoria categoria;
    private Tipo tipo;
    private Tela tela;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(Categoria categoria, Tipo tipo, Tela tela, Color colorPrimario, Color colorSecundario) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.tela = tela;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Prenda(Categoria categoria, Tipo tipo, Tela tela, Color colorPrimario) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.tela = tela;
        this.colorPrimario = colorPrimario;
    }

    public Prenda(){

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

    public boolean esValida() {
        //TODO
        //FALTA INFO
        return false;
    }
}
