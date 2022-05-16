package loanprogram;



public class PersonalLoan extends Loan {
	   private double interest_rate;
	   
	   
	   public PersonalLoan(int num, String name, double amount, int years, double prime, double fee) {
		   super(num, name, amount, years, fee);
	       this.interest_rate=(prime*100)+(2.7);
	       
	       
	   }
	   
	   @Override
	   public String toString() {
		   return super.toString() + " at " + (int)interest_rate + "% interest rate"+ "The amount owed is : $"+(double)loan_fee;
	   }

}
