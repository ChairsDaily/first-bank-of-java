
package bank;

/*
 * A bank account has a an account number
 * and a balance that can be changed 
 */
public class BankAccount {
	
	/*
	 * Constructs a bank account with zero balance
	 * @param (number) an account number
	 */
	public BankAccount (int number) {
		
		accountNumber = number;
		balance = 0;
	}
	
	/*
	 * Constructs a bank account with zero balance
	 * @param (number) an account number
	 * @param (initialBalance) starting balance 
	 */
	public BankAccount (int number, double initialBalance) {
		
		accountNumber = number;
		balance = initialBalance; 
	}
	
	/*
	 * Gets the account number associated with this object
	 * @return the account number
	 */
	public int getAccountNumber () {
		return accountNumber;
	}
	
	/*
	 * Deposit funds into bank account
	 * @param double (amount) the amount to deposit
	 */
	public void deposit (double amount) {
		
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	/*
	 * Withdraw funds from the account
	 * @param double (amount) amount to withdraw
	 */
	public void withdraw (double amount) {
		
		double newBalance = balance - amount;
		balance = newBalance;
	}
	
	public double getBalance () {
		
		return balance;
	}
		
	// not accessible out of scope
	private int accountNumber;
	private double balance;

}
