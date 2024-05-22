public class Escultura extends ObraArte {
    private String material;

    public Escultura(String titulo, String artista, int anoCriacao, String tipo, String localizacao, String material) {
        super(titulo, artista, anoCriacao, tipo, localizacao);
        this.material = material;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
