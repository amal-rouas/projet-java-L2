package projet;

import java.util.Random;

public class Cercles extends Dimension2
{
	
	private double rayon;
	
	//----------------------------------------------les constructeurs------------------------------------------------------------
	
	//constructeur par défaut
	public Cercles() {
		super();
		Random r=new Random();
		this.nom="Cercle";
		double val;
		do {
		val=r.nextDouble();
		}while(val<=0);
		
		this.rayon=val;
	}
	
	//constructeur avec parametre
	public Cercles(String nom,double r) {
		super();
		this.nom=nom;
		this.rayon=r;
	}
	
	//----------------------------------------------les accesseurs------------------------------------------------------------
	
	public double getRayon() {
		return rayon;
	}
    ///----------------------------------------------les modeficateurs------------------------------------------------------------
	
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	
	//----------------------------------------------la methode surface------------------------------------------------------------
	
	public double surface() {
		return Math.pow(rayon, 2)*Math.PI;
	}

	//----------------------------------------------la methode toString------------------------------------------------------------
	
	public String toString() {
		return "{__"+super.toString()+" Rayon="+this.rayon+"__}";
	}
	
	

}
