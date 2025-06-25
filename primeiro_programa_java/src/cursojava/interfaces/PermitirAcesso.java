package cursojava.interfaces;


/*ESSA INTERFACE SERÁ O NOSSO CONTRATO DE AUTENTICAÇÃO*/
public interface PermitirAcesso {
	
	
	public boolean autenticar(String login, String senha); /*APENAS DECLARAÇÃO DO METODO*/ 
	public boolean autenticar();

}
