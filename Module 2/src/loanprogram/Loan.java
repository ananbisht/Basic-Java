package loanprogram;

import java.text.DecimalFormat;

public abstract class Loan implements LoanConstants{
	protected int loan_num;
	protected String last_name;
	protected double amount;
	protected double rate;
	protected int term;
	protected double loan_fee;
	


public Loan ( int num, String name, double amount, int years, double fee){
	this.loan_num=num;
	this.last_name=name;
	this.amount=amount;
	this.term=years;
	this.loan_fee=fee;
	
}


public String toString() {
	DecimalFormat df = new DecimalFormat(".0");
	String str = "Loan Number "+ loan_num + " for Name: "+ last_name +" of the amount $"+ df.format(amount) + " for "+ term+ " years ";
	return str;
}

public boolean equals(Loan loan) {
	if (this.loan_num==loan.loan_num  &&  last_name.equals(loan.last_name) &&  amount==loan.amount && term==loan.term)
		return true;
	
	else 
		return false;
	
}
	
	
	
	
	
}
