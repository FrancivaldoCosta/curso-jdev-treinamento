package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	/* Main é um metodo auto executável em java */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			lerArquivo();

			String loguin = JOptionPane.showInputDialog("Informe o loguin");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticacao(new Diretor(loguin, senha)).autenticar()) { /*
										 * VOU TRAVAR O CONTRATO PARA AUTORIZAR SOMENTE QUEM REALMENTE TEM O CONTRATO
										 * 100% LEGITMO
										 */

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * É UMA LISTA QUE DENTRO DELA TEMOS UMA CHAVE QUE IDENTIFICA UMA SEQUENCIA DE
				 * VALORES TAMBEM
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				/*
				 * CODIGO FOI REMOVIDO PELO ALEX List<Aluno> alunosAprovados = new
				 * ArrayList<Aluno>(); List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
				 * List<Aluno> alunosReprovados = new ArrayList<Aluno>();
				 */
				for (int qtd = 1; qtd <= 1; qtd++) {

					// Objeto ainda não existe na memoria
					/* new Aluno() é uma instancia (Criação de Objeto) */
					// aluno1 é uma referencia para o objeto aluno

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a sua idade? ");
					/*
					 * String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
					 * String rg = JOptionPane.showInputDialog("Registro Geral"); String cpf =
					 * JOptionPane.showInputDialog("Qual é o CPF?"); String mae =
					 * JOptionPane.showInputDialog("Nomoe da mae"); String pai =
					 * JOptionPane.showInputDialog("Nome do pai"); String matricula =
					 * JOptionPane.showInputDialog("Data da matricula"); String serie =
					 * JOptionPane.showInputDialog("Qual a serie"); String escola =
					 * JOptionPane.showInputDialog("Nome da escola");
					 */

					Aluno aluno1 = new Aluno(); // Aqui será o João

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
					 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
					 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
					 * aluno1.setNomeEscola(escola);
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina1(nomeDisciplina);
						disciplina.setNota1(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);

					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

					if (escolha == 0) {/* Opção SIM e Zero */

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {

							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++; /* ++ soma +1 */
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
						}

					}

					alunos.add(aluno1);

				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) { // SEPAREI EM LISTAS

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						// alunosAprovados.add(aluno); CODIGO ALTERADO PELO KEY NA AULA FOI REMOVIDO
						maps.get(StatusAluno.APROVADO).add(aluno);

					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						// alunosRecuperacao.add(aluno); CODIGO ALTERADO PELO KEY NA AULA FOI REMOVIDO
						maps.get(StatusAluno.RECUPERACAO).add(aluno);

					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						// alunosReprovados.add(aluno);//PODE COLOCAR SOMENTE ESTA LINHA; CODIGO
						// ALTERADO E REMOVIDO
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}

				System.out.println("-------------------------Lista dos Aprovados---------------------------");
				for (Aluno aluno : /* alunosAprovados */ maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
				}

				System.out.println("-------------------------Lista dos Reprovados---------------------------");
				for (Aluno aluno : /* alunosReprovados */ maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
				}

				System.out.println("-------------------------Lista dos Recuperacao---------------------------");
				for (Aluno aluno : /* alunosReprovados */ maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());

				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

			/* AQUI */

		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();

			/* IMPRIME ERRO NO CONSOLE JAVA */
			e.printStackTrace();

			/* MENSAGEM DO ERRO OU CAUSA */
			System.out.println("Mensagem: " + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe de erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Metodo de erro : " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro : " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class : " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro da conversão de numero " + saida.toString()); //e.getClass().getName());

		} finally { /*
					 * SEMPRE É EXECUTADO OCORRENDO ERROS OU NÃO. PORQUE FINALY SEMPRE É USADO
					 * QUANDO PRECISA EXECUTAR UM PROCESSO ACONTECENDO ERRO OU NÃO NO SISTEMA
					 */
			JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");

		}
	}

	public static void lerArquivo() throws FileNotFoundException {
		
		//File fil = new File("c://line.txt");
		//Scanner scanner = new Scanner(fil);
				

	}
}
