package cursojava_executavel;

import cursojava_classes.Aluno;
import cursojava_classes.Diretor;
import cursojava_classes.Pessoa;
import cursojava_classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Aluno - Alex JDev - Treinamento");
		aluno.setNomeEscola("Jdev - Treinamento");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1231456465");
		diretor.setNome("Diretor - Egidio");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("13216464646464");
		secretario.setIdade(18);
		secretario.setNome("Secretário - João");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Salário Aluno é = " + aluno.salario());
		System.out.println("Salário Diretor é = " + diretor.salario());
		System.out.println("Salário Secretário é = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	

	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salário é de  = " + pessoa.salario());
	}

}
