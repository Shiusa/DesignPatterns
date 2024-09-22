import Observers.ObserverLigne;
import Observers.ObserverMot;
import java.util.ArrayList;
import java.util.List;

public class ObserverNotifier {

  private List<ObserverLigne> observerLignes = new ArrayList<>();
  private List<ObserverMot> observerMots = new ArrayList<>();

  public void addObserverLigne(ObserverLigne observerLigne) {
    observerLignes.add(observerLigne);
  }

  public void rmObserverLigne(ObserverLigne observerLigne) {
    observerLignes.remove(observerLigne);
  }

  public void notifyObserverLigne(String ligne) {
    for (ObserverLigne observerLigne:observerLignes) {
      observerLigne.traiterLigne(ligne);
    }
  }

  public void addObserverMot(ObserverMot observerMot) {
    observerMots.add(observerMot);
  }

  public void rmObserverMot(ObserverMot observerMot) {
    observerMots.remove(observerMot);
  }

  public void notifyObserverMot(String mot) {
    for (ObserverMot observerMot:observerMots) {
      observerMot.traiterMot(mot);
    }
  }

}
