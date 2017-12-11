import java.util.Scanner;

public class TPEvalMain 
{
	public static void afficherMenu()
	{
		System.out.println("Que voulez vous faire cher Monsieur ?");
		System.out.println("1 - Ajouter un client");
		System.out.println("2 - Ajouter un contrat à un client");
		System.out.println("3 - Afficher la liste des clients");
		System.out.println("4 - Quitter cette interface du futur");
	}
	
	public static void ajouterClient(CompagnieAssurance c)
	{
		String prenom,nom;
		int j,m,a;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Vous voulez donc ajouter une personne dans la compagnie");
		System.out.println("Quel est son pénom ?");
		prenom=scanner.nextLine();
		System.out.println("Quel est son nom ?");
		nom=scanner.nextLine();
		System.out.println("Quel jour est il né ?");
		j=scanner.nextInt();
		System.out.println("Le mois ?");
		m=scanner.nextInt();
		System.out.println("L'année ?");
		a=scanner.nextInt();
		c.ajouterClient(new Personne(nom,prenom,j,m,a));
		System.out.println("Cette personne a été ajoutée ! gg");
		
	}
	
	public static void ajouterContrat(CompagnieAssurance c)
	{
		int client,contrat;
		Scanner scanner =new Scanner(System.in);
		afficherClient(c);
		System.out.println("A qui voulez vous ajouter un contrat ?");
		System.out.print("Numéro du client : ");
		client=scanner.nextInt();
		System.out.println("");
		System.out.println("1 - Auto");
		System.out.println("2 - Prevoyance");
		System.out.println("3 - MRH");
		System.out.println("Quel type de contrat voulez vous lui souscrire ?");
		System.out.print("Numéro du contrat : ");
		contrat=scanner.nextInt();
		switch(contrat)
		{
		case 1:c.client.get(client-1).creerContrat("Auto");break;
		case 2:c.client.get(client-1).creerContrat("Prevoyance");break;
		case 3:c.client.get(client-1).creerContrat("MRH");
		}
		
	}
	
	public static void afficherClient(CompagnieAssurance c)
	{
		int i=1;
		for(Personne p : c.client)
		{
			System.out.println(i+" "+p.toString());
			i++;
		}
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
			case 1 : ajouterClient(sKro);break;
			case 2 : ajouterContrat(sKro);break;
			case 3 : afficherClient(sKro);
			
			}
		}while(input!=4);
		System.out.println("Au revoir cher Monsieur alors !");
	}
}



