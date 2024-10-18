public class Main {
    public static void main(String[] args) {
        HumanBMI humanBMI = new HumanBMI(80, 1.52);
        System.out.println(humanBMI.getResult());
    }
}

class HumanBMI {
    private double weight; // Weight in kilograms
    private double height; // Height in meters
    private double bodyMassIndex; // Body Mass Index

    public HumanBMI(double weight, double height) {
        setWeight(weight);
        setHeight(height);
        calculateBodyMassIndex();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        this.weight = weight;
        calculateBodyMassIndex();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
        calculateBodyMassIndex();
    }

    private void calculateBodyMassIndex() {
        this.bodyMassIndex = weight / (height * height);
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public String getResult() {
        if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            return "Normal Body Mass Index";
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            return "Warning: Overweight";
        } else if (bodyMassIndex >= 30) {
            return "Obesity: High Body Mass Index";
        } else {
            return "Underweight: Deficit of Body Mass";
        }
    }
}
