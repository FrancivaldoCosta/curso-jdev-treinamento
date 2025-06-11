package principio.responsabilidade;

public class ContaBancaria {

	private String descricao;

	private double saldo = 8000;

	public void soma100Reais() {
		saldo += 100;
	}

	public void diminui100Reais() {
		saldo -= 100;

	}

	public void sacarDinheiro(double saque) {
		saldo -= saque;

	}

	public void depositaDinheiro(double deposito) {
		saldo += deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descrição) {
		this.descricao = descrição;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
}
