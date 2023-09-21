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

  // add other methods of triangle ++ getPerimeter/getArea from abstract
}