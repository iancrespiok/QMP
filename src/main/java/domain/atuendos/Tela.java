package domain.atuendos;

public class Tela {
    private Material material;
    private Trama trama = Trama.LISA;

    public Tela(Material material, Trama trama) {
        this.material = material;
        this.trama = trama;
    }

    public Tela(Material material) {
        this.material = material;
    }
    public Tela() { }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }

    public Material getMaterial() {
        return material;
    }

    public Trama getTrama() {
        return trama;
    }

}
