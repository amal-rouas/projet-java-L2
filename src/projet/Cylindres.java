package projet;

import java.util.Random;

public class Cylindres extends Dimension3{
   
	private double rayon;
	private double hauteur;

	//------------------------------------------------les constructeurs--------------------------------------------------------
	
	//constructeur par défaut
	public Cylindres() {
		super();
		this.nom="cylindre";
		Random r=new Random();
		
		double val,val1;
		do {
		val=r.nextDouble();
		val1=r.nextDouble();
		}while(val<=0 || val1<=0);
		
		this.hauteur=val;
		this.rayon=val1;
	}
	
	//constructeur avec parametres
	public Cylindres(String nom,int dimension,double rayon,double h) {
		super();
		this.nom=nom;
		this.hauteur=h;
        this.dimension=dimension;
	}
	
	
	
	//------------------------------------------------la methode base--------------------------------------------------------
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	//------------------------------------------------la methode base--------------------------------------------------------
	
	public double base() {
		return Math.pow(getRayon(), 2)*Math.PI;
	}
	
	
	//------------------------------------------------la methode volume--------------------------------------------------------
	
	
	public double volume() {
		return this.base()*this.hauteur;
	}

	//------------------------------------------------la methodetoString--------------------------------------------------------

	public String toString() {
		
		return "{__"+super.toString()+"  hauteur "+this.hauteur+"  rayon "+this.rayon+"  base  "+Math.round(this.base()*100.0)/100.0+"_} ";
	}
	
	

}
