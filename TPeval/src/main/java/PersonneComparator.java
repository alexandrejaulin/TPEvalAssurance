import java.util.Comparator;

public class PersonneComparator implements Comparator <Personne>
{
	public int compare(Personne p1, Personne p2){
		int comp=0;
		if(p1.obtenirNombreDeContrats()==p2.obtenirNombreDeContrats()){
			comp=0;
		}
		if(p1.obtenirNombreDeContrats()>p2.obtenirNombreDeContrats()){
			comp=1;
		}
		if(p1.obtenirNombreDeContrats()<p2.obtenirNombreDeContrats()){
			comp=-1;
		}
		return comp;
	}	
}
