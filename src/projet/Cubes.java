package projet;

import java.util.Random;

public class Cubes extends Dimension3{

     private double longeur;
	//----------------------------------------------les constructeurs------------------------------------------------------------
	
	
	//constructeur par defaut
	public Cubes() {
		super();
		this.nom="cube";
		
		Random r=new Random();
		double val;
		
		do {
			val=r.nextDouble();
		}while(val<=0);
		
		setLongeur(val);
	}
		
		
	//constructeur avec parametre
	public Cubes(String nom,double longeur) {
		super();
		this.nom=nom;
		setLongeur(longeur);
	}
	
	//constructeur avec parametre
		public Cubes(double longeur) {
			super();
			setLongeur(longeur);
		}
		
		
		
		//accesseur 
		
		public double getLongeur() {
			return this.longeur;
		}
		
		//modificateur
		
		public void setLongeur(double longeur) {
			 this.longeur=longeur;
		}
		
	//----------------------------------------------la methode base------------------------------------------------------------
	
	//methode calcul de la base
	public double base() {
		return Math.pow(longeur, 2);
	}
	
	
	///----------------------------------------------la methode volume------------------------------------------------------------
	
	public double volume() {
		return this.base()*this.longeur;
	}

	//----------------------------------------------la methode toString-----------------------------------------------------------
	
	public String toString() {
		
		return "{__"+super.toString()+"  longeur "+this.longeur+"   base "+base()+"__} ";
	}
	
	

}
