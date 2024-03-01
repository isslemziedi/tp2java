package tp2sem2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Patient {
	
	private String nom ;
	private Set <String > ordonnance ;
	
	public Patient ( String nom){
		this.nom = nom ;
		this.ordonnance = new HashSet <String >();
	}
	public String getNom () { 
		return nom ;
	}

	public boolean ordonnanceVide (){
		if(ordonnance.isEmpty()== true) {
			return true;
		}
		else {
			return false;
		}
	}

	public void ajoutMedicament ( String m) {
		ordonnance.add(m);
	}

	@Override
	public String toString() {
		return "Patient [nom=" + nom + ", ordonnance=" + ordonnance + "]";
	}
	
	public void affiche(){
		System.out.println(this.toString());
	}

	
	public boolean contientMedicament (String m) {
		if(ordonnance.contains(m)== true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void trieOrdonnace() {
		Set<String> ordonnanceTriee = new TreeSet<>(ordonnance);
		ordonnance = ordonnanceTriee;
	}
}
