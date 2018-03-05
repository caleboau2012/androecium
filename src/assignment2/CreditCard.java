package assignment2;

/**
 * Created by KayLee on 05/03/2018.
 */
public class CreditCard {
    private int evenSum;
    private int oddSum;
    private int sum;
    private String ccNumber;
    private String company;

    public boolean isDivisibleBy10(){
//        System.out.println("Divisible by 10: " + (sum % 10 == 0));
        return (sum % 10 == 0);
    }

    public boolean isValid(){
        return (validateCompany() && validateLength() && validateNumber() && validateSums() && isDivisibleBy10());
    }

    public boolean validateCompany(){
        String prefix = this.ccNumber.substring(0, 2);
        boolean valid = false;

//        System.out.println(prefix);

        if(prefix.matches("4\\d|5\\d|37|6\\d"))
            valid = true;

//        System.out.println("Valid: " + valid);

        return valid;
    }

    public boolean validateLength(){
        // this regex will do both validating number and length
        // return this.ccNumber.matches("^[0-9]{13,16}$");
        // but let's not use regex for simplicity

//        System.out.println("Valid length: " + !((this.ccNumber.length() < 13) || (this.ccNumber.length() > 16)));

        if((this.ccNumber.length() < 13) || (this.ccNumber.length() > 16))
            return false;
        else
            return true;
    }

    public boolean validateNumber(){
        // one or more digits using regular expressions
//        System.out.println("All numbers: " + this.ccNumber.matches("^\\d+$"));
        return this.ccNumber.matches("^\\d+$");
    }

    public boolean validateSums(){
        evenSum = 0;
        oddSum = 0;
        int number;
        boolean toggle = true;

        for(int i = ccNumber.length() - 1; i >= 0; i--){
            number = Integer.parseInt(Character.toString(ccNumber.charAt(i)));
            char[] digits;

            if(toggle){
                oddSum += number;
                toggle = !toggle;
            }
            else{
                number *= 2;
                if(number / 10 > 0){
                    digits = Integer.toString(number).toCharArray();
                    number = Integer.parseInt(Character.toString(digits[0])) + Integer.parseInt(Character.toString(digits[1]));
                }
                evenSum += number;
                toggle = !toggle;
//                System.out.print(number + " ");
            }
        }

//        System.out.println();
//        System.out.println("Odd Sum: " + oddSum + ", Even Sum: " + evenSum);

        sum = evenSum + oddSum;

        return true;
    }

    public CreditCard(String num){
        this.ccNumber = num;
    }

    public int getEvenSum(){
        return evenSum;
    }

    public int getOddSum() {
        return oddSum;
    }

    public int getSum() {
        return sum;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public String getCompany() {
        return company;
    }

    public static void main(String[] args) {
        CreditCard no = new CreditCard("4388576018402626");

        System.out.println(no.isValid());
    }
}
