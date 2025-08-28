package cursojava_executavel;

public class Matriz {

//	Executar o codigo java
	public static void main(String[] args) {
		
		int notas[][] = new int[4][3];
		
		notas[0][0] = 80;
		notas[0][1] = 60;
		notas[0][2] = 50;
		
		notas[1][0] = 40;
		notas[1][1] = 70;
		notas[1][2] = 30;
		
		notas[2][0] = 40;
		notas[2][1] = 70;
		notas[2][2] = 30;
		
		notas[3][0] = 40;
		notas[3][1] = 70;
		notas[3][2] = 30;
		
				
		
		
		//System.out.println(notas);
		/*Percorre as linhas*/
		for (int poslinha = 0; poslinha < notas.length; poslinha ++) { 
			
			System.out.println("====================================================================");
			
			/*Para cada linha percorre as colunas, cada linha é um 'ARRAY'*/
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna ++) { 
				
				System.out.println("Valor da matriz : " + notas[poslinha][poscoluna]);
			}
			
			
		}
	
	}

}
