/* 
 * CS210 Chapter8 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.5.29 - Spring quarter
 *
 * This program is to add transfer method in BankAccount class.
 */
public class BankAccount {
	String name;
	double balance;

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void transfer(BankAccount otherBankAccount, double amount) {
		if (balance <= 5 || amount <= 0) { // if balance is smaller than $5 or transfer amount is smaller than $0
			return;
		}

		balance -= 5; // minus $5 transfer fee
		if (amount > balance) { // balance left is smaller than transfer amount.
			otherBankAccount.deposit(balance); // deposit all balance to the other.
			withdraw(balance); // withdraw all amount from itself.
		} else {
			otherBankAccount.deposit(amount); // deposit amount to the other account
			withdraw(amount); // withdraw amount from itself
		}
	}
}
