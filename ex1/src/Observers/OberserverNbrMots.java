package Observers;

public class OberserverNbrMots implements Observer {

  int nombreMots = 0;

  public int getNombreMots() {
    return nombreMots;
  }

  public void setNombreMots(int nombreMots) {
    this.nombreMots = nombreMots;
  }

  @Override
  public void traiterLigne() {

  }
}
