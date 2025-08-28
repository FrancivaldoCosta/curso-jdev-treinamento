package cursojava_executavel;


import cursojava_classes.Aluno;
import cursojava_classes.Disciplina;

public class ArrayVetor {
//	Usado para exeutar o codigo
	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.6, 6,8};
		double[] notasLogica = {7.1, 5.7, 9.6, 7,8};
		

//		Criação do aluno
		Aluno aluno = new Aluno(); 
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDEV Treinamento");
		
//		Criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
//		----------------------------------------------------------------------------------------------
//		Criação do aluno 2 
		Aluno aluno2 = new Aluno(); 
		aluno2.setNome("Alex Fernando Egidio 2 ");
		aluno2.setNomeEscola("JDEV Treinamento");
		
//		Criação da disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de java 2");
		disciplina3.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Logica de programação");
		disciplina4.setNota(notasLogica);
		
		aluno2.getDisciplinas().add(disciplina4);
		
//		----------------------------------------------------------------------------------------------
	
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;

		
		for (int pos = 0; pos < arrayAlunos.length; pos ++ ) {
			
			System.out.println("Nome do aluno é : " + arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é : " +  d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length; posnota ++ ) {
					System.out.println("A nota numero : " + posnota + " é igual = " + d.getNota()[posnota] );
					
				}
				
			}
			
		}
		
		
	}

}
