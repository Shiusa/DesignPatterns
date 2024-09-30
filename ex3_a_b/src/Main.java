public class Main {

  public static void main(String[] args) {
    MagasinDeDVDAbstractFactory magasinDeDVDAbstractFactory = new MagasinDeDVDAbstractFactory();
    MagasinDeDVD magasinDeDVD = magasinDeDVDAbstractFactory.creerMagasin();
    magasinDeDVD.ajouterProduit("dvd1",2024);
    magasinDeDVD.ajouterProduit("dvd2",2024);
    DVD dvd1 = magasinDeDVD.retourneProduit("dvd1");


    MagasinDeLivreAbstractFactory magasinDeLivreAbstractFactory = new MagasinDeLivreAbstractFactory();
    MagasinDeLivre magasinDeLivre = magasinDeLivreAbstractFactory.creerMagasin();
    LivreProduitAbstractFactory livreProduitAbstractFactory = new LivreProduitAbstractFactory();
    /*Livre livre1 = livreProduitAbstractFactory.creerProduit("livre1",2022);
    Livre livre2 = livreProduitAbstractFactory.creerProduit("livre2",2022);*/
    magasinDeLivre.ajouterProduit("livre1",2022);
    magasinDeLivre.ajouterProduit("livre2",2022);
  }

}
