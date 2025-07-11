package cursojava_executavel;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;
import cursojava_classes.Aluno;
import cursojava_classes.Diretor;
import cursojava_classes.Disciplina;
import cursojava_classesauxiliares.FuncaoAutenticacao;

public class PrimeiraClasseJava {

	// Main é um metodo auto-executavel em java
	public static void main(String[] args) {

		try {
			
			new File("Arquivo.txt");

			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha))
					.autenticar()) { /*
										 * VOU TRAVAR O CONTRATO PARA AUTORIZAR SOMENTE QUEM REALMENTE TEM O CONTRATO
										 * 100% LEGITIMO
										 */

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * É UMA LISTA QUE DENTRO DELA TEMOS UMA CHAVE QUE IDENTIFICA UMA SEQUENCIA DE
				 * VALORES
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					/* new Aluno() é uma instancia (Criação de Objeto) */
					/* aluno1 é uma referencia para o objeto aluno */

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
					String idade = JOptionPane.showInputDialog("Qual a idade? ");

					/*
					 * String dataNascimento = JOptionPane.showInputDialog("Data de nascimento? ");
					 * String rg = JOptionPane.showInputDialog("registroGeral? "); String cpf =
					 * JOptionPane.showInputDialog("Qual é o CPF? "); String mae =
					 * JOptionPane.showInputDialog("Nome da mae? "); String pai =
					 * JOptionPane.showInputDialog("Nome do pai? "); String matricula =
					 * JOptionPane.showInputDialog("Data da matricula? "); String escola =
					 * JOptionPane.showInputDialog("Nome da escola? "); String serie =
					 * JOptionPane.showInputDialog("Qual a série? ");
					 */

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
					 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
					 * aluno1.setDataMatricula(matricula); aluno1.setNomeEscola(escola);
					 * aluno1.setSerieMatriculado(serie);
					 */

					for (int pos = 1; pos <= 1; pos++) {
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

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) { /* SEPAREI EM LISTAS */
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);

					}

				}

				System.out.println("----------------------------- Lista de aprovados -----------------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Resultado = " + aluno.getNome() + " " + aluno.getAlunoAprovado2()
							+ " com média de + " + aluno.getMediaNota());

				}

				System.out.println("----------------------------- Lista de Recuperação -----------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado = " + aluno.getNome() + " " + aluno.getAlunoAprovado2()
							+ " com média de + " + aluno.getMediaNota());

				}

				System.out.println("----------------------------- Lista de Reprovados -----------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado = " + aluno.getNome() + " " + aluno.getAlunoAprovado2()
							+ " com média de + " + aluno.getMediaNota());

				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

			/* aqui */
		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			/* IMPRIME ERRO NO CONSOJE JAVA */
			e.printStackTrace();

			/* MENSAGEM DO ERRO OU CAUSA */
			System.out.println("Mensagem: " + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe de erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Metodo de erro : " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro : " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class : " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro de conversão de numero " + saida.toString());

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opaa, um null pointer exeption " + e.getClass());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
