package tp2sem2;

import java.util.Collection;

public class TestPatient {

	public static void main(String[] args) {
		
		DossierPharmacie pharmacie = new DossierPharmacie("une pharmacie");
		
		pharmacie.nouveauPatient("isslem", new String[]{"medicament1", "medicament2"});
	    pharmacie.nouveauPatient("intissar", new String[]{"medicament3", "medicament5"});
	    pharmacie.nouveauPatient("hana", new String[]{"medicament5", "medicament6"});
	    
	    pharmacie.affiche();

        pharmacie.ajoutMedicament("maram", "medicament7");
        pharmacie.affichePatient("maram");

        Collection<String> patientsAvecMedicament5 = pharmacie.affichePatientAvecMedicament("medicament5");
        System.out.println("Patients ayant pris de le medicament5 : " + patientsAvecMedicament5);
	    
	}
}
