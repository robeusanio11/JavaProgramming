public class Circle extends GeometricObject { //implements Comparable<Circle> 
    private double radius;

    public Circle() {
        this.radius = 1;
    }
    public Circle(double r) {
        this.radius = r;
    }
    public Circle(double r, String color, boolean isFilled) {
        this.radius = r;
        this.setFilled(isFilled);
        this.setColor(color);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getDiameter() {
        return 2 * radius;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
    " and the radius is " + radius);
    }

    // @Override
    // public int compareTo(Circle circle) {
    //     if (this.getRadius() > circle.getRadius()) {
    //         return 1;
    //     } else if (this.getRadius() == circle.getRadius()) {
    //         return 0;
    //     } else {
    //         return 1;
    //     }
    // }

    // public boolean equals(Circle circle) {
    //     if (this.compareTo(circle) == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
        public boolean equals(Circle circle) {
        if (this.getRadius() == circle.getRadius()) {
            return true;
        } else {
            return false;
        }
    }
}

