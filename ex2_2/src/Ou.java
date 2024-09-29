public class Ou implements Strategy{

  Strategy[] strategyList;

  public Ou(Strategy... strategyList) {
    this.strategyList = strategyList;
  }

  @Override
  public boolean estValide(String mot) {
    for (Strategy strategy:strategyList) {
      if (strategy.estValide(mot)) {
        return true;
      }
    }
    return false;
  }
}
