package Observers;

public class ObserverNbrLignes implements Observer {

  int nombreLignes = 0;

  public int getNombreLignes() {
    return nombreLignes;
  }

  public void setNombreLignes(int nombreLignes) {
    this.nombreLignes = nombreLignes;
  }

  @Override
  public void traiterLigne() {
    setNombreLignes(nombreLignes++);
  }
}
