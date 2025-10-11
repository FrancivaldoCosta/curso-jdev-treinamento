package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	
	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		
		synchronized (iteracao) { /*Bloquear o acesso a esta lista por outros processos*/
			
			while (iteracao.hasNext()) { /*Enquanto conter dados na lista irá processar*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); 
				
				// Processar 10 mil notas fiscais
				// Gerar uma lista de PDF
				// Gerar um envio em massa de email
				
				System.out.println("----------------------------------------------------------------------------------");
				
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) { /*Dar um tempo pra descarga de memoria*/
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		

		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { /*Processou toda a lista dá um tempo pra limpesa de memoria*/
			e.printStackTrace();
		}
		
	}

}
