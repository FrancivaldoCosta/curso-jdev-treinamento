package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {

	// Esses são os atributos do Aluno
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public Aluno() { /*
						 * Cria os dados na memoria - sendo padrão do java - SE NÃO ESCREVER ELE TAMBEM
						 * CHAMA POR TRAZ
						 */

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;

	}

	public Aluno(String nomePadrao, int idadePadrao) {
		super.nome = nomePadrao; /*PODE USAR O SUPER PRA INDICAR QUE É HERANÇA DA SUPERCLASSE, MAIS NESSE CASO NÃO É NESCESSARIO*/
		idade = idadePadrao;

	}

	/* Veremos os metodos SETTERS e GETTERS do Objeto */
	/* SET é para adicionar ou receber dados para os atributos */
	/* GET é para resgatear ou obter o valor do atributo */

	/* Recebe dados */
	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome; // OU PODE COLOCAR SO NOME

	}

	/* Método que retorna a média do aluno */
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
	for (Disciplina disciplina : disciplinas) {
		somaNotas += disciplina.getNota1();
	}	
		
		
		return somaNotas / disciplinas.size();
	}

	/* Método que retorna true para aprovado e false para reprovado */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {//aprovado
			return true;

		} else {
			return false;//reprovado
		}
	}

	/* Metodo que retorna a média do aluno */
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

	@Override /* IDENTIFICA METODO SOBRESCRITO*/
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba aluno eé maior idade " : "Ixe vc é menor de idade";
		
	}

	@Override
	public double salario() {
		return 1500.90;
	}
}
