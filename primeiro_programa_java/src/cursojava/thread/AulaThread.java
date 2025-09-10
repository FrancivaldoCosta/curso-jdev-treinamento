package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo */
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();


		/* Thread processando em paralelo envio de nota fiscal */
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		

		/* Codigo do sistema do usuário continua o fluxo de trabalho */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
//		Fluxo do sistema, cadastro de venda, um emissão de nota fiscal, algo do tipo
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");

	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {


			/* Codigo de rotina */

			/* Codigo da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				 */

				System.out.println("Executando alguma rotina, por exemplo envio de e-mail");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* Dá um tempo */

			}
			/* Fim do codigo em paralelo */
			
		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			/* Codigo de rotina */

			/* Codigo da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				 */

				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* Dá um tempo */

			}
			/* Fim do codigo em paralelo */

		}
	};

}
