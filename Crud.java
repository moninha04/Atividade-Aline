import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private static ArrayList<Produto> listaDeProduto = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;


            while (!exit) {
                System.out.println("\n===== Operações CRUD Livraria Online =====");
                System.out.println("1. Create (Criar)");
                System.out.println("2. Read (Visualizar/Ler)");
                System.out.println("3. Update (Atualizar)");
                System.out.println("4. Delete (Apagar)");
                System.out.println("5. Exit");
                System.out.print("Digite a opção desejada: ");
                int choice = scanner.nextInt();
            scanner.nextLine(); // consome a entrada de dados da próxima linha
        
            switch (choice) {
                case 1:
                    createProduto(scanner);
                    break;
                case 2:
                    readProduto();
                    break;
                case 3:
                    updateProduto(scanner);
                    break;
                case 4:
                    deleteProduto(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha outra opção!");
                    break;
            }
        }

        scanner.close();
    }

private static void createProduto(Scanner scanner) {
    System.out.print("Digite o titulo: ");
    String titulo = scanner.nextLine();
    System.out.print("Digite o preço: ");
    double preco = scanner.nextDouble();


    Produto produto = new Produto(nextId++, titulo, preco);
    listaDeProduto.add(produto);
    System.out.println("Produto adicionado com sucesso!");
}

private static void readProduto() {
    if (listaDeProduto.isEmpty()) {
        System.out.println("Nenhum Produto cadastrado. Comece a cadastrar para visualizar os itens aqui.");
    } else {
        System.out.println("\n===== Lista de produtos da Loja =====");
        for (Produto produto : listaDeProduto) {
            System.out.println(produto);
        }
    }
}

private static void updateProduto(Scanner scanner) {
    System.out.print("Digite o ID do Produto que deseja atualizar: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Consumindo a quebra de linha pendente

    boolean encontrado = false;
    for (Produto produto : listaDeProduto) {
        if (produto.getId() == id) {
            System.out.print("Digite o titulo: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite o autor: ");
            String autor = scanner.nextLine();
            System.out.print("Digite o preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumindo a quebra de linha pendente
            System.out.print("Digite o gênero: ");
            String genero = scanner.nextLine();

            produto.setTitulo(titulo);
            produto.setAutor(autor);
            produto.setPreco(preco);
            produto.setGenero(genero);
            encontrado = true;
            System.out.println("Produto foi atualizado com sucesso!");
            break;
        }
    }
    if (!encontrado) {
        System.out.println("Produto não encontrado! Verifique o ID: " + id);
    }
}


private static void deleteProduto(Scanner scanner) {
    System.out.print("Digite o ID do produto que deseja remover: ");
    int id = scanner.nextInt();

    // a expressão abaixo itera sobre a lista e remove se o id do item é igual ao id
    // //digitado, expressões lambdas só estão disponíveis no Java 8 e superiores
    // boolean removido = listaDeTenis.removeIf(tenis -> tenis.getId() == id);

    boolean removido = false;
    Iterator<Produto> iterator = listaDeProduto.iterator();
    while (iterator.hasNext()) {
        Produto produto = iterator.next();
        if (produto.getId() == id) {
            iterator.remove();
            removido = true;
            break; // Assuming there's only one element with the given ID
        }
    }

    if (removido) {
        System.out.println("Produto foi removido com sucesso!");
    } else {
        System.out.println("Produto não encontrado! Verifique o ID: " + id);
    }
}
}
