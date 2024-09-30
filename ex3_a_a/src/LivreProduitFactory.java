public class LivreProduitFactory implements ProduitFactory {

  @Override
  public Livre creerProduit(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }
}
