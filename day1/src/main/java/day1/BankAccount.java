package day1;


public class BankAccount {

	private int amount;
	public BankAccount(int amount) {
		this.amount=amount;
	}
	public void depositing(int amount) {
		this.amount+=amount;
		System.out.println("current balance is"+this.amount);
	}
	public void withdraw(int amount) {
		if(this.amount<=0 || this.amount<amount) {
			System.out.println("insufficient balance");
		}
		else {
			this.amount-=amount;
			System.out.println("withdrawn made current balance is: "+this.amount);
		}
	}
	public static void main(String args[]) {
		BankAccount ba=new BankAccount(1000);
		ba.depositing(5000);
		ba.withdraw(2500);
		ba.withdraw(5000);
	}
}
