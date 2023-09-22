class Triangle extends GeometricObject {
  private double side1;
  private double side2;
  private double side3;

  public Triangle() {
    this.side1 = 1;
    this.side2 = 1;
    this.side3 = 1;
  }

  public Triangle(double s1, double s2, double s3) {
    this.side1 = s1;
    this.side2 = s2;
    this.side3 = s3;
  }

  public double getPerimeter() {
    return this.side1+this.side2+this.side3;
  }
  public double getArea() {
    double semiPerim = (this.side1+this.side2+this.side3)/2;
    return (semiPerim*(semiPerim-this.side1)*(semiPerim-this.side2)*(semiPerim-this.side3));
  }

  public double getSide1() {
    return this.side1;
  }
  public double getSide2() {
    return this.side2;
  }
  public double getSide3() {
    return this.side3;
  }
  public void setSide1(double s1) {
    this.side1 = s1;
  }
  public void setSide2(double s2) {
    this.side1 = s2;
  }
  public void setSide3(double s3) {
    this.side1 = s3;
  }
  // add other methods of triangle ++ getPerimeter/getArea from abstract
}