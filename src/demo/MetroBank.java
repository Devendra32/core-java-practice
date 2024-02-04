package demo;

import java.util.Scanner;

public class MetroBank {
    final String CAR = "car";
    final String HOUSE = "house";
    final String BUSINESS = "business";
    private int accountNumber;
    private double accountBalance;
    private double salary;
    private String loanType;
    private double loanAmount;
    private int expectedNoOfEMIs;


    public void inputCustomerDetails() {
        Scanner sc = new Scanner(System.in);
        this.accountNumber = sc.nextInt();
        this.accountBalance = sc.nextDouble();
        this.salary = sc.nextDouble();
        this.loanType = sc.next();
        this.loanAmount = sc.nextDouble();
        this.expectedNoOfEMIs = sc.nextInt();
    }

    public static void main(String[] args) {
        MetroBank metroBank = new MetroBank();
        metroBank.inputCustomerDetails();
        if (!metroBank.accountValidation()) {
            System.out.println("Not eligible for loan.");
        } else {
            if (metroBank.loanType.equalsIgnoreCase(metroBank.CAR)) {
                metroBank.carLoan();
            } else if (metroBank.loanType.equalsIgnoreCase(metroBank.HOUSE)) {
                metroBank.houseLoan();
            } else if (metroBank.loanType.equalsIgnoreCase(metroBank.BUSINESS)) {
                metroBank.businessLoan();
            } else {
                System.out.println("Sorry! Metro Bank doesn't provide " + metroBank.loanType + " type loan.");
            }
        }
    }

    private void carLoan() {
        int eligibleLoanAmount = 500000;
        int eligibleEMIs = 36;
        if(this.salary>25000 && this.loanAmount <= loanAmount && this.expectedNoOfEMIs <= eligibleEMIs ){
            System.out.println("eligibleLoanAmount="+eligibleLoanAmount);
            System.out.println("eligibleEmis="+eligibleEMIs);
        }
    }

    private void houseLoan() {
        int eligibleLoanAmount = 6000000;
        int eligibleEMIs = 60;
        if(this.salary>50000 && this.loanAmount <= loanAmount && this.expectedNoOfEMIs <= eligibleEMIs ){
            System.out.println("eligibleLoanAmount="+eligibleLoanAmount);
            System.out.println("eligibleEmis="+eligibleEMIs);
        }

    }

    private void businessLoan() {
        int eligibleLoanAmount = 7500000;
        int eligibleEMIs = 84;
        if(this.salary>75000 && this.loanAmount <= loanAmount && this.expectedNoOfEMIs <= eligibleEMIs ){
            System.out.println("eligibleLoanAmount="+eligibleLoanAmount);
            System.out.println("eligibleEmis="+eligibleEMIs);
        }
    }
    private boolean accountValidation() {
        if (this.accountBalance > 1000 && (this.accountNumber >= 1000 && this.accountNumber <= 9999)) {
            return true;
        } else {
            return false;
        }
    }

}
