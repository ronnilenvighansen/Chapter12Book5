import java.util.Scanner;

/**
 * Created by Ronni on 9/15/2016.
 */
public class Four
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        if (loan.getLoanAmount() < 0 || loan.getAnnualInterestRate() < 0 || loan.getNumberOfYears() < 0) {
            throw new IllegalArgumentException("All numbers must be 0 or more");
        } else {
            System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
                    loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
        }
    }
}