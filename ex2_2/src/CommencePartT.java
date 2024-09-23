
public class CommencePartT implements Strategy{


  @Override
  public boolean estValide(String mot) {
    return mot.charAt(0) == 't';
  }
}
