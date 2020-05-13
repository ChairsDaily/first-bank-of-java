
package bank;
import java.util.ArrayList;

/*
 * Will store multiple bank accounts 
 */
public class Bank {
	
	/*
	 * Constructs a brand new bank
	 */
	public Bank () {
		
		accounts = new ArrayList<BankAccount>();
	}
	
	/*
	 * Adds an account
	 * @param BankAccount (a) the account to add
	 */
	public void addAccount (BankAccount a) {
		
		accounts.add(a);
	}
	
	/*
	 * Gets the sum of all balances
	 * @return sum of all balances
	 */
	public double getTotalBalance () {
		
		double total = 0;
		for (BankAccount a : accounts) {
			total = total + a.getBalance();
		}
		return total;
	}
	
	/*
	 * Counts the accounts whos balance is at least
	 * @param double (atLeast) minimum value for an account to be counted
	 * @return the number of accounts who satisfy 
	 */
	public int count (double atLeast) {
		
		int matches = 0;
		for (BankAccount a : accounts) {
			
			if (a.getBalance() >= atLeast) matches++;
		}
		return matches;
	}
	
	/*
	 * Finds the given account
	 * @param int (accountNumber) ID of account
	 * @return BankAccount (a) account object
	 */
	public BankAccount find (int accountNumber) {
		
		for (BankAccount a : accounts) {
			
			if (a.getAccountNumber() == accountNumber) 
				return a;
		}
		return null; // implies no match
	}
	
	/*
	 * Gets the bank account with the largest balance
	 * @return BankAccount (a) fat stacks dawg
	 */
	public BankAccount getMaximum() {
		
		if (accounts.size() == 0) 
			return null;
		BankAccount b = accounts.get(0);
		
		for (int i = 0; i < accounts.size(); i++) {
			
			BankAccount a = accounts.get(i);
			if (a.getBalance() > b.getBalance())
				b = a;
		}
		return b;
	}
	
	private ArrayList<BankAccount> accounts;
}



