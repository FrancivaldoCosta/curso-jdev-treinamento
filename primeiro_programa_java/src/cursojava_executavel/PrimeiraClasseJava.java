package cursojava_executavel;

import javax.swing.JOptionPane;

import cursojava_classes.Aluno;

public class PrimeiraClasseJava {

	// Main é um metodo auto-executavel em java
	public static void main(String[] args) {

		
		Aluno aluno1 = new Aluno(); /* Aqui será o João */
		
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */
		
		Aluno aluno3 = new Aluno(); /* Aqui será o Alex */
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	
		
	}

}
