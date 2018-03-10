package assignment2.village;

/**
 * Created by KayLee on 06/03/2018.
 */
public class Village {
    private Citizen[] citizens;
    int pointer;
    private int numberofCitizens;

    public int getNumberofCitizens(){
        return this.numberofCitizens;
    }

    public void addCitizen(int qual){
        citizens[pointer++] = new Citizen(Citizen.generateId(), qual);
    }

    public void addCitizen(){
        citizens[pointer++] = new Citizen(Citizen.generateId(), Citizen.generateEducationQualification());
    }

    public Village(){
        this.citizens = new Citizen[100];
        this.numberofCitizens = 100;
        this.pointer = 0;

        for(int i = pointer; i < this.numberofCitizens; i++){
            addCitizen();
        }
    }
}
