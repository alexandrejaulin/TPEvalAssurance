import java.util.Scanner;

public class TPEvalMain 
{
	public static void afficherMenu()
	{
		System.out.println("Que voulez vous faire cher Monsieur ?");
		System.out.println("1 - Ajouter un client");
		System.out.println("2 - Ajouter un contrat à un client");
		System.out.println("3 - Quitter cette interface du futur");
	}
	
	public static void ajouterClient()
	{
		String prenom,nom;
		int j,m,a;
		Scanner scanner =new Scanner(System.in);
		
	}


	public static void main(String[] args) {
		/*Etape 2*/
		CompagnieAssurance sKro = new CompagnieAssurance("S'Kro");
		Personne p1 = new Personne("Jaulin","Alexandre",11,12,1995);
		Personne p2 = new Personne("Jong-Un","Kim",4,5,1976);
		Personne p3 = new Personne("Trump","Donald",18,9,1950);
		Personne p4 = new Personne("Macron","Emmanuel",20,2,1970);
		int input=0;
		Scanner scanner =new Scanner(System.in);
		
		sKro.ajouterClient(p1);
		sKro.ajouterClient(p2);
		sKro.ajouterClient(p3);
		sKro.ajouterClient(p4);
		
		p1.creerContrat("Auto");
		p3.creerContrat("Prevoyance");
		p1.creerContrat("MRH");
		
		/*Etape 3*/
		System.out.println("Le plus gros client est "+sKro.obtenirPlusGrosClient().toString());
		
		/*Etape 4*/
		do
		{
			afficherMenu();
			input=scanner.nextInt();
			switch (input) 
			{
			
			}
	
		

		}while(input!=3);
		System.out.println("Au revoir cher Monsieur alors !");
	}
}


