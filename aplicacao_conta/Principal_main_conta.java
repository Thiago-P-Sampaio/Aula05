package aplicacao_conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade_conta.Conta;
import entidade_conta.ContaCorrente;
import entidade_conta.ContaPoupanca;

public class Principal_main_conta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//
		System.out.print("\n Criação de CONTA: ");
		System.out.print("Deseja criar um conta Corrente ou Poupança: \n1\n2");
		int choose = sc.nextInt();
		
		String nome = null;
		int numero =  0;
		Double saldo = null;
		Double poupanca = null;
		
		Conta cc_1 = new ContaCorrente(null, 0, 0, 500);
	

		
		
		if(choose == 1) {
				System.out.print("\n Nome da conta: ");
				cc_1.setNome(sc.next());
				System.out.print("\n Número da conta: ");
				cc_1.setNumero(sc.nextInt());
				System.out.print("\n Depositar? ");
				cc_1.Deposito(sc.nextDouble());;
				System.out.print(cc_1.mostrar());
				System.out.print("\n Sacar? ");
				cc_1.Sacar(sc.nextDouble());
				System.out.print(cc_1.mostrar());
		}
		else if( choose == 2) {
			System.out.print("\n Nome da conta: ");
			nome = sc.next();
			System.out.print("\n Número da Conta: ");
			numero = sc.nextInt();
			System.out.print("\n Saldo da Conta: ");
			saldo = sc.nextDouble();
			System.out.print("\n Depósito na Poupança: ");
			poupanca = sc.nextDouble();
			saldo -= poupanca;
			Conta cp_1 = new ContaPoupanca(nome,numero, saldo,poupanca);
			System.out.print(cp_1.toString());	
			
		}
			
			
		}
		
		
		
		

		
		

	}


