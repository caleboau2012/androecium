package assignment1;

import java.util.Scanner;

/**
 * Created by KayLee on 04/03/2018.
 */
public class TaxReturn {
    /**
     * Constructs a TaxReturn object for a given income and
     * marital status, and computes the tax.
     *
     * @param anIncome the taxpayer income
     * @param aStatus  either SINGLE or MARRIED
     */
    public TaxReturn(double anIncome, int aStatus) {
        income = anIncome;
        status = aStatus;
    }

    public TaxReturn(double anIncome, int aStatus, int children) {
        income = anIncome;
        status = aStatus;
        this.children = children;
    }

    public double getTax() {
        double tax = 0;
        if ((status == SINGLE) || (status == SINGLE_PARENT)) {
            if (income <= SINGLE_BRACKET1)
                tax = RATE1 * income;
            else if (income <= SINGLE_BRACKET2)
                tax = RATE1 * SINGLE_BRACKET1
                        + RATE2 * (income - SINGLE_BRACKET1);
            else
                tax = RATE1 * SINGLE_BRACKET1
                        + RATE2 * (SINGLE_BRACKET2 - SINGLE_BRACKET1)
                        + RATE3 * (income - SINGLE_BRACKET2);

            if(income > SINGLE_BRACKET3){
                tax += SINGLE_EXTRA_RATE * (income - SINGLE_BRACKET3_CAP);
            }
        }
        else if(status == MARRIED) {
            if (income <= MARRIED_BRACKET1)
                tax = RATE1 * income;
            else if (income <= MARRIED_BRACKET2)
                tax = RATE1 * MARRIED_BRACKET1
                        + RATE2 * (income - MARRIED_BRACKET1);
            else
                tax = RATE1 * MARRIED_BRACKET1
                        + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1)
                        + RATE3 * (income - MARRIED_BRACKET2);

            if(income > MARRIED_BRACKET3){
                tax += MARRIED_EXTRA_RATE * (income - MARRIED_BRACKET3_CAP);
            }
        }
        else{
            tax = UNKNOWN_RATE * income;
        }

        if(status == SINGLE_PARENT)
            tax -= (children * 5000);

        return tax;
    }

    public static final int SINGLE = 1;
    public static final int MARRIED = 2;
    public static final int SINGLE_PARENT = 3;
    private static final double RATE1 = 0.15;
    private static final double RATE2 = 0.28;
    private static final double RATE3 = 0.31;
    private static final double SINGLE_EXTRA_RATE = 0.25;
    private static final double MARRIED_EXTRA_RATE = 0.35;
    private static final double UNKNOWN_RATE = 0.33;
    private static final double SINGLE_BRACKET1 = 21450;
    private static final double SINGLE_BRACKET2 = 51900;
    private static final double SINGLE_BRACKET3 = 249999;
    private static final double SINGLE_BRACKET3_CAP = 150000;
    private static final double MARRIED_BRACKET1 = 35800;
    private static final double MARRIED_BRACKET2 = 86500;
    private static final double MARRIED_BRACKET3 = 349999;
    private static final double MARRIED_BRACKET3_CAP = 200000;
    private double income;
    private int status;
    private int children = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();
        System.out.print("Enter S (single) or M (married): ");
        String input = in.next();
        int status = 0;
        int children = 0;
        if (input.equalsIgnoreCase("S"))
            status = TaxReturn.SINGLE;
        else if (input.equalsIgnoreCase("M"))
            status = TaxReturn.MARRIED;
        else if (input.equalsIgnoreCase("SP")) {
            status = TaxReturn.SINGLE_PARENT;
            children = in.nextInt();
        }
        else{
            System.out.println("Bad input.");
            return;
        }
        TaxReturn aTaxReturn = new TaxReturn(income, status, children);
        System.out.println("The tax is " + aTaxReturn.getTax());
    }
}
