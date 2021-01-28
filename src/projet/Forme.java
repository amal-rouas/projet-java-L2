package projet;

public class Forme {
	public String nom;
	public int dimension;

	
	//----------------------------------------------les constructeurs------------------------------------------------------------
	
	public Forme() {
		this.nom = "";
		this.dimension = 0;
	}

	public Forme(String nom, int d) {
		this.nom = nom;
		this.dimension = d;
	}

	//----------------------------------------------la methode base------------------------------------------------------------
	

	//----------------------------------------------la methode toString------------------------------------------------------------
	
	public String toString() {
		return "nom=" + nom + "  dimension=" + dimension + " ";
	}

}
