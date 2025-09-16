package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); /* Painel de componentes */

	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

//	CODIGO COMENTADO POIS DEU ERRO NO STOP
//	private Runnable thread1 = new Runnable() {
//
//		@Override
//		public void run() {
//			while (true) { // Fica sempre rodando
//				mostraTempo
//						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
//
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//
//			}
//
//		}
//
//	};

	private volatile boolean running = false; /* ALTERANDO O CODIGO APOS ERRO NO STOP A PARTIR DAQUI*/

	private Runnable thread1 = new Runnable() {
	@Override
	public void run() {
		while (running) {
			SwingUtilities.invokeLater(() -> {
				mostraTempo
						.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
			});

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt(); // Boa prática
			}
		}
	}};

//	PRIMEIRO CRIA O RUNNABLE PRA DEPOIS CRIAR O OBJETO
	private Thread thread1Time;

	public TelaTimeThread() { /* Executa o que tiver dentro no momento da abertura ou execução */
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(250, 250));
		setLocationRelativeTo(null);
		setResizable(true);
		/* Primeira parte concluída */

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*
																			 * Controlador de posicionamento de
																			 * componentes
																			 */
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);

		// ************************************************************

		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
//		CODIGO COMENTADO APOS O ERRO DE STOP
//		jButton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) { /* Executa o clique no botão */
//
//				thread1Time = new Thread(thread1);
//				thread1Time.start();
//			}
//		});

		// ATUALIZANDO BOTÃO 1
		jButton.addActionListener(e -> {
			if (thread1Time == null || !thread1Time.isAlive()) {
				running = true;
				thread1Time = new Thread(thread1);
				thread1Time.start();
			}
		});

//		CODIGO COMENTADO APOS O ERRO DE STOP
//		jButton2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				thread1Time.stop();
//
//			}
//		});

		// ATUALIZANDO BOTÃO 2
		jButton2.addActionListener(e -> {
			running = false;
		});

		add(jPanel, BorderLayout.WEST);
		/* Sempre será o último comando */
		setVisible(true); /* Torna a tela visível para o usuário */
	}

}
