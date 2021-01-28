package projet;

public abstract class Dimension4 extends Forme implements Volume {
	
	public Dimension4() {
		super.nom="";
		super.dimension=4;
	}
	
	public Dimension4(String nom) {
		super.nom=nom;
		super.dimension=4;
	}
	
	public abstract double volume();

}
