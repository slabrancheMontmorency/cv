import java.util.Arrays;
public class CV {
	
	String nom, prenom, formation, attentes;
	int xpTravail;
	String[] competences;
	
	public void affiche(){
	
	
		
		System.out.println("Nom : " + nom + "\n"
						+ "Prénom : " + prenom + "\n"
						+ "Formation : " + formation + "\n"
						+ "Expériences de travail : " + xpTravail + "\n"
						+ "Compétences : "  + Arrays.toString(competences) + "\n"
						+ "Attentes vis à vis le cours 4B4 : " + attentes + "\n" );
	}
	public CV (String nom, String prenom, String formation, String attentes, int xpTravail, String[] competences){
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.attentes = attentes;
		this.xpTravail = xpTravail;
		this.competences = competences;
		
	}

}
