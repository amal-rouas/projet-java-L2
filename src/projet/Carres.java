package projet;

import java.util.Random;

public class Carres extends Dimension2{

	private double cote;

	

	//------------------------------------------------les constructeurs--------------------------------------------------------
	//constructeur par defaut
	public Carres() {
		super();
		Random r=new Random();
		double val;
		this.nom="Carre";
		do {
		 val=r.nextDouble();
		}while(val<=0);
		
		this.cote=val;
		
	}
	
	//constructeur avec parametres
	public Carres(String nom,double cote) {
		
		super();
		this.nom=nom;
		this.cote=cote;

	}
	//-------------------------------------------------LES ACCESSEURES-----------------------------------------------------------------------------
	public double getCote() {
		return this.cote;
	}

	//-------------------------------------------------LES MODIFICATEURS---------------------------------------------------------------------------------
	public void setCote(double cote) {
		this.cote=cote;
	}
	

	//-------------------------------------------------la methode surface--------------------------------------------------------
	public double surface() {
		
		return Math.pow(this.cote, 2);
	}
	
	//-------------------------------------------------la methode toString --------------------------------------------------------
	public String toString() {
		return "{__"+super.toString()+" cote="+this.cote+"__}";
	}
	
	

}
