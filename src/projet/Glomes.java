package projet;

import java.util.Random;

public class Glomes extends Dimension4{
	
	private double rayon;
	
	//constructeur par default 
	
	public Glomes() {
		super();
		this.nom="glome";
		Random r=new Random();
		
		double val;
		
		do {
			val=r.nextDouble();
		}while(val<=0);
		
		this.rayon=val;
	}
	
	//constructeur 
	
		public Glomes(double rayon) {
			super();
			this.rayon=rayon;
		}
		
		
		
		public double getRayon() {
			return rayon;
		}

		public void setRayon(double rayon) {
			this.rayon = rayon;
		}
		
		
	//----------------------------------------------la methode volume------------------------------------------------------------
	

	public double volume() {
		
		return 0.5*Math.PI*Math.PI*Math.pow(this.getRayon(), 4);
	}

	@Override
	public String toString() {
		return "{__"+super.toString()+" rayon=" + rayon + "__}";
	}
	
	

}
