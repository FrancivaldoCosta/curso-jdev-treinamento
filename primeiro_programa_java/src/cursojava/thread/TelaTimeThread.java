package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() { /* Executa o que tiver dentro no momento da abertura ou execução */
	
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(250, 250));
		setLocationRelativeTo(null);
		setResizable(false);
		/* Primeira parte concluída */

	
	
		/* Sempre será o último comando */
		setVisible(true); /* Torna a tela visível para o usuário */
	}

}
