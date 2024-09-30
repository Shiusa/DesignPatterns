import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD extends Magasin {
	private Map<String,DVD> bac= new HashMap<String,DVD>();

	@Override
	public DVD creerProduit(String name, int anneDeParution) {
		return new DVD(name,anneDeParution);
	}

	@Override
	public void ajouterProduit(String name, int anneeDeParution){
		//DVD dvd=new DVD(name, anneeDeParution);
		DVD dvd = creerProduit(name,anneeDeParution);
		bac.put(name,dvd);
	}
	@Override
	public DVD retourneProduit(String name){
		return bac.get(name);
	}
}
