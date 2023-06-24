package TP7;

class Rectangle {
  int width;
  int heigth;

  public Rectangle(int width, int heigth) {
    this.heigth = heigth;
    this.width = width;
  }

  public int calculatePerimeter() {
    return (width + heigth) * 2;
  }

  public int calculateSurface() {
    return width * heigth;
  }
}

class RectangleTest {
  public static void main(String[] args) {
    // create an instance of class rectangle
    Rectangle rectangle = new Rectangle(10, 20);

    // display perimeter of the rectangle
    int perimeter = rectangle.calculatePerimeter();
    System.out.println("Perimeter : " + perimeter);

    // display surface of the rectangle
    int surface = rectangle.calculateSurface();
    System.out.println("Surface:" + surface);
  }
}