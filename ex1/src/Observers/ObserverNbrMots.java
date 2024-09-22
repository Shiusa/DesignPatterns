package Observers;

public class ObserverNbrMots implements ObserverMot {

  int nombreMots = 0;

  public int getNombreMots() {
    return nombreMots;
  }

  public void setNombreMots(int nombreMots) {
    this.nombreMots = nombreMots;
  }

  @Override
  public void traiterMot(String motLu) {
    nombreMots++;
  }
}
