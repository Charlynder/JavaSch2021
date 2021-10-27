// Assigment 6.15 - Print a tax label
import java.lang.Math;

public class taxTabel {
    public static void main(String[] args) {
        System.out.printf("%-25s%-20s%-15s%-15s%-15s\n", ("Taxable Income"), ("Single"), ("Married Joint or Qualify Widow(er)"), ("Married Separate"), ("Head of House hold"));
        
        for (int incomeAmount = 50000; incomeAmount <= 60000; incomeAmount += 50){
            System.out.printf("$%-15d $%-15d $%-15d $%-15d $%-15d\n", incomeAmount, Math.round(computeTax(0, incomeAmount)), Math.round(computeTax(1, incomeAmount)), Math.round(computeTax(2, incomeAmount)), Math.round(computeTax(3, incomeAmount)));
        }

        
    }
 
    public static double computeTax(int status, double taxableIncome){
        double tax = 0;

        /**
         * Using the if statement, the filer will be categorized by status. Then, the computation will be run based on which tier the total taxable income falls in. 
         */
        if (status == 0) { // Compute tax for single filers
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            } else if (taxableIncome <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            } else if (taxableIncome <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            } else if (taxableIncome <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (taxableIncome - 171550) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        } else if (status == 1) {
            if (taxableIncome <= 16700.0) {
                tax = taxableIncome * 0.1;
            } else if (taxableIncome <= 67900.0) {
                tax = 1670.0 + (taxableIncome - 16700.0) * 0.15;
            } else if (taxableIncome <= 137050.0) {
                tax = 9350.0 + (taxableIncome - 67900.0) * 0.25;
            } else if (taxableIncome <= 208850.0) {
                tax = 26637.5 + (taxableIncome - 137050.0) * 0.28;
            } else if (taxableIncome <= 372950.0) {
                tax = 46741.5 + (taxableIncome - 208850.0) * 0.33;
            } else {
                tax = 90562.5 + (taxableIncome - 372950.0) * 0.35;
            }

        } else if (status == 2) {
            if (taxableIncome <= 8350.0) {
                tax = taxableIncome * 0.1;
            } else if (taxableIncome <= 33950.0) {
                tax = 835.0 + (taxableIncome - 8350.0) * 0.15;
            } else if (taxableIncome <= 68525.0) {
                tax = 4675.0 + (taxableIncome - 33950.0) * 0.25;
            } else if (taxableIncome <= 104425.0) {
                tax = 13318.75 + (taxableIncome - 68525.0) * 0.28;
            } else if (taxableIncome <= 186475.0) {
                tax = 23370.75 + (taxableIncome - 104425.0) * 0.33;
            } else {
                tax = 50447.25 + (taxableIncome - 186475.0) * 0.35;
            }

        } else if (status == 3) {
            if (taxableIncome <= 11950.0) {
                tax = taxableIncome * 0.1;
            } else if (taxableIncome <= 45500.0) {
                tax = 1195.0 + (taxableIncome - 11950.0) * 0.15;
            } else if (taxableIncome <= 117450.0) {
                tax = 6227.5 + (taxableIncome - 45500.0) * 0.25;
            } else if (taxableIncome <= 190200.0) {
                tax = 24215.0 + (taxableIncome - 117450.0) * 0.28;
            } else if (taxableIncome <= 372950.0) {
                tax = 44585.0 + (taxableIncome - 190200.0) * 0.33;
            } else {
                tax = 104892.5 + (taxableIncome - 372950.0) * 0.35;
            }

        } else {
            System.out.println("Invalid status...");
            System.exit(1);
        }
        return  tax /*(tax * 100) / 100.0*/;
    }
    
}
