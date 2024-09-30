public class Main {

  public static void main(String[] args) {
    MagasinDeDVD magasinDeDVD = new MagasinDeDVD();
    magasinDeDVD.ajouterProduit("dvd1",2024);
    magasinDeDVD.ajouterProduit("dvd2",2024);

    MagasinDeLivre magasinDeLivre = new MagasinDeLivre();
    magasinDeLivre.ajouterProduit("livre1",2022);
    magasinDeLivre.ajouterProduit("livre2",2022);

    Livre livre1 = magasinDeLivre.retourneProduit("livre1");
  }

}
