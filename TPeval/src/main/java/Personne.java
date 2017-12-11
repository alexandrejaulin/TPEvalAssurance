
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Personne {
	
	boolean estUnClient;
	String nom;
	String prenom;
	GregorianCalendar dateDeNaissance;
	List<Contrat> contratsSouscrits;
	List<Personne> membreFamille;
	
	Personne(String n, String p, int j, int m, int a)
	{
		nom=n;
		prenom=p;
		dateDeNaissance=new GregorianCalendar(a,m-1,j);
		estUnClient=false;
		membreFamille=new ArrayList <Personne>();
		contratsSouscrits=new ArrayList <Contrat>();
	}
	
	Personne()
	{
		
	}
	
	public int obtenirNombreDeContrats()
	{
		return contratsSouscrits.size();
	}
	
	public boolean estClient()
	{
		return estUnClient;
	}
	
	public String obtenirNomComplet()
	{
		return prenom + nom;
	}
	
	public GregorianCalendar obtenirDateDeNaissance()
	{
		return dateDeNaissance;
	}
	
	public Contrat creerContrat(String typeDeContrat)
	{
		if(typeDeContrat.equals("Auto"))
		{
			System.out.println("Contrat auto crée");
			estUnClient=true;
			ContratAuto c = new ContratAuto();
			contratsSouscrits.add(c);
			return c;
		}
		
		if(typeDeContrat.equals("Prevoyance"))
		{
			System.out.println("Contrat prévoyance crée");
			estUnClient=true;
			ContratPrevoyance c = new ContratPrevoyance();
			contratsSouscrits.add(c);
			return c;
		}
		
		if(typeDeContrat.equals("MRH"))
		{
			System.out.println("Contrat MRH crée");
			estUnClient=true;
			ContratMRH c = new ContratMRH();
			contratsSouscrits.add(c);
			return c;
		}
		
		System.out.println("Type de contrat inconnu");
		return null;
	}
	
	public void resilierContrat(Contrat aSupprime)
	{
		for(Contrat c : contratsSouscrits)
		{
			if(c.equals(aSupprime))
			{
				contratsSouscrits.remove(c);
			}
		}
		if(contratsSouscrits.size()==0)
		{
			estUnClient=false;
		}
	}
	
	public void resilierContrat(String numero)
	{
		for(Contrat c : contratsSouscrits)
		{
			if(c.equals(numero))
			{
				contratsSouscrits.remove(c);
			}
		}
		if(contratsSouscrits.size()==0)
		{
			estUnClient=false;
		}
		
	}
	
	public List<Contrat> obtenirContratsAuto()
	{
		List<Contrat> listeContrats = new ArrayList <Contrat>();
		for(Contrat c : contratsSouscrits)
		{
			if(c.determinerCotisation()==150)
			{
				listeContrats.add(c);
			}
		}
		
		return listeContrats;
	}
	
	public List<Contrat> obtenirContratsMRH()
	{
		List<Contrat> listeContrats = new ArrayList <Contrat>();
		for(Contrat c : contratsSouscrits)
		{
			if(c.determinerCotisation()==75)
			{
				listeContrats.add(c);
			}
		}
		return listeContrats;
		
	}
	
	public String toString()
	{
		return nom + " " + prenom + " né le " + dateDeNaissance.get(GregorianCalendar.DAY_OF_MONTH) +" "+ (dateDeNaissance.get(GregorianCalendar.MONTH)+1) +" "+dateDeNaissance.get(GregorianCalendar.YEAR) +", a souscrit " + contratsSouscrits.size() + " contrat(s).";
	}

}
