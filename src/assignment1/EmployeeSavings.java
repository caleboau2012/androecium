package assignment1;

import java.util.Random;

/**
 * Created by KayLee on 02/03/2018.
 */
public class EmployeeSavings extends AddressBook {
    private double accountValue;
    private double[] monthlyInterests;
    private double[] monthlySavings;
    public static final double ANNUAL_INTERST_RATE = 0.05;

    public double getAccountValue() {
        return accountValue;
    }

    public double[] getMonthlyInterests() {
        return monthlyInterests;
    }

    public double[] getMonthlySavings() {
        return monthlySavings;
    }

    public EmployeeSavings(String fn, String ln){
        super(fn, "", ln);
    }

    public EmployeeSavings(String fn, String ln, double[] d1, double[] d2){
        super(fn, "", ln);
        this.monthlyInterests = d1;
        this.monthlySavings = d2;
    }

    public double[] generateMonthlySavings(){
        Random rand = new Random();
        double[] mSavings = new double[monthlySavings.length];

        for(int i = 0; i < mSavings.length; i++){
            mSavings[i] = rand.nextInt(701) + 100;
        }

        return mSavings;
    }

    public double[] calculateInterests(){
        monthlySavings = generateMonthlySavings();
        double[] mInterests = new double[monthlyInterests.length];
        double[] mSavings = new double[monthlySavings.length];
        mSavings[0] = monthlySavings[0];

        double monthly_interest_rate = 1 + ANNUAL_INTERST_RATE / 12;

        for(int i = 1; i < monthlyInterests.length; i++){
            mSavings[i] = mSavings[i - 1] + monthlySavings[i];
        }

        for(int i = 0; i < monthlyInterests.length; i++){
            mInterests[i] = monthly_interest_rate * mSavings[i];
        }

        return mInterests;
    }

    public static String getReport(EmployeeSavings[] arr){
        StringBuilder s = new StringBuilder();

        for(EmployeeSavings e: arr){
            s.append(e.getFirstName() + " " + e.getLastName() + " has made: ");
            for(double m: e.getMonthlyInterests()){
                s.append(m + " ");
            }
            s.append("in interest this year \n");
        }

        return s.toString();
    }
}
