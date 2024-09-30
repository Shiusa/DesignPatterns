import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD extends Magasin {
	private Map<String,DVD> bac= new HashMap<String,DVD>();
	private DVDProduitFactory dvdProduitFactory = new DVDProduitFactory();

	@Override
	public DVD creerProduit(String name, int anneDeParution) {
		return dvdProduitFactory.creerProduit(name, anneDeParution);
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
