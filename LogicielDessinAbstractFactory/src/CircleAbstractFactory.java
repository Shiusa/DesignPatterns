public class CircleAbstractFactory implements AbstractFactory {

  @Override
  public Shape createShape(double size, Point point) {
    return new Circle(size,point);
  }
}
