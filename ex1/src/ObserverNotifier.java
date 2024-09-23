import Observers.ObserverLigne;
import Observers.ObserverMot;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

  public void readFile(String filePath) throws IOException {
    BufferedReader lecteurAvecBuffer = null;
    String ligne;
    try {
      String chemin = filePath;
      lecteurAvecBuffer = new BufferedReader(new FileReader(chemin));
      while ((ligne = lecteurAvecBuffer.readLine()) != null) {

        notifyObserverLigne(ligne);

        for (String mot:ligne.trim().split(" ")) {
          notifyObserverMot(mot);
        }

      }
      for (ObserverLigne observerLigne:observerLignes) {
        observerLigne.finFichier();
      }
      for (ObserverMot observerMot:observerMots) {
        observerMot.finFichier();
      }
    } catch (FileNotFoundException e) {
      System.out.println("Erreur d'ouverture" + e.getMessage());
    } finally {
      if (lecteurAvecBuffer != null) {
        lecteurAvecBuffer.close();
      }
    }
  }

}
