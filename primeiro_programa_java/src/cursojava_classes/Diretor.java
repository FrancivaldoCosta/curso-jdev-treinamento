package cursojava_classes;

/*CLASSE FILHA DE PESSOA QUE EXTENDE DE PESSOA*/
public class Diretor extends Pessoa {

	private String registroEducacao;
	private int TempoDirecao;
	private String titulacao;

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return TempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		TempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", TempoDirecao=" + TempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		return 3900.78;
	}

}
