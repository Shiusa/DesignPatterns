public class Et implements Strategy{

  Strategy[] strategyList;

  public Et(Strategy... strategies) {
    this.strategyList = strategies;
  }

  @Override
  public boolean estValide(String mot) {
    for (Strategy strategy:strategyList) {
      if (!strategy.estValide(mot)) {
        return false;
      }
    }
    return true;
  }
}
