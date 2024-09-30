import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD implements Magasin {
	private Map<String,DVD> bac= new HashMap<String,DVD>();
	private final DVDProduitAbstractFactory dvdProduitAbstractFactory = new DVDProduitAbstractFactory();
	@Override
	public void ajouterProduit(String name, int anneeDeParution){
		//DVD dvd=new DVD(name, anneeDeParution);
		DVD dvd = dvdProduitAbstractFactory.creerProduit(name,anneeDeParution);
		bac.put(name,dvd);
	}
	@Override
	public DVD retourneProduit(String name){
		return bac.get(name);
	}
}
