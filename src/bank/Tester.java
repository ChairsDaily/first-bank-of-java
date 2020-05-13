package bank;

public class Tester {
	
	/*
	 * Notice static meaning no instance of tester must occur
	 * to call main, in other words this class acts as a storage object
	 */
	public static void main (String[] args) {
		
		Bank firstBankofJava = new Bank();
		int[] accountNumbers = {711, 982, 301, 221};
		
		for (int i = 0; i < accountNumbers.length; i++) {
			double balance = 0;
			if (accountNumbers[i] > 300) balance = 15000;
			firstBankofJava.addAccount(new BankAccount(accountNumbers[i], balance));
		}
		System.out.println(firstBankofJava.average());
	}
}

