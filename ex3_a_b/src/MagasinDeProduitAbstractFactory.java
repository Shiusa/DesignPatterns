import java.util.HashMap;
import java.util.Map;

public class MagasinDeProduitAbstractFactory {

  private Map<String,Produit> bac= new HashMap<String,Produit>();
  private ProduitAbstractFactory produitAbstractFactory;

  public MagasinDeProduitAbstractFactory(ProduitAbstractFactory produitAbstractFactory) {
    this.produitAbstractFactory = produitAbstractFactory;
  }

  public void ajouterProduit(String name, int anneeDeParution){
    //DVD dvd=new DVD(name, anneeDeParution);
    Produit produit = produitAbstractFactory.creerProduit(name,anneeDeParution);
    bac.put(name,produit);
  }
  public Produit retourneProduit(String name){
    return bac.get(name);
  }

}
