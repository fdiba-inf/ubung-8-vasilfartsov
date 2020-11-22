package exercise8;

public class Point {
    double x;
    double y;

    public Point() {
        this.x=0;
        this.y=0;
    }

    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public Point(Point otherPoint) {
        this.x= otherPoint.x;
        this.y= otherPoint.y;
    }

    public void initialize() {

        System.out.println("x: ");
        double x = Utils.INPUT.nextDouble();
        System.out.println("y: ");
        double y = Utils.INPUT.nextDouble();

        this.x=x;
        this.y=y;

    }

    public void translate(double xDelta, double yDelta) {
        this.x=this.x+xDelta;
        this.y=this.y+yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        double newX = x + xDelta;
        double newY = y + yDelta;
        return new Point(newX , newY);
    }

    public boolean equals(Point otherPoint) {
        boolean xEqual = x == otherPoint.x;
        boolean yEqual = y == otherPoint.y;
        return xEqual && yEqual;
    }

    public String toString() {

      return "(" + x + ", " + y + ")";
    }
}