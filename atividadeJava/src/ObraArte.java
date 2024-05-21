public class ObraArte {
    private String titulo;
    private String artista;
    private int anoCriacao;
    private String tipo;
    private String localizacao;

    public ObraArte(String titulo, String artista, int anoCriacao, String tipo, String localizacao) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoCriacao = anoCriacao;
        this.tipo = tipo;
        this.localizacao = localizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Ano: " + anoCriacao + ", Tipo: " + tipo
                + ", Localização: " + localizacao;
    }

}
