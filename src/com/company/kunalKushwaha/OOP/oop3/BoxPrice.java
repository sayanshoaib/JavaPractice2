package com.company.kunalKushwaha.OOP.oop3;

public class BoxPrice extends BoxWeight {

    double cost;

    BoxPrice () {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double wight, double cost) {
        super(wight);
        this.cost = cost;
    }

    public BoxPrice(double l, double h, double w, double wight, double cost) {
        super(l, h, w, wight);
        this.cost = cost;
    }
}
