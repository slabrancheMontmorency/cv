import java.util.Arrays;
public class CV {
	
	String nom, prenom, formation, attentes;
	int xpTravail;
	String[] competences;
	
	public void affiche(){
	
	
		
		System.out.println("Nom : " + nom + "\n"
						+ "Pr�nom : " + prenom + "\n"
						+ "Formation : " + formation + "\n"
						+ "Exp�riences de travail : " + xpTravail + "\n"
						+ "Comp�tences : "  + Arrays.toString(competences) + "\n"
						+ "Attentes vis � vis le cours 4B4 : " + attentes + "\n" );
	}

}
