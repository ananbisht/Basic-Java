

package loanprogram;

import java.util.*;


public class CreateLoans implements LoanConstants {
		   public static void main(String[] args) {
		       double PrimeInterestRate;
		    
		   
		   Scanner scan = new Scanner(System.in);
	       int choice,accNo,term;
	       String name;
	       double Loan_Amount;
	      
	       
	       
	       
	       
	       System.out.println("Welcome to the "+LoanConstants.company);
	       System.out.println("Enter the current prime interest rate as a decimal, for eg., .05" );
	       
	       PrimeInterestRate=scan.nextDouble();
	       Loan loans[]=new Loan[5];
	       
	       double sum = 0;
	       double sum2 = 0;
	       double loan_fee;
	       
	       for (int i=0; i<loans.length; i++) {
	    	   System.out.println("Is this a 1) Business loan or 2) Personal loan");
	           choice=scan.nextInt();
	           
	           if (choice==1) {
	        	   System.out.println("Enter account number:- ");
	               accNo=scan.nextInt();
	               System.out.println("Enter name:-");
	               name=scan.next();
	               
	               
	               while (true) {
	            	   System.out.println("Enter loan amount:- ");
	                   Loan_Amount=scan.nextDouble();
	                   
	                   if(Loan_Amount>LoanConstants.loanmax)
	                   {
	                       System.out.println("Invalid. Value must be <="+LoanConstants.loanmax);
	                   }
	                   else
	                       break;
	            	   
	               }
	               
	         while (true) {
	        	 System.out.println("Enter term:- ");
	             term=scan.nextInt();
	             if(term!=LoanConstants.short_term && term!=LoanConstants.medium_term && term!=LoanConstants.long_term){
	                   System.out.println("Invalid Input. It must be either 3 , 7 or 15 ");
	               }
	             else{
	                   break;
	               }
	         }
	         loan_fee=((Loan_Amount*term*PrimeInterestRate)/100)+Loan_Amount;
	         BusinessLoan bl= new BusinessLoan(accNo, name, Loan_Amount, term, PrimeInterestRate, loan_fee);
             loans[i]=bl;
             sum += Loan_Amount;
             
	               
	           }
	           
	           
	           else if (choice==2) {
	        	   
	        	   System.out.println("Enter account number:- ");
	               accNo=scan.nextInt();
	               System.out.println("Enter name:- ");
	               name=scan.next();
	               System.out.println("Enter loan amount:-");
	               Loan_Amount=scan.nextDouble();
	               System.out.println("Enter term:- ");
	               term=scan.nextInt();
	               
	               loan_fee=((Loan_Amount*term*PrimeInterestRate)/100)+Loan_Amount;
	               
	               PersonalLoan pl=new PersonalLoan(accNo, name,Loan_Amount,term, PrimeInterestRate, loan_fee);
	               loans[i]=pl;
	               sum2 += Loan_Amount;
	               
	           }
	        
	        
	       }
	       scan.close();
	       
	       System.out.println("\n \n");
	       System.out.println(LoanConstants.company);
	       
	       for(int i=0; i<loans.length; i++){
	           System.out.println(loans[i]);
	           
	       
}
	       System.out.println("Total loaned out in Personal Loans is " +sum);
	       System.out.println("Total loaned out in Business Loans is " +sum2);

	       
}
}




	           
	       
	       
	

