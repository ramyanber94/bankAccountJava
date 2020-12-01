
public class bankAccount {
	String name;
	double amount = 1;
	private int openBankAccount;
	private double deposit = 1;
	private double withDraw = 1;
	private double checkBalance = 0;
	double accountAmount = 0 ;

	//Mutator method
	public void setOpenBankAccount(int newOpenBankAccount) {
		openBankAccount = newOpenBankAccount;
	}
	
	 public boolean setDeposit(double amount) {
		 	this.amount = amount;
	    	boolean sucess = false;
	    	if ((amount > 0)) {
	    		deposit= amount;
	    	 	sucess = true; 
	    	 	accountAmount += deposit;
	    	}
	    	return sucess;
	}
	
	 public boolean setWithDraw(double amount) {
		 this.amount = amount;
	    	boolean sucess = false;
	    	if ((amount > 0)) {
	    		withDraw= amount;
	    	 	sucess = true; 
	    	 	accountAmount -= withDraw;
	    	}
	    	return sucess;
	}
	
	public void setCheckBalance(double newCheckBalance) {
		checkBalance = newCheckBalance;
	}
	
	//Accessor method
	public int getOpenBankAccount() {
		openBankAccount += 1;
		return openBankAccount;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public double getWithDraw() {
		return withDraw;
	}
	
	public double getCheckBalance() {
		checkBalance = accountAmount;
		return checkBalance;
	}
	
	//constructor
	
	 public bankAccount() {
		    name = "xxxxx";
		 	openBankAccount = 5000;
	    	deposit = 1;
	    	withDraw = 15;
	    	checkBalance = 5000;
	 }

}
