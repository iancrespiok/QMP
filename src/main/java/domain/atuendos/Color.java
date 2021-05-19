package domain.atuendos;

public class Color {
    int red, green, blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String imprimir(){
        return "formado en RGB con las siguientes proporciones; "+ (this.red / 256)*100 + "% de rojo, " + (this.green / 256)*100 + "% de verde y " + (this.blue / 256)*100 + "% de azul";
    }
}
