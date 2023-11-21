package ch.bbw.st;

public class MyCalculator {
    private double weight;
    private double height;

    public double getValue() {
        // BMI = Körpergewicht : (Körpergrösse in m)
        if(height == 0){
            return 0;
        } else
        return weight / Math.pow(height / 100.0, 2);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
