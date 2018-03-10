package assignment2.village;

import java.util.Random;

/**
 * Created by KayLee on 06/03/2018.
 */
public class Citizen {
    int citizenId;
    int educationalQualification;

    private static final int DOCTORATE = 4;
    private static final int HIGH_SCHOOL = 1;
    private static final int POSTGRAGUATE = 3;
    private static final int UNDERGRADUATE = 2;

    private static int id = 0;

    public Citizen(int id, int qualif){
        this.citizenId = id;
        this.educationalQualification = qualif;
    }

    public static int generateEducationQualification(){
        Random rand = new Random();
        return rand.nextInt(4) + 1;
    }

    public static int generateId(){
        return id++;
    }

    public static void resetId(){
        id = 0;
    }
}
