package Aula_29_10_2026;

public class Atendente extends Funcionario {
		private double ajudadeCusto;
	
		
	// Construtor //
	
	public Atendente(String nome, String cpf, double salario, String cargo, String departamento) {
		super(nome, cpf, salario, cargo, departamento);
		this.ajudadeCusto = ajudadeCusto;
	}


	// Set and Get //
	
	public double getAjudadeCusto() {
		return ajudadeCusto;
	}

	public void setAjudadeCusto(double ajudadeCusto) {
		this.ajudadeCusto = ajudadeCusto;

}
}

