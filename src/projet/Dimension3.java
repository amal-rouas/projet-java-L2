package projet;

public abstract class Dimension3 extends Forme implements Volume,Base{

	
	public Dimension3() {
		super.nom="";
		super.dimension=3;
	}
	
	
	public Dimension3(String nom) {
		super.nom=nom;
		super.dimension=3;
	}
	
	public abstract double volume();
	
	public abstract double base();
}
