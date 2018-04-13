package assignment1;

/**
 * Created by KayLee on 02/03/2018.
 */
public class BonusOnSavings {
    public double computeBonus(double commitment, double q1, double q2, double q3, double q4){
        double[] quaterlyBonus = new double[4];

        quaterlyBonus[0] = computeQuaterlyBonus(commitment, q1);
        quaterlyBonus[1] = computeQuaterlyBonus(commitment, q2);
        quaterlyBonus[2] = computeQuaterlyBonus(commitment, q3);
        quaterlyBonus[3] = computeQuaterlyBonus(commitment, q4);

        double sum = 0;

        for(double b: quaterlyBonus){
            sum += b;
        }

        return sum + computeAnnualBonus(commitment, (q1 + q2 + q3 + q4));
    }

    public double computeAnnualBonus(double commitment, double A){
        if((1.25 * (commitment * 12)) <= A)
            return 0.05 * A;
        else if(A >= (commitment * 12))
            return 0.05 * (commitment * 12);
        else
            return 0;
    }

    public double computeQuaterlyBonus(double commitment, double Q){
        if(Q >= (commitment * 3))
            return 0.03 * (commitment * 3);
        else
            return 0;
    }

    public static void main(String[] args) {
        BonusOnSavings b = new BonusOnSavings();

        System.out.println(b.computeBonus(2000, 5000, 7000, 4000, 8000));
        System.out.println(b.computeBonus(3000, 6000, 9000, 10000, 17000));
    }
}
