package ClasseJava;

public class Paciente {
	
	private String nomePaciente;
	private String doenca;
	private String nomeMedico;
	private int idade;
	
	public Paciente (String nomePaciente, String doenca, String nomeMedico, int idade) {
		this.nomePaciente = nomePaciente;
		this.doenca = doenca;
		this.nomeMedico = nomeMedico;
		this.idade = idade;
		
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimirInfo() {
		System.out.println(nomePaciente+"possuiu a doença:"+doenca+"está sendo atendido pelo médico:"+nomeMedico+"o paciente tem a idade de:"+idade);
	}
	

}
