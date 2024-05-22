public class Pintura extends ObraArte {
    private String tecnica;

    public Pintura(String titulo, String artista, int anoCriacao, String tipo, String localizacao, String tecnica) {
        super(titulo, artista, anoCriacao, tipo, localizacao);
        this.tecnica = tecnica;
    }

    public String getTecnica() { return tecnica; }
    public void setTecnica(String tecnica) { this.tecnica = tecnica; }

    @Override
    public String toString() {
        return super.toString() + ", Técnica: " + tecnica;
    }
}
