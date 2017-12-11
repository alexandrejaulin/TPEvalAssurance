import java.util.ArrayList;
import java.util.List;

public class ContratAuto extends Contrat{

	@Override
	public Contrat creationContrat() {
		Contrat c=new ContratAuto();
		c.numeroContrat=Integer.toString(avoirNumeroPuisIncrementer());
		c.ContratValide=true;
		return c;
	}

	@Override
	public List<String> determinerGaranties() {
		List<String> listeGaranties = new ArrayList <String>();
		listeGaranties.add("Accidents");
		listeGaranties.add("Bris de glace");
		listeGaranties.add("Responsabilité civile");
		return listeGaranties;
	}

	@Override
	public double determinerCotisation() {
		return 150;
	}

}
