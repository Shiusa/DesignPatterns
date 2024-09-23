import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ListerMot {

  private String fichier;

  public ListerMot(String fichier) {
    this.fichier = fichier;
  }

  public void imprimerSi(Strategy strategy) throws IOException {
    BufferedReader input = new BufferedReader(new FileReader(this.fichier));
    String buffer = null;
    while ((buffer = input.readLine()) != null) {
      StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
      while (mots.hasMoreTokens()) {
        String mot = mots.nextToken();
        if (strategy.estValide(mot)) {
          System.out.println(mot);
        }
      }
    }
  }

}
