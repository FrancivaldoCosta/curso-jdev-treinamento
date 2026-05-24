package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		 //s Aluno aluno = new Aluno(); // é uma instância (Criação do Objeto) 
		 /*aluno1 é uma referência para o Objeto Aluno*/ 

	
		  String nome = JOptionPane.showInputDialog("Qual o nome do aluno? "); String
		  idade = JOptionPane.showInputDialog("Qual a idade? "); String dataNascimento
		  = JOptionPane.showInputDialog("Data de Nascimento? "); String rg =
		  JOptionPane.showInputDialog("Registro Geral? "); String cpf =
		  JOptionPane.showInputDialog("Qual é o CPF? "); String mae =
		  JOptionPane.showInputDialog("Nome da mãe "); String pai =
		  JOptionPane.showInputDialog("Nome do pai "); String matricula =
		  JOptionPane.showInputDialog("Data da matricula "); String serie =
		  JOptionPane.showInputDialog("Qual a série? "); String escola =
		  JOptionPane.showInputDialog("Nome da escola"); String nota1 =
		  JOptionPane.showInputDialog("Nota 1"); String nota2 =
		  JOptionPane.showInputDialog("Nota 2"); String nota3 =
		  JOptionPane.showInputDialog("Nota 3"); String nota4 =
		  JOptionPane.showInputDialog("Nota 4");
		  
		  Aluno aluno1 = new Aluno(); // Aqui será o João
		  
		  aluno1.setNome(nome); aluno1.setIdade(Integer.valueOf(idade));
		  aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
		  aluno1.setNumeroCPF(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
		  aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
		  aluno1.setNomeEscola(escola); aluno1.setNota1(Double.parseDouble(nota1));
		  aluno1.setNota2(Double.parseDouble(nota2));
		  aluno1.setNota3(Double.parseDouble(nota3));
		  aluno1.setNota4(Double.parseDouble(nota4));
		  
		  System.out.println(aluno1.toString()); // Descrição do objeto na memória
		  System.out.println("Média do aluno = " + aluno1.getMediaNota());
		  System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		 

		
		/* Equals Hashcode (Diferenceiar e comparar Objetos) */
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCPF("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNumeroCPF("0123");
		
		
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		} else {
			System.out.println("Alunos não são iguais");
		}
		
		
		
		
	}

}
