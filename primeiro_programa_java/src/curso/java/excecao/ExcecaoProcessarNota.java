package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super("Vixxx um erro no processamento do arquivo ao processar as notas do aluno" + erro);
	}

}
