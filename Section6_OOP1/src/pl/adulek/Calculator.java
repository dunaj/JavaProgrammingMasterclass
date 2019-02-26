package pl.adulek;

class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
        if (width < 0.0)
            this.width = 0.0;
        if (length < 0.0)
            this.length = 0.0;
    }

    public double getArea(){
        return length * width;
    }

}

class Carpet {
    double cost;

    public Carpet(double cost) {
        this.cost = cost;
        if(cost < 0.0)
                this.cost = 0.0;
    }

    public double getCost() {
        return cost;
    }
}

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
