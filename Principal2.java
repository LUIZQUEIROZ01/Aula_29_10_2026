package Aula_29_10_2026;

public class Principal2 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario ("Pepe Mujica", "123.456.789-00", 5000.00, "Presidente", "Poder Executivo");{
		System.out.println("Funcionário");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());}
		
	Atendente atendente = new Atendente ("Pepe Mujica", "123.456.789-00", 5000.00, "Presidente", "Poder Executivo", 100000.00) {
	System.out.println("\n Atendente");
	System.out.println("Nome: " + atendente.getNome());
	System.out.println("CPF: " + atendente.getCpf());
	System.out.println("Salário: " + atendente.getSalario());
	System.out.println("Cargo: " + atendente.getCargo());
	System.out.println("Departamento: " + atendente.getDepartamento());
	System.out.println("Ajuda de Custo: " + atendente.getAjudadeCusto());		

}
