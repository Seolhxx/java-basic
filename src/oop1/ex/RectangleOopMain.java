package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
      Rectangle rectangle = new Rectangle();

      rectangle.calculateArea(rectangle.width, rectangle.height);
      rectangle.calculatePerimeter(rectangle.width, rectangle.height);
      rectangle.isSquare(rectangle.width, rectangle.height);

    }

}
