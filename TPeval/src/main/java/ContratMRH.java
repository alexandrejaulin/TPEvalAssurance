import java.util.ArrayList;
import java.util.List;

public class ContratMRH extends Contrat{

	@Override
	public Contrat creationContrat() {
		Contrat c=new ContratMRH();
		c.numeroContrat=Integer.toString(avoirNumeroPuisIncrementer());
		c.ContratValide=true;
		return c;
	}

	@Override
	public List<String> determinerGaranties() {
		List<String> listeGaranties = new ArrayList <String>();
		listeGaranties.add("Incendies");
		listeGaranties.add("Vitres");
		listeGaranties.add("Innondation");
		listeGaranties.add("Responsabilité civile");
		return listeGaranties;
	}

	@Override
	public double determinerCotisation() {
		return 100;
	}

}
