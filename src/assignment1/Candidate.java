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
        super.setFirstName(fn);
        super.setLastName(ln);
        this.setGrade(grade);
        this.setCommunication(comm);
        this.setInnovation(innov);
        this.setRegulation(reg);
    }

    public static ArrayList<Candidate> getEligibilityandidates(Candidate[] cands){
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
}
