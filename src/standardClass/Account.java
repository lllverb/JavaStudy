package standardClass;

public class Account {
	String accountNumber;
	int balance;
	Account(String accountNumber, int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String toString() {
		String s = "¥" + balance + "(口座番号=" + accountNumber + ")";
		return s;
	}
	public boolean equals(Object o) {
		if (this == o) {return true;}
		if (o instanceof Account){
			Account a = (Account) o;
			if (this.accountNumber.trim().equals(a.accountNumber.trim())) {
				return true;
			}
		}
		return false;
	}
}
