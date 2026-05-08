package cursojava_executavel;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;

		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Switch case: Operações exatas */

		int dia = 2;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2: 
			System.err.println("Segunda-Feira");
			break;
		case 3: 
			System.err.println("Terça-Feira");
			break;

		default: System.out.println("Outro dia qualquer");
			break;
		}		
		
		
		
		
	}

}
