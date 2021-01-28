package projet;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sac_a_dos {

	private Forme[][] matrice;
	private int taille;
    private Forme[] ensembleforme;
	// -----------------------------------------------LES
	// CONSTRUCTEURS---------------------------------------------------------------------------------------

	// constructeur par defaut

	public Sac_a_dos() {
		this.taille=0;
		sac = new Forme[this.taille][this.taille];
		for (int i = 0; i < this.taille; ++i) {
			for (int j = 0; j < this.taille; ++j) {
				matrice[i][j] = null;
				
			}
		}
		this.ensembleforme=new Forme[this.taille];
	}
	// constructeur avec paramettre

	public Sac_a_dos(int taille,int nb ) {
		this.taille = taille;
		ensembleforme=new Forme[nb];
		sac = new Forme[this.taille][this.taille];
		for (int i = 0; i < this.taille; ++i) {
			for (int j = 0; j < this.taille; ++j) {
				matrice[i][j] = null;
			}
		}
	ensembleforme=this.genereforme(nb);
	}

	public Forme getFormedeSac(int ligne,int colonne) {
		return sac[ligne][colonne];
	}

	public int getTaille() {
		return taille;
	}

	public Forme[] getEnsembleforme() {
		return ensembleforme;
	}
	
	public Forme getFormedeEnsemble(int position) {
		return ensembleforme[position];
	}
	
	public void setFormedeEnsemble(int position,Forme f) {
		  ensembleforme[position]=f;
	}

	public void setEnsembleforme(Forme[] ensembleforme) {
		this.ensembleforme = ensembleforme;
	}

	
	// ------------------------------------------------la methode empile
		// --------------------------------------------------------

	
	public void empile() {
		
		int ligne,colonne;
		Scanner sc = new Scanner(System.in);
		while(!sac_plein() && !ensemblevide()) {
			System.out.println("Donnez une ligne   :");
			ligne=sc.nextInt();
			System.out.println("Donnez une colonne :");
			colonne=sc.nextInt();
			System.out.println("\n");
			
			System.out.println(" entrer le numero de la forme que vous voulez inserer \n");
			afficheensemble();
			empile(ligne,colonne,sc.nextInt());
			System.out.println(this);
		}
	}
	
	// evaluation de l'empilemment 
	
	private void empile(int ligne,int colonne,int i) {
		try {                                                                        
		if(getFormedeSac(ligne,colonne)!=null 
				|| ligne !=getTaille()-1 && getFormedeSac(ligne+1,colonne)==null
				|| getFormedeEnsemble(i).dimension !=3
				|| ligne !=getTaille()-1 && getFormedeEnsemble(i).dimension ==3 && ((Dimension3) (getFormedeSac(ligne+1,colonne))).base()<((Dimension3)(getFormedeEnsemble(i))).base()) {
			
			throw new FormeNonEmpilable("Forme non empilable\n ");
	     }
	
		}catch(FormeNonEmpilable f) {
			System.out.println(f);
			f.printStackTrace();
			//System.out.println("RECOMMENCE   \n");
					if(ensembleforme[i].dimension!=3){
				ensembleforme[i]=null;
				return;
			}
			/*
			if(!ensemblevide()) {
				empile();
			}*/
			
		}
		sac[ligne][colonne]=ensembleforme[i];
		ensembleforme[i]=null;

	}
	
	
	// verifie si le sac et plein ou pas 
	
	private boolean sac_plein() {
		for(int i=0;i<this.taille;++i) {
			for(int j=0;j<this.taille;j++) {
				if(matrice[i][j]==null) {
					return false;
				}
			}
			}
		return true;
		}
	
	

                                    
	
	// gereration aleatoire des formes

	private Forme[] genereforme(int nb) {
		Random r = new Random();
		Forme[] tab=new Forme[nb];
		int valeur,i=0;
		while(i<nb) {
		val = r.nextInt(6);
		switch (valeur) {
		case 0:
			tab[i] = new Carres();
			break;
		case 1:
			tab[i] = new Spheres();
			break;
		case 2:
			tab[i] = new Glomes();
			break;
		case 3:
			tab[i] = new  Cubes();
			break;		
		case 4:
			tab[i] = new  Cercles();
			break;
		case 5:
			tab[i] = new  Cylindres();
			break;
			
		}
		
        i++;
		}
		
		
     return tab;
	}
	
	
	public boolean ensemblevide() {
     int i;
     for(i=0;i<ensembleforme.length;++i) {
    	 if(ensembleforme[i]!=null) {
    		 return false;
    	 }
     }
     return true;
	}
	
	
	
	
	
	//affichage ensemble des formes 
	
	public void afficheensemble() {
		int i=0;
		
		while(i<ensembleforme.length ) {
			if(ensembleforme[i]!=null) {
			System.out.println("Numéro "+i+" "+ensembleforme[i].toString()+" \n");
			}
			i+=1;
		}
	}
	
	//volume sac a dos

	public double volume_sac_a_dos() {
		int i,j;
		double somme=0;
		for(i=0;i<this.taille;++i) {
			for(j=0;j<this.taille;++j) {
				if(matrice[i][j]!=null) {
				somme=somme+((Dimension3)matrice[i][j]).volume();
				}
			}
		}
		return somme;
	}

	// ------------------------------------------------la methode
	// toString--------------------------------------------------------

	public String toString() {
		// organise_sac_a_dos();
		int j;
		String resu = "_________________________________________________________________________________________________________________________________________________";
		for (int i = 0; i < this.taille; ++i) {
			for (j = 0; j < this.taille; ++j) {
				if (matrice[i][j]!= null) {
					resu = resu + "             " + getFormedeSac(i,j).toString();
				} else {
					if (j >= this.taille) {
						resu = resu + "  \n \n   ";
					} else {
						resu = resu + "                                         [vide]                 ";
					}
				}
			}
			resu = resu + "\n \n";
		}
			return resu;
	}

}
