package cursojava_executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava_classes.Aluno;
import cursojava_classes.Disciplina;

public class PrimeiraClasseJava {

	// Main é um metodo auto-executavel em java
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 1; qtd++) {

			/* new Aluno() é uma instancia (Criação de Objeto) */
			/* aluno1 é uma referencia para o objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade? "); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento? "); String
			 * rg = JOptionPane.showInputDialog("registroGeral? "); String cpf =
			 * JOptionPane.showInputDialog("Qual é o CPF? "); String mae =
			 * JOptionPane.showInputDialog("Nome da mae? "); String pai =
			 * JOptionPane.showInputDialog("Nome do pai? "); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula? "); String escola =
			 * JOptionPane.showInputDialog("Nome da escola? "); String serie =
			 * JOptionPane.showInputDialog("Qual a série? ");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setNomeEscola(escola);
			 * aluno1.setSerieMatriculado(serie);
			 */

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina? " + pos + " ");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) { /* Opção sim é zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}

			}

			alunos.add(aluno1);
		}

		for (int pos = 0; pos < alunos.size(); pos ++) {
			Aluno aluno = alunos.get(pos);
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("---------------------------------------------------------");
			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd ++) {
				Disciplina disc = aluno.getDisciplinas().get(posd);
				
				System.out.println(" Materia =  " + disc.getDisciplina() + " nota = " + disc.getNota());
				
				
			}
			
		}

		

	}
}
