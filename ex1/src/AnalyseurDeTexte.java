import Observers.ObserverNbrMots;
import Observers.ObserverLigneBelgique;
import Observers.ObserverNbrLignes;
import Observers.ObserverNbrPalindrome;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnalyseurDeTexte {
	public static void main(String[] args) throws IOException {

		ObserverNbrLignes observerNbrLignes = new ObserverNbrLignes();
		ObserverLigneBelgique observerLigneBelgique = new ObserverLigneBelgique();
		ObserverNbrMots observerNbrMots = new ObserverNbrMots();
		ObserverNbrPalindrome observerNbrPalindrome = new ObserverNbrPalindrome();

		ObserverNotifier notifier = new ObserverNotifier();
		notifier.addObserverLigne(observerNbrLignes);
		notifier.addObserverLigne(observerLigneBelgique);
		notifier.addObserverMot(observerNbrMots);
		notifier.addObserverMot(observerNbrPalindrome);

		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		//int nbrMots = 0, nbrLignes = 0, nbrPalindromes = 0, nbrBelgique = 0;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {

			notifier.notifyObserverLigne(ligne);

			for (String mot:ligne.trim().split(" ")) {
				notifier.notifyObserverMot(mot);
			}
			/*nbrLignes++;
			if (ligne.contains("Belgique")) {
				nbrBelgique++;
			}
			for (String mot : ligne.trim().split(" ")) {
				nbrMots++;
				StringBuffer temp = new StringBuffer(mot);
				if (mot.equals(temp.reverse().toString())) {
					nbrPalindromes++;
				}
			}*/

		}
		lecteurAvecBuffer.close();
		System.out.println("Il y avait " + observerNbrLignes.getNombreLignes() + " lignes.");
		System.out.println("Il y avait " + observerNbrMots.getNombreMots() + " mots.");
		System.out.println("Il y avait " + observerNbrPalindrome.getNombrePalindrome() + " palindromes.");
		System.out.println("Il y avait " + observerLigneBelgique.getNombreLigneBelgique() + " lignes contenant Belgique.");
		/*System.out.println("Il y avait " + nbrLignes + " lignes.");
		System.out.println("Il y avait " + nbrMots + " mots.");
		System.out.println("Il y avait " + nbrPalindromes + " palindromes.");
		System.out.println("Il y avait " + nbrBelgique + " lignes contenant Belgique.");*/
	}
}
