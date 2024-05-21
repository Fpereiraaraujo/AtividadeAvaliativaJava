import java.util.Scanner;

public class SistemaMuseu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Obras de Arte");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano de Criação: ");
        int anoCriacao = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha

        System.out.print("Tipo de Obra (Pintura, Escultura, etc.): ");
        String tipo = scanner.nextLine();

        System.out.print("Localização: ");
        String localizacao = scanner.nextLine();

        ObraArte obra = new ObraArte(titulo, artista, anoCriacao, tipo, localizacao);
        System.out.println("Obra cadastrada: " + obra);
    }

}
