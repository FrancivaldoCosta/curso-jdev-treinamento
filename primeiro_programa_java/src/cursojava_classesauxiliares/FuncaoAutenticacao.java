package cursojava_classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*REALMENTE E SOMENTE RECEBER ALGUEM QUE TEM O CONTRATO DA INTERFACE DE PERMITIR ACESSO E CHAMAR O AUTENTICAR*/

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
