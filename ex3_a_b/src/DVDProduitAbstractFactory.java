public class DVDProduitAbstractFactory implements ProduitAbstractFactory {

  @Override
  public DVD creerProduit(String name, int anneeDeParution) {
    return new DVD(name, anneeDeParution);
  }
}
