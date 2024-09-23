public class DeLongueur implements Strategy{

  int longueur;

  public int getLongueur() {
    return longueur;
  }

  public void setLongueur(int longueur) {
    this.longueur = longueur;
  }

  @Override
  public boolean estValide(String mot) {
    return mot.length() == longueur;
    /*try {
      int nombre = Integer.parseInt(mot);

    }catch (NumberFormatException e) {
      return false;
    }*/
  }
}
