import java.util.ArrayList;
import java.util.List;

public class ContratPrevoyance extends Contrat {

	@Override
	public Contrat creationContrat() {
		Contrat c=new ContratPrevoyance();
		c.numeroContrat=Integer.toString(avoirNumeroPuisIncrementer());
		c.ContratValide=true;
		return c;
	}

	@Override
	public List<String> determinerGaranties() {
		List<String> listeGaranties = new ArrayList <String>();
		listeGaranties.add("Accidents de la vie");
		listeGaranties.add("Maladie");
		listeGaranties.add("Mutuelle");
		return listeGaranties;
	}

	@Override
	public double determinerCotisation() {
		return 75;
	}

}
