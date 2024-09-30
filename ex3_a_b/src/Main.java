public class Main {

  public static void main(String[] args) {
    /*MagasinDeDVDAbstractFactory magasinDeDVDAbstractFactory = new MagasinDeDVDAbstractFactory();
    MagasinDeDVD magasinDeDVD = magasinDeDVDAbstractFactory.creerMagasin();
    magasinDeDVD.ajouterProduit("dvd1",2024);
    magasinDeDVD.ajouterProduit("dvd2",2024);
    DVD dvd1 = magasinDeDVD.retourneProduit("dvd1");*/
    //magasin commun mais bizarre parce qu'il possede des DVD et Livre
    MagasinDeProduitAbstractFactory magasinDvd = new MagasinDeProduitAbstractFactory(new DVDProduitAbstractFactory());
    magasinDvd.ajouterProduit("dvd1", 2024);
    magasinDvd.ajouterProduit("dvd2", 2024);
    DVD dvd1 = (DVD)magasinDvd.retourneProduit("dvd1");


    /*MagasinDeLivreAbstractFactory magasinDeLivreAbstractFactory = new MagasinDeLivreAbstractFactory();
    MagasinDeLivre magasinDeLivre = magasinDeLivreAbstractFactory.creerMagasin();
    LivreProduitAbstractFactory livreProduitAbstractFactory = new LivreProduitAbstractFactory();*/
    /*Livre livre1 = livreProduitAbstractFactory.creerProduit("livre1",2022);
    Livre livre2 = livreProduitAbstractFactory.creerProduit("livre2",2022);*/
    /*magasinDeLivre.ajouterProduit("livre1",2022);
    magasinDeLivre.ajouterProduit("livre2",2022);*/
    MagasinDeProduitAbstractFactory magasinLivre = new MagasinDeProduitAbstractFactory(new LivreProduitAbstractFactory());
    magasinLivre.ajouterProduit("livre1", 2022);
    magasinLivre.ajouterProduit("livre2", 2022);
  }

}
