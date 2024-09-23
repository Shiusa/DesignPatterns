package Observers;

public class ObserverNbrPalindrome implements ObserverMot {

  int nombrePalindrome = 0;

  public int getNombrePalindrome() {
    return nombrePalindrome;
  }

  public void setNombrePalindrome(int nombrePalindrome) {
    this.nombrePalindrome = nombrePalindrome;
  }

  @Override
  public void traiterMot(String motLu) {
    StringBuffer tmp = new StringBuffer(motLu);
    if (motLu.equals(tmp.reverse().toString()) && motLu.length()>1) {
      nombrePalindrome++;
    }
  }

  public void finFichier() {
    System.out.println("Il y avait " + nombrePalindrome + " palindromes.");
  }
}
