package Constructor;
import Models.Circle;
import Models.Rectangle;
import Models.Square;
import Models.Triangle;

public class Constructor {

  public static Square createSquare(double side) throws Exception {
      if (side <= 0) {
          throw new Exception("Не получилось создать квадрат. Длина стороны не может быть отрицательной");
      }
      return new Square(side,side);
  }

  public static Rectangle createRectangle(double width, double height) throws Exception {
      if (width <= 0 || height <= 0) {
          throw new Exception("Не получилось создать прямогульник. Один из размеров был отрицательны.");
      }
      return new Rectangle(width, height);
  }

  public static Circle createCircle(double radius) throws Exception {
      if (radius <= 0) {
          throw new Exception("Не получилось создать круг. Радиус должен быть положительным.");
      }
      return new Circle(radius);
  }

  public static Triangle createTriangle(double a, double b, double c)
          throws Exception {
      if (a <= 0 || b <= 0 || c <= 0) {
          throw new Exception("Не получилось создать треугольник, одна из сторон отрицательная");
      }

      if (a + b < c
              || b + c < a
              || a + c < b) {
          throw new Exception("Не получилось создать треугольник, одна из сторон больше суммы двух других");
      }
      return new Triangle(a, b, c);
  }
}