import java.util.ArrayList;

public class GerenciadorDeObras {
    private ArrayList<ObraArte> obrasDeArte;

    public GerenciadorDeObras() {
        obrasDeArte = new ArrayList<>();
    }

    public void cadastrarObra(ObraArte obra) {
        obrasDeArte.add(obra);
        System.out.println("Obra cadastrada com sucesso!");
    }

    public void listarObras() {
        System.out.println("Lista de Obras de Arte:");
        for (ObraArte obra : obrasDeArte) {
            System.out.println(obra);
        }
    }

    public ObraArte buscarObra(String titulo) {
        for (ObraArte obra : obrasDeArte) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                return obra;
            }
        }
        return null;
    }

    public void atualizarObra(String titulo, ObraArte novaObra) {
        ObraArte obra = buscarObra(titulo);
        if (obra != null) {
            obra.setTitulo(novaObra.getTitulo());
            obra.setArtista(novaObra.getArtista());
            obra.setAnoCriacao(novaObra.getAnoCriacao());
            obra.setTipo(novaObra.getTipo());
            obra.setLocalizacao(novaObra.getLocalizacao());
            System.out.println("Obra atualizada com sucesso!");
        } else {
            System.out.println("Obra não encontrada.");
        }
    }

    public void excluirObra(String titulo) {
        ObraArte obra = buscarObra(titulo);
        if (obra != null) {
            obrasDeArte.remove(obra);
            System.out.println("Obra excluída com sucesso!");
        } else {
            System.out.println("Obra não encontrada.");
        }
    }

    public ArrayList<ObraArte> getObrasDeArte() {
        return obrasDeArte;
    }

    public void setObrasDeArte(ArrayList<ObraArte> obrasDeArte) {
        this.obrasDeArte = obrasDeArte;
    }
}
