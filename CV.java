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
	public CV (String nom, String prenom, String formation, String attentes, int xpTravail, String[] competences){
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.attentes = attentes;
		this.xpTravail = xpTravail;
		this.competences = competences;
		
	}
	public static void main(String[] args) {
		
		String[] compVick = {"Linux", "Java", "C#", "HTML", "Javascript"};
		String[] compLauren = {"Linux", "Java", "C#", "HTML", "Javascript"};
		
		System.out.println("Bienvenue chez Barette!");
		
		CV vickie = new CV("Langlois", "Vickie", "Information de Gestion", "Apprendre de nouvelles comp�tences", 1, compVick);
		CV lauren = new CV("Perez", "Lauren", "Information de Gestion", "Apprendre de nouvelles comp�tences", 0, compLauren);
		
		vickie.affiche();
		lauren.affiche();
	}
	
		

}
