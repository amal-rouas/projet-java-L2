package projet;

import java.util.Scanner;

public class TestSac_a_dos {

	public static void main(String[] args) throws FormeNonEmpilable {
        Scanner sc=new Scanner(System.in);
		Sac_a_dos s = new Sac_a_dos(2,5);
         int reponse;
         System.out.println("Que voulez vous faire ?");
         System.out.println("remplir le SAC_A_DOS                     :tapez (0) => entrer ");
         System.out.println("Calculer le Volume du SAC_A_DOS          :tapez (1) => entrer ");
         System.out.println("remplir le SAC_A_DOS Calculer son Volume :tapez (2) => entrer ");
         
         reponse=sc.nextInt()%3;
         switch(reponse) {
         case 0:
		//----------------------------------------------l'appel a la methode empile du sac_a_dos-------------------------------------------------------
        	 System.out.print(s);
			s.empile();
			
			break;
		//-------------------------------------------affichage de l'objet Sac_a_dos-------------------------------------------------------
         case 1:
        	System.out.println("le volume du sac est "+s.volume_sac_a_dos());
        	 break;
         case 2:
        	 System.out.print(s);
        	 s.empile();
        	System.out.println("le volume du sac est "+s.volume_sac_a_dos());
        	 break;
         }

	}
}
