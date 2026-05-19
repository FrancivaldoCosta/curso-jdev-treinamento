package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		
		/* new Aluno() é uma instância (Criação do Objeto) */
		/* aluno1 é uma referência para o Objeto Aluno */
		
		Aluno aluno1 = new Aluno(); // Aqui será o João
		
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("3.465.463");
		aluno1.setNumeroCPF("234.3434.545-45");
		aluno1.setNomeMae("Shirlei");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		
		System.out.println("---------------------------------------------");
		/* ============================================================== */
		 	
		Aluno aluno2 = new Aluno(); // Aqui será o Pedro
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1979");
		
		System.out.println("Aluno2 Nome é = " + aluno2.getNome());
		System.out.println("Aluno2 Idade é = " + aluno2.getIdade());
		System.out.println("Aluno2 Nascimento é = " + aluno2.getDataNascimento());
		
		/* ============================================================== */
		
		Aluno aluno3 = new Aluno(); // Aqui será o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose", 50);

		
		
	
	
	
	
	}

}
