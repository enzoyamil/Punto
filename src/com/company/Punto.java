package com.company;

public class Punto {
    int x;
    int y;
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double distacia(Punto otro){
        double dx=x-this.x;
        double dy=y-this.y;
        double suma=dx*dx +dy*dy;
        return Math.sqrt(suma);

    }
}
