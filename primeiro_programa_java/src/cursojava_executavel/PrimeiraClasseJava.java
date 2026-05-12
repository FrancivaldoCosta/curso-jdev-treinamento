package cursojava_executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

	String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
	
	double carroNumero = Double.parseDouble(carros); 
	double pessoaNumero = Double.parseDouble(pessoas); 
	
	int divisao = (int) (carroNumero / pessoaNumero);
	
	double resto = (carroNumero % pessoaNumero);
	
	int resposta =  JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão? ");
	
	if (resposta == 0) {
		JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carro");
		
	} else {
		JOptionPane.showMessageDialog(null, "Não quis ver o RESULTADO");
	}
	
	resposta =  JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão? ");
	
	if ( resposta == 0) {
		JOptionPane.showMessageDialog(null, "O RESTO da divisão é " + resto);
	} else {
		JOptionPane.showMessageDialog(null, "Não quis ver o RESTO");
	}
	
	
	}

}
