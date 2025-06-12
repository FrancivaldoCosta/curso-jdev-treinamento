package aula_poo;

import java.math.BigDecimal;

public class ExecutarTeste {
	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo Orientação Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setNome("Módulo de Spring Boot API REST");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(300));
		
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Alex Fernando");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		
		
		System.out.println("Descrição Venda : " + venda);
		

	}

}
