public class DrawCarWithCircle extends DrawCar{

  @Override
  public Shape createShape(double size, Point point) {
    return new Circle(size,point);
  }
}
