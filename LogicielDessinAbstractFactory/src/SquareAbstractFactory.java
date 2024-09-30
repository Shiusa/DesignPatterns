public class SquareAbstractFactory implements AbstractFactory {

  @Override
  public Shape createShape(double size, Point point) {
    return new Square(size,point);
  }
}
