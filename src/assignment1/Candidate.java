package assignment1;

import java.util.ArrayList;

/**
 * Created by KayLee on 01/03/2018.
 */
public class Candidate extends AddressBook{
    private boolean innovation;
    private double grade;
    private double regulation;
    private String communication;

    public boolean isInnovative() {
        return innovation;
    }

    public void setInnovation(boolean innovation) {
        this.innovation = innovation;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getRegulation() {
        return regulation;
    }

    public void setRegulation(double regulation) {
        this.regulation = regulation;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public Candidate(String fn, String ln, double grade, String comm, boolean innov, double reg){
        super(fn, "", ln);
        this.setGrade(grade);
        this.setCommunication(comm);
        this.setInnovation(innov);
        this.setRegulation(reg);
    }

    public String toString(){
        return this.getFirstName() + " " + this.getLastName();
    }

    public static ArrayList<Candidate> getEligibleCandidates(Candidate[] cands){
        ArrayList<Candidate> result = new ArrayList<>();

        for(int i = 0; i < cands.length; i++){
            if(cands[i].getGrade() >= 85){
                result.add(cands[i]);
            }
            else if((cands[i].getRegulation() >= 0.5) && (cands[i].getCommunication().equals("average") || cands[i].getCommunication().equals("average"))){
                result.add(cands[i]);
            }
            else if(cands[i].isInnovative()){
                result.add(cands[i]);
            }
        }

        for(Candidate r: result){
            // print the output to the console
        }

        return result;
    }

    public static void main(String[] args) {
        Candidate[] cands = new Candidate[15];
        cands[0] = new Candidate("Elena", "Brandon", 82.3, "poor", true, 0.5);
        cands[1] = new Candidate("Thomos", "Molson", 85.1, "poor", false, 1.0);
        cands[2] = new Candidate("Hamilton", "Winn", 77.77, "average", false, 0.8);
        cands[3] = new Candidate("Suzie", "Saradin", 69.93, "average", false, 0.0);
        cands[4] = new Candidate("Philip", "Winne", 93.03, "average", true, 1.0);
        cands[5] = new Candidate("Alex", "Tribok", 86.61, "poor", true, 0.7);
        cands[6] = new Candidate("Emma", "Pivoto", 55.99, "excellent", false, 0.8);
        cands[7] = new Candidate("John", "Lenthen", 87.49, "excellent", true, 0.9);
        cands[8] = new Candidate("James", "Lean", 88.00, "excellent", false, 0.5);
        cands[9] = new Candidate("Jane", "Ostin", 91.20, "average", true, 0.6);
        cands[10] = new Candidate("Emily", "Car", 66.79, "excellent", false, 0.3);
        cands[11] = new Candidate("Daniel", "Hamshire", 76.65, "average", true, 0.2);
        cands[12] = new Candidate("Neda", "Bazdar", 55.89, "excellent", true, 0.5);
        cands[13] = new Candidate("Aaron", "Smith", 90.01, "excellent", false, 0.3);
        cands[14] = new Candidate("Kate", "Hen", 87.9, "poor", false, 0.8);

        System.out.println(getEligibleCandidates(cands));
    }
}
