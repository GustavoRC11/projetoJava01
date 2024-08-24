package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

public class Main {

	public static void main(String[] args) {

		System.out.println("Sistema para cadastro de clientes.");
		System.out.println("Turma de Java WebDeveloper - Sábado.");

		var cliente = new Cliente();

		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do clçiente:"));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o CPF do cliente"));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente:"));
		cliente.setEmail(JOptionPane.showInputDialog("Informe o email do cliente:"));

		System.out.println("\nDados do Cliente:");
		System.out.println("\tId......." + cliente.getId());
		System.out.println("\tNome........" + cliente.getNome());
		System.out.println("\tCPF.......: " + cliente.getCpf());
		System.out.println("\tTelefone..: " + cliente.getTelefone());
		System.out.println("\tEmail.....: " + cliente.getEmail());

		var clienteRepository = new ClienteRepository();

		clienteRepository.exportarDados(cliente);  

	}

}
