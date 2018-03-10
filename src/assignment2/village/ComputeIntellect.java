package assignment2.village;

/**
 * Created by KayLee on 06/03/2018.
 */
public class ComputeIntellect {
    private int doctorate;
    private int highSchool;
    private int postGraduate;
    private int underGraduate;

    private static final int DOCTORATE = 4;
    private static final int HIGH_SCHOOL = 1;
    private static final int POSTGRAGUATE = 3;
    private static final int UNDERGRADUATE = 2;

    public void distributionOfQualifiation(Citizen[] citizens){
        for(int i = 0; i < citizens.length; i++){
            switch (citizens[i].educationalQualification){
                case DOCTORATE:
                    doctorate++;
                    break;
                case HIGH_SCHOOL:
                    highSchool++;
                    break;
                case POSTGRAGUATE:
                    postGraduate++;
                    break;
                case UNDERGRADUATE:
                    underGraduate++;
                    break;
            }
        }
    }
}
