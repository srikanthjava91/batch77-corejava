package com.oops.loanapp;

public class HomeLoan extends LoanImpl {
	
	void homeLoanDocInfo(){
		System.out.println("Home Loan DOc info received Successfully !!");
	}

	public static void main(String[] args) {

		HomeLoan hl = new HomeLoan();

		if (hl.getEmployeeSalary() >= 60000.00 && hl.getCibilScore() > 300 && hl.getCibilScore() <= 900) {

			if (hl.isAadharValid() && hl.isPanValid() && hl.isPhoneValid()) {
				System.out.println("Congrtulations !! Your Home Loan got approved !!");
				System.out.println("Home Loan ROI is : " + hl.getROI());
				hl.homeLoanDocInfo();
			} else {
				System.out.println("Something went wrong with your personal data, can you re-check once ");
			}

		} else {
			System.out.println("Your Loan got Rejected.. Please try again later.");
		}

	}

}
