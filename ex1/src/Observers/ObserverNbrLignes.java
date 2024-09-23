package Observers;

public class ObserverNbrLignes implements ObserverLigne {

  int nombreLignes = 0;

  public int getNombreLignes() {
    return nombreLignes;
  }

  public void setNombreLignes(int nombreLignes) {
    this.nombreLignes = nombreLignes;
  }

  @Override
  public void traiterLigne(String ligneLu) {
    nombreLignes++;
  }

  public void finFichier() {
    System.out.println("Il y avait " + nombreLignes + " lignes.");
  }
}
