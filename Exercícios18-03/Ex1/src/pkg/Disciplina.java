package pkg;

public class Disciplina {
	public String nome;
	public int cargaHoraria;
	public String professor;
	
	public void exibirDados() {
		System.out.println("Nome da disciplina: " + nome);
		System.out.println("Carga horária: " + cargaHoraria + "h");
		System.out.println("Professor da disciplina: " + professor);
	}
}
