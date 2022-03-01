package com.company.kunalKushwaha.OOP.oop3;

public class BoxWeight extends Box {
    double wight;

    public BoxWeight(double wight) {
        super();
        this.wight = this.wight;
    }

    public BoxWeight(double l, double h, double w, double wight) {
        super(l, h, w);
        this.wight = wight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        wight = other.wight;
    }

    public BoxWeight() {

    }

    @Override
    public String toString() {
        return "BoxWeight{" +
                "l=" + l +
                ", h=" + h +
                ", w=" + w +
                ", wight=" + wight +
                '}';
    }
}
