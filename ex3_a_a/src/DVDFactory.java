public class DVDFactory implements ProduitFactory {

  @Override
  public DVD creerProduit(String name, int anneeDeParution) {
    return new DVD(name,anneeDeParution);
  }
}
