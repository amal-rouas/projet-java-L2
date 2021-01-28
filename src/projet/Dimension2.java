package projet;

public abstract class Dimension2 extends Forme implements Surface {

	
	public Dimension2() {
		super.nom="";
		super.dimension=2;
	}
	
	public Dimension2(String nom) {
		super.nom=nom;
		super.dimension=2;
	}
	
	public abstract double surface();

}
