import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    ListerMot listerMot = new ListerMot("test.txt");

    CommencePartT commencePartT = new CommencePartT();
    DeLongueur deLongueur = new DeLongueur(1);
    //deLongueur.setLongueur(3);
    Palindrome palindrome = new Palindrome();

    listerMot.imprimerSi(new Not(deLongueur,commencePartT));

  }

}
