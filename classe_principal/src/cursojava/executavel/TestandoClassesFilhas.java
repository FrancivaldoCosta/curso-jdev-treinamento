package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev - Treinamento");
		aluno.setNomeEscola("Jdev - Treinamento");
		aluno.setIdade(22);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("000000000");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("8786386438483");
		secretario.setNome("Joao");
		secretario.setIdade(18);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Sálario do aluno é = "+ aluno.salario());
		System.out.println("Sálario do diretor é = " + diretor.salario());
		System.out.println("Sálario do secretário é = " + secretario.salario());
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
				
	}
	
	public static void teste(Pessoa pessoa) {
		System.err.println("Essa pessoa é demais " 
	+ pessoa.getNome() + "e o salario é de " + pessoa.salario());
	}

}
