package meus.cadastroclientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {
    private static List<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {    
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    buscarClientePorNome();
                    break;
                case 4:
                    buscarClientePorId();
                    break;
                case 5:
                    removerClientePorId();
                    break;
                case 6:
                    atualizarCliente();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
        scanner.close();
    }
    private static void exibirMenu(){
        System.out.println("\nMenu:");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente por nome");
            System.out.println("4. Buscar cliente por ID");
            System.out.println("5. Remover cliente pelo ID");
            System.out.println("6. Atualizar cliente");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
    }

    private static boolean emailValido(String email) {
        return email.contains("@") && email.contains(".");
    }
    
    private static boolean telefoneValido(String telefone) {
        return telefone.matches("^759\\d{4}-\\d{4}$");
    }
    
    private static void cadastrarCliente() {
        System.out.print("Id: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                System.out.println("Já existe um cliente com esse ID.");
                return;
            }
        }
        if (!emailValido(email)) {
            System.out.println("Email inválido!");
            return;
        }
        if (!telefoneValido(telefone)) {
            System.out.println("Telefone inválido!");
            return;
        }

        Cliente novoCliente = new Cliente(id, nome, email, telefone);
        clientes.add(novoCliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    private static void buscarClientePorNome() {
        System.out.print("Digite o nome a buscar: ");
        String nomeBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeBuscado)) {
                System.out.println(cliente);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void buscarClientePorId() {
            System.out.print("Digite o Id a buscar: ");
            String idBuscado = scanner.nextLine();
    
            boolean encontrado = false;
            for (Cliente cliente : clientes) {
                if (cliente.getId().equalsIgnoreCase(idBuscado)) {
                    System.out.println(cliente);
                    encontrado = true;
                }
            }

        if (!encontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void atualizarCliente(){
        
    }

    private static void removerClientePorId(){
        System.out.println("Digite o Id a remover");
        String idBuscado = scanner.nextLine();

        boolean encontrado = false;
        Cliente clienteEncontrado = null;
            for (Cliente cliente : clientes) {
                if (cliente.getId().equals(idBuscado)) {
                    clienteEncontrado = cliente;
                    break;
                }
            }

        if (clienteEncontrado != null) {
            System.out.print("Deseja remover o cliente? (S/N): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                clientes.remove(clienteEncontrado);
                System.out.println("Cliente removido com sucesso!");
            }
            encontrado = true;
        }
        if (!encontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }
}
