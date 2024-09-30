import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre implements Magasin {
	private Map<String,Livre> etagere= new HashMap<String,Livre>();
	private final LivreProduitAbstractFactory livreProduitAbstractFactory = new LivreProduitAbstractFactory();
	@Override
	public void ajouterProduit(String name, int anneeDeParution){
		//Livre livre=new Livre(name, anneeDeParution);
		Livre livre = livreProduitAbstractFactory.creerProduit(name,anneeDeParution);
		etagere.put(name,livre);
	}
	@Override
	public Livre retourneProduit(String name){
		return etagere.get(name);
	}
}
