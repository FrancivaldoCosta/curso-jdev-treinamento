package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		// s Aluno aluno = new Aluno(); // é uma instância (Criação do Objeto)
		/* aluno1 é uma referência para o Objeto Aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
//		String idade = JOptionPane.showInputDialog("Qual a idade? ");
//		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento? ");
//		String rg = JOptionPane.showInputDialog("Registro Geral? ");
//		String cpf = JOptionPane.showInputDialog("Qual é o CPF? ");
//		String mae = JOptionPane.showInputDialog("Nome da mãe ");
//		String pai = JOptionPane.showInputDialog("Nome do pai ");
//		String matricula = JOptionPane.showInputDialog("Data da matricula ");
//		String serie = JOptionPane.showInputDialog("Qual a série? ");
//		String escola = JOptionPane.showInputDialog("Nome da escola");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
//		aluno1.setIdade(Integer.valueOf(idade));
//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setRegistroGeral(rg);
//		aluno1.setNumeroCPF(cpf);
//		aluno1.setNomeMae(mae);
//		aluno1.setNomePai(pai);
//		aluno1.setDataMatricula(matricula);
//		aluno1.setSerieMatriculado(serie);
//		aluno1.setNomeEscola(escola);

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		
		if (escolha == 0) { /* Opção SIM é ZERO */
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 out 4? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao ++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");	
					
			}

		}

		System.out.println(aluno1.toString()); // Descrição do objeto na memória
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}
}