import java.util.List;

public abstract class Contrat {
	protected String numeroContrat;
	protected boolean ContratValide;
	static int numero=1;
	
	public int avoirNumeroPuisIncrementer()
	{
		return numero++;
	}
	
	
	public abstract Contrat creationContrat();
	
	public abstract List<String> determinerGaranties();
	
	public abstract double determinerCotisation();
	
	boolean equals(Contrat c)
	{
		return numeroContrat.equals(c.numeroContrat);
	}
	
	boolean equals(String numero)
	{
		return numeroContrat.equals(numero);
	}
	
	

}
