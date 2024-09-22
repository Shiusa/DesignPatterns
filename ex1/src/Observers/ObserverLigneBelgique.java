package Observers;

public class ObserverLigneBelgique implements ObserverLigne {

  int nombreLigneBelgique = 0;

  public int getNombreLigneBelgique() {
    return nombreLigneBelgique;
  }

  public void setNombreLigneBelgique(int nombreLigneBelgique) {
    this.nombreLigneBelgique = nombreLigneBelgique;
  }

  @Override
  public void traiterLigne(String ligneLu) {
    if (ligneLu.contains("Belgique")) {
      nombreLigneBelgique++;
    }
  }
}
