package assignment2;

/**
 * Created by KayLee on 07/03/2018.
 */
public class Person {
    private double bmi;
    private double height;
    private double weight;
    private String category;
    private String name;

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public String getCategory(double bmi) {
        if(bmi < 18.5)
            category = "Underweight";
        else if(bmi <= 25)
            category = "Normal weight";
        else if(bmi <= 30)
            category = "Overweight";
        else
            category = "Obese";

        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;

        this.bmi = (this.weight * 703) / (Math.pow(this.height, 2));
    }
}
