package assignment1;

/**
 * Created by KayLee on 18/02/2018.
 */
public class BanfMarathonRunner extends AddressBook {
    private int time;
    private int years;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public BanfMarathonRunner(String fn, String ln, int min, int yr){
        super(fn, "", ln);
        this.setTime(min);
        this.setYears(yr);
    }

    public static BanfMarathonRunner getFastestRunner(BanfMarathonRunner[] runners){
        BanfMarathonRunner runner = runners[0];

        for(int i = 1; i < runners.length; i++){
            if(runners[i].getTime() < runner.getTime())
                runner = runners[i];
        }

        System.out.println(runner.getFirstName() + " " + runner.getMiddleName() + " " + runner.getLastName());
        System.out.println(runner.getHomeAddress());
        System.out.println(runner.getTime());

        return runner;
    }

    public static BanfMarathonRunner getSecondFastestRunner(BanfMarathonRunner[] runners){
        BanfMarathonRunner fastest = getFastestRunner(runners);
        BanfMarathonRunner second = runners[0];

        if(second == fastest)
            second = runners[1];

        for(int i = 0; i < runners.length; i++){
            if((runners[i].getTime() < second.getTime()) && (runners[i].getTime() != fastest.getTime()))
                second = runners[i];
        }

        System.out.println(second.getFirstName() + " " + second.getMiddleName() + " " + second.getLastName());
        System.out.println(second.getHomeAddress());
        System.out.println(second.getTime());
        System.out.println(second.getTime() - fastest.getTime());

        return second;
    }

    public static double getAverageTime(BanfMarathonRunner runners[]){
        double sum = 0;

        for(BanfMarathonRunner r: runners){
            sum += r.getTime();
        }

        return sum / runners.length;
    }

    public static String getAboveAverageRunners(BanfMarathonRunner runners[]){
        double average = getAverageTime(runners);

        for(int i = 0; i < runners.length; i++){
            if(runners[i].getTime() <= average){
                System.out.println(runners[i].getFirstName() + " " + runners[i].getMiddleName() + " " + runners[i].getLastName());
                System.out.println(runners[i].getYears());
            }
        }

        return "Done";
    }

    public static void main(String[] args) {
        BanfMarathonRunner[] runners = {
                new BanfMarathonRunner("Elena", "Brandon", 341, 1),
                new BanfMarathonRunner("Thomas", "Molson", 273, 2),
                new BanfMarathonRunner("Hamilton", "Win", 278, 5),
                new BanfMarathonRunner("Suzie", "Sarandin", 329, 7),
                new BanfMarathonRunner("Philip", "Winne", 445, 9),
                new BanfMarathonRunner("Alex", "Trebok", 275, 3),
                new BanfMarathonRunner("Emma", "Pivoto", 275, 4),
                new BanfMarathonRunner("John", "Lenthen", 243, 1),
                new BanfMarathonRunner("James", "Lean", 334, 1),
                new BanfMarathonRunner("Jane", "Ostin", 412, 1),
                new BanfMarathonRunner("Emily", "Car", 393, 4),
                new BanfMarathonRunner("Daniel", "Hamshire", 299, 4),
                new BanfMarathonRunner("Neda", "Bazdar", 343, 3),
                new BanfMarathonRunner("Aaron", "Smith", 317, 6),
                new BanfMarathonRunner("Kate", "Hen", 265, 8)
        };

//        BanfMarathonRunner.getFastestRunner(runners);
        BanfMarathonRunner.getSecondFastestRunner(runners);
        System.out.println(BanfMarathonRunner.getAverageTime(runners));
        BanfMarathonRunner.getAboveAverageRunners(runners);
    }

}
