package aula_poo;

import java.math.BigDecimal;

public class ExecutarTeste {
	public static void main(String[] args) {

		Venda venda = new Venda();
		Produto produto = new Produto();

		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Alex Fernando");
		venda.setValorTotal(BigDecimal.valueOf(197.00));

		System.out.println("Descrição Venda : " + venda);
		System.out.println("Descrição Produto : " + produto);

	}

}
