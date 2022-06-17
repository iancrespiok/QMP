package domain.atuendos;

public class Color {
    Double red, green, blue;

    public Color(int red, int green, int blue) {
        this.red = Double.valueOf(red);
        this.green = Double.valueOf(green);
        this.blue = Double.valueOf(blue);
    }

    public String descripcion(){
        return "formado en RGB con las siguientes proporciones; "+ (this.red / 256)*100 + "% de rojo, " + (this.green / 256)*100 + "% de verde y " + (this.blue / 256)*100 + "% de azul";
    }
}
