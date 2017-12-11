import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompagnieAssurance {
	String nom;
	List<Personne> client;
	
	CompagnieAssurance(String n)
	{
		nom=n;
		client=new ArrayList <Personne>();
	}
	
	public int obtenirNombreDeClients()
	{
		return client.size();
	}
	
	public int obtenirNombreDeProspects()
	{
		int nbProspects=0;
		
		for(Personne p : client)
		{
			if(!p.estUnClient)
			nbProspects++;
		}
		
		return nbProspects;
	}
	
	public int obtenirNombreDeContrats()
	{
		int nbContrats=0;
		
		for(Personne p : client)
		{
			nbContrats+=p.obtenirNombreDeContrats();
		}
		
		return nbContrats;
	}
	
	public void ajouterClient(Personne p)
	{
		client.add(p);
	}
	
	public Personne obtenirPlusGrosClient()
	{
		Personne[] tabPersonne=new Personne[client.size()];
		client.toArray(tabPersonne);	
		Arrays.sort(tabPersonne,new PersonneComparator());
		return tabPersonne[client.size()-1];
		
	}

}
