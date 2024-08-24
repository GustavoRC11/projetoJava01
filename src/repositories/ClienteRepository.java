package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	public void exportarDados(Cliente cliente) {

		try {

			var printWrinter = new PrintWriter("c:\\temp\\cliente_" + cliente.getId() + ".txt");

			printWrinter.write("\nID do cliente........" + cliente.getId());
			printWrinter.write("\nNome......." + cliente.getNome());
			printWrinter.write("\nCPF do cliente......" + cliente.getCpf());
			printWrinter.write("\nTelefone do cliente......." + cliente.getTelefone());
			printWrinter.write("\nEmail do cliente....." + cliente.getEmail());

			printWrinter.close();

			System.out.println("\nDados gravados com sucesso!");

		}

		catch (Exception e) {

			System.out.println("\nFalha ao gravar arquivo: " + e.getMessage());

		}

	}

}
