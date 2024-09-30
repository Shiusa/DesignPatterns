import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {

  //private Map<String,Produit> bac= new HashMap<String,Produit>();

  public abstract Produit creerProduit(String name, int anneDeParution);

  //public abstract void ajouterProduit(String name, int anneeDeParution);
  public abstract void ajouterProduit(String name, int anneeDeParution);
  public abstract Produit retourneProduit(String name);

}
