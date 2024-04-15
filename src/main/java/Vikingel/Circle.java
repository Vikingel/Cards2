package Vikingel;

public class Circle {
    double r;
    Point center;

    public Circle(double r, Point center) {
        this.r = r;
        this.center = center;
    }

    public boolean intersectsWith(Circle other){
        double d = center.distanceTo(other.center);
        if(d <= r+other.r) {
            if (r - d > other.r || other.r - d > r )
                return false;
            else
                return true;
        }
        else
            return false;
    }
    public boolean eqCircle(Circle c){
        return (r==c.r);
    }

    public  boolean equals (Circle other){
        if (r == other.r)
            return true;
        else
            return false;
    }
}