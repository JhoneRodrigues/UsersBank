package object;

public class User {
	//ATRIBUTOS DO OBJETO
	private int number;
	private String name;
	private double balance; 
	//PRIVATE: Restringe o acesso ao atributo dentre outras classe
	
	//CONSTRUTOR
	/*Obriga o proprio programador a declarar os parametros 
	antes de instanciar o objeto*/
	public User(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		/*THIS: Utilizado para especificar o acesso a um atributo
		dessa classe, e nao a uma variavel*/
	}
	
	//GET: metodo utilizado para mostrar atributos "PRIVATE"
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	
	//SET: metodo para alterar o valor de um atributo "private"
	public String setName() {
		return name;
	}

	public double getCash() {
		return balance;
	}
	
	// metodo para realizar o deposito
	public void depositCash (double cash) {
		this.balance += cash;
	}
	
	//metodo para realizar o saque com uma taxa de $ 5.00
	public void withdrawCash (double cash) {
		this.balance -= cash + 5;
	}
	
	/* TOSTRING: Utilizado para escrever o objeto em um
	 formato preferivel*/
	public String toString() {
		return name
				+"'s account"
				+ ", number: "
				+ number
				+ ", balance: $ "
				+ String.format("%.2f%n",balance);
	}
	

}
