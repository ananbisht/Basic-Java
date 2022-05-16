package loanprogram;

public class BusinessLoan extends Loan {
	private double interest_rate;
	

	public BusinessLoan (int num, String name, double amount, int years, double prime, double fee) {
		super(num, name, amount, years,fee);
		this.interest_rate=(prime*100)+3.2;
		
		
		
	}
	
	@Override
	public String toString() {
		return super.toString()+ "at "+ (int)interest_rate+ "% interest rate."+ "The amount owed is : $"+(double)loan_fee;
		
	}
}
