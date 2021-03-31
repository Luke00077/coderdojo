package client;

import database.PetInfo;
import model.Pet;

public class PetDetails {

	public static void main(String[] args) {
//    object new PetDetails 
		PetInfo information = new PetInfo();
	
	Pet lab = 	information.getPet("Labrador Retriever"); 
		
		System.out.println(lab.breed);

	}

}
