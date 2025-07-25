package test2.bankaccount;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setBalance(100);
		System.out.println(bankAccount.getBalance());
	}

}
