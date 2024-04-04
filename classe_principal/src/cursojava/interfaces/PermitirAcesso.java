package cursojava.interfaces;

/*ESSA INTERFACE SERÁ NOSSO CONTRATO DE AUTENTICAÇÃO*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
	

}
