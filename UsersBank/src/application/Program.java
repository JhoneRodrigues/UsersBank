package application;

import java.util.Locale;
import java.util.Scanner;
import object.User;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//Leitura dos dados do usuario
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char option = sc.next().charAt(0);

		//Funcao para transformar qualquer String em maiuscula
		option = Character.toLowerCase(option);
		
		double balance = 0;
		double cash = 0;
		
		//Repeticao caso o usuario nao digite a opcao correta
		while (option !='y' && option !='n') {
			System.out.println();
			System.out.print("Invalid option, type again (y/n): ");
			option = sc.next().charAt(0);
			option = Character.toLowerCase(option);
		}
		
		/*condicao "y": Assume que o usuario deseja depositar
		um valor inicial*/
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			cash = sc.nextDouble();
		}
		
		//Instancicao do objeto apos seguir as normas do construtor
		User user1 = new User (number,name,balance);
		
		/*funcao de deposito, utilizada para armazenar o deposito inicial
		no atributo "balance"*/
		user1.depositCash(cash);
		
		//Escrita do objeto
		System.out.println();
		System.out.println("Account data:");
		System.out.println(user1);
		
		//Deposito
		System.out.print("How much do you want to deposit? ");
		cash = sc.nextDouble();
		user1.depositCash(cash);
		
		//Escrita do objeto apos o deposito
		System.out.println("Updata account:");
		System.out.println(user1);
		
		//Saque
		System.out.print("how much do you want to withdraw? ");
		cash = sc.nextDouble();
		user1.withdrawCash(cash);
		
		//Escrita do objeto apos o saque
		System.out.println("Updata account:");
		System.out.println(user1);
		
		sc.close();
	}

}
