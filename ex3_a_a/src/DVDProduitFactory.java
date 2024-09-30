public class DVDProduitFactory implements ProduitFactory {

  @Override
  public DVD creerProduit(String name, int anneeDeParution) {
    return new DVD(name,anneeDeParution);
  }
}
