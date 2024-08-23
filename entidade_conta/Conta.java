package entidade_conta;

public class Conta { //classe pai
	
	private String nome;
	private int    numero;
	private double saldo;
	
	
	public Conta(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void Deposito(double depositar) {
		saldo += depositar;
	}
	
	public void Sacar(double sacar) {
		saldo -= sacar;
	}
	public String mostrar() {
		return "\nConta : " + nome + " Número :  " + numero + " Saldo :  " + saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	

}
