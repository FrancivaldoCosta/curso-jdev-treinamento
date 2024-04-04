package exercicios;

import javax.swing.JOptionPane;

public class contaBB {

	private static final String Francivaldo = null;

	public static void main(String[] args) {
		
	
		
		JOptionPane.showInputDialog("Informe seu login", null);
		JOptionPane.showInputDialog("Informe sua senha", null);
		
		String login = "Francivaldo";
		int senha = 123;
		
		
		if (login == Francivaldo && senha == 123) {
			JOptionPane.showInputDialog("Olá", login + "Seja bem vindo");
			
			
		}else {
			JOptionPane.showConfirmDialog(null, "Usuario inválido");
			
		}
	}

}
