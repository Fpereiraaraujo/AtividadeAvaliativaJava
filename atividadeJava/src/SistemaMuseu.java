import java.util.Scanner;

public class SistemaMuseu {
    private static GerenciadorDeObras gerenciadorDeObras = new GerenciadorDeObras();

    public static void main(String[] args) {
        gerenciadorDeObras.setObrasDeArte(PersistenciaDeDados.carregarObras());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar obra");
            System.out.println("2. Listar obras");
            System.out.println("3. Buscar obra por título");
            System.out.println("4. Atualizar obra");
            System.out.println("5. Excluir obra");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarObra(scanner);
                    break;
                case 2:
                    gerenciadorDeObras.listarObras();
                    break;
                case 3:
                    buscarObra(scanner);
                    break;
                case 4:
                    atualizarObra(scanner);
                    break;
                case 5:
                    excluirObra(scanner);
                    break;
                case 6:
                    PersistenciaDeDados.salvarObras(gerenciadorDeObras.getObrasDeArte());
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarObra(Scanner scanner) {
        System.out.println("Cadastro de Obras de Arte");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano de Criação: ");
        int anoCriacao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Tipo de Obra (Pintura, Escultura, etc.): ");
        String tipo = scanner.nextLine();

        System.out.print("Localização: ");
        String localizacao = scanner.nextLine();

        ObraArte obra;
        if (tipo.equalsIgnoreCase("Pintura")) {
            System.out.print("Técnica: ");
            String tecnica = scanner.nextLine();
            obra = new Pintura(titulo, artista, anoCriacao, tipo, localizacao, tecnica);
        } else if (tipo.equalsIgnoreCase("Escultura")) {
            System.out.print("Material: ");
            String material = scanner.nextLine();
            obra = new Escultura(titulo, artista, anoCriacao, tipo, localizacao, material);
        } else {
            obra = new ObraArte(titulo, artista, anoCriacao, tipo, localizacao);
        }

        gerenciadorDeObras.cadastrarObra(obra);
    }

    private static void buscarObra(Scanner scanner) {
        System.out.print("Digite o título da obra para buscar: ");
        String tituloBusca = scanner.nextLine();
        ObraArte obra = gerenciadorDeObras.buscarObra(tituloBusca);
        if (obra != null) {
            System.out.println("Obra encontrada: " + obra);
        } else {
            System.out.println("Obra não encontrada.");
        }
    }

    private static void atualizarObra(Scanner scanner) {
        System.out.print("Digite o título da obra para atualizar: ");
        String tituloBusca = scanner.nextLine();
        ObraArte obraExistente = gerenciadorDeObras.buscarObra(tituloBusca);
        if (obraExistente != null) {
            System.out.println("Atualização de Obras de Arte");
            System.out.print("Novo Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Novo Artista: ");
            String artista = scanner.nextLine();

            System.out.print("Novo Ano de Criação: ");
            int anoCriacao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Novo Tipo de Obra (Pintura, Escultura, etc.): ");
            String tipo = scanner.nextLine();

            System.out.print("Nova Localização: ");
            String localizacao = scanner.nextLine();

            ObraArte novaObra;
            if (tipo.equalsIgnoreCase("Pintura")) {
                System.out.print("Nova Técnica: ");
                String tecnica = scanner.nextLine();
                novaObra = new Pintura(titulo, artista, anoCriacao, tipo, localizacao, tecnica);
            } else if (tipo.equalsIgnoreCase("Escultura")) {
                System.out.print("Novo Material: ");
                String material = scanner.nextLine();
                novaObra = new Escultura(titulo, artista, anoCriacao, tipo, localizacao, material);
            } else {
                novaObra = new ObraArte(titulo, artista, anoCriacao, tipo, localizacao);
            }

            gerenciadorDeObras.atualizarObra(tituloBusca, novaObra);
        } else {
            System.out.println("Obra não encontrada.");
        }
    }

    private static void excluirObra(Scanner scanner) {
        System.out.print("Digite o título da obra para excluir: ");
        String tituloExclusao = scanner.nextLine();
        gerenciadorDeObras.excluirObra(tituloExclusao);
    }
}
