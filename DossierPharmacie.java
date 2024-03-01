package tp2sem2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DossierPharmacie {
		private String nom ;
		private HashMap <String , Patient > patients ;
				
		public DossierPharmacie ( String n){
			nom =n;
			patients = new HashMap <String , Patient >();
		}

		public void nouveauPatient ( String nom , String [] ordonnance ){
			Patient patient = new Patient(nom);
		        for (String medicament : ordonnance) {
		            patient.ajoutMedicament(medicament);
		        }
		     patients.put(nom.toLowerCase(), patient);
		}
		
		public boolean ajoutMedicament (String nom, String medicament){
			Patient patient = patients.get(nom.toLowerCase());
	        if (patient != null) {
	            patient.ajoutMedicament(medicament);
	            return true;
	        } else {
	            return false;
	        }
		}

		public void affichePatient (String nom){
			Patient patient = patients.get(nom.toLowerCase());
	        if (patient != null) {
	            patient.affiche();
	        } else {
	            System.out.println("Le patient n'existe pas.");
	        }
		}

		public void affiche (){
			System.out.println(" le Nom de la pharmacie est : " + nom);
	        System.out.println(" la Liste des patients est : ");
	        for (Patient patient : patients.values()) {
	            System.out.println("Nom du patient : " + patient.getNom());
	        }
		}
		
		public Collection <String > affichePatientAvecMedicament (String m){
			Set<String> patientsAvecMedicament = new HashSet<>();
	        for (Patient patient : patients.values()) {
	            if (patient.contientMedicament(m)) {
	                patientsAvecMedicament.add(patient.getNom());
	            }
	        }
	        return patientsAvecMedicament;		
		}
}
