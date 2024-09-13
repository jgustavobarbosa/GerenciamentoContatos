import java.util.Scanner;


class Contato {
    String nome;
    String telefone;
    String email;
    Contato proximo;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.proximo = null;
    }
}

class ListaContatos {
    private Contato cabeca;

    public void adicionarContato(String nome, String telefone, String email) {
        Contato novoContato = new Contato(nome, telefone, email);
        if (cabeca == null) {
            cabeca = novoContato;
        } else {
            Contato atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoContato;
        }
        System.out.println("Contato adicionado com sucesso!");
    }

    public Contato buscarContato(String chave) {
        Contato atual = cabeca;
        while (atual != null) {
            if (atual.nome.equalsIgnoreCase(chave) || atual.telefone.equals(chave)) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void removerContato(String chave) {
        if (cabeca == null) {
            System.out.println("Lista de contatos vazia.");
            return;
        }

        if (cabeca.nome.equalsIgnoreCase(chave) || cabeca.telefone.equals(chave)) {
            cabeca = cabeca.proximo;
            System.out.println("Contato removido com sucesso!");
            return;
        }

        Contato atual = cabeca;
        Contato anterior = null;

        while (atual != null && !atual.nome.equalsIgnoreCase(chave) && !atual.telefone.equals(chave)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Contato não encontrado.");
            return;
        }

        anterior.proximo = atual.proximo;
        System.out.println("Contato removido com sucesso!");
    }

    public void listarContatos() {
        if (cabeca == null) {
            System.out.println("Lista de contatos vazia.");
            return;
        }

        Contato atual = cabeca;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", Telefone: " + atual.telefone + ", Email: " + atual.email);
            atual = atual.proximo;
        }
    }
}

public class SistemaGerenciamentoContatos {
    public static void main(String[] args) {
        ListaContatos lista = new ListaContatos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Sistema de Gerenciamento de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    lista.adicionarContato(nome, telefone, email);
                    break;
                case 2:
                    System.out.print("Digite o nome ou telefone para busca: ");
                    String chaveBusca = scanner.nextLine();
                    Contato contatoEncontrado = lista.buscarContato(chaveBusca);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado: Nome: " + contatoEncontrado.nome +
                                ", Telefone: " + contatoEncontrado.telefone +
                                ", Email: " + contatoEncontrado.email);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome ou telefone do contato a ser removido: ");
                    String chaveRemocao = scanner.nextLine();
                    lista.removerContato(chaveRemocao);
                    break;
                case 4:
                    lista.listarContatos();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
