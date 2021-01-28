package projet;

import java.util.Random;

public class Spheres extends Dimension3{

	private double rayon;
	
	//------------------------------------------------les constructeurs--------------------------------------------------------
	
	//constructeur par defaut
	public Spheres() {
		super();
		this.nom="sphere";
		Random r=new Random();
		double val;
		
		do {
			val=r.nextDouble();
		}while(val<=0);
		
		setRayon(val);
	}
	
	//constructeur avec parametres
	public Spheres(String nom,double rayon) {
		super();
		this.nom=nom;
		this.rayon=rayon;
	}
	
	//constructeur avec parametres
		public Spheres(double rayon) {
			super();
			this.nom="sphere";
			this.rayon=rayon;
		}
	
	//accesseur 
	
	public double getRayon() {
		return this.rayon;
	}
	
	//modificateur
	
	public void setRayon(double rayon) {
		 this.rayon=rayon;
	}
		
	//----------------------------------------------la methode volume------------------------------------------------------------
	
	public double volume() {
		return 4/3*Math.PI*Math.pow(getRayon(), 3);
	}
	
	//----------------------------------------------la methode base ------------------------------------------------------------
	
	public  double base() {
		return 0.0;
	}

	//----------------------------------------------la methode toString------------------------------------------------------------
	
	public String toString() {
		
		return "{__"+super.toString()+"  rayon "+this.rayon+" base = Null __}";
	}
	
	

}
