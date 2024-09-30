import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre extends Magasin {
	private Map<String,Livre> etagere= new HashMap<String,Livre>();

	@Override
	public Livre creerProduit(String name, int anneDeParution) {
		return new Livre(name,anneDeParution);
	}

	@Override
	public void ajouterProduit(String name, int anneeDeParution){
		//Livre livre=new Livre(name, anneeDeParution);
		Livre livre = creerProduit(name,anneeDeParution);
		etagere.put(name,livre);
	}

	@Override
	public Livre retourneProduit(String name){
		return etagere.get(name);
	}
}
