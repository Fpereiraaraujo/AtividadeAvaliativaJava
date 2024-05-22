import java.io.*;
import java.util.ArrayList;

public class PersistenciaDeDados {
    private static final String FILE_NAME = "obras_de_arte.txt";

    public static void salvarObras(ArrayList<ObraArte> obrasDeArte) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(obrasDeArte);
            System.out.println("Obras salvas com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar obras: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<ObraArte> carregarObras() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<ObraArte>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Nenhum arquivo de obras encontrado. Iniciando com lista vazia.");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar obras: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
