public class LivreProduitAbstractFactory implements ProduitAbstractFactory {

  @Override
  public Livre creerProduit(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }
}
