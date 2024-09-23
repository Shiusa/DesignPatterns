public class Or implements Strategy{

  Strategy strategy1;
  Strategy strategy2;

  public Or(Strategy strategy1, Strategy strategy2) {
    this.strategy1 = strategy1;
    this.strategy2 = strategy2;
  }

  @Override
  public boolean estValide(String mot) {
    return strategy1.estValide(mot) || strategy2.estValide(mot);
  }
}
