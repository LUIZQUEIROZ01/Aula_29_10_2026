package Aula_29_10_2026;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ("João da Silva", "(11) 1234-1234");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11) 1234-1234", "123.456.789-00", "300.456.989-X");
		System.out.println("\nPessoa física: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica ("Empresa XYZ", "(11) 1234-1234", "1234567890");
		System.out.println("\nPessoa Jurídica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());

	}

}
