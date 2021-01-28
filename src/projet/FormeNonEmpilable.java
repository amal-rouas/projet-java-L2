package projet;

public class FormeNonEmpilable extends Exception{

	
	public String message;
	
	//----------------------------------------------le constructeur------------------------------------------------------------
	
	public FormeNonEmpilable(String m) {
		message=m;
		
	}
	
	//----------------------------------------------la methode toString------------------------------------------------------------
	
	public String toString() {
		return this.message;
	}
}
