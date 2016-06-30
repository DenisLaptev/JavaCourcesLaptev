package veterinar_clinic;

import java.util.ArrayList;

/**
 * Created by lapte on 29.06.2016.
 */
public class App {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(new ArrayList<Client>());

        System.out.println("Empty list:");

        System.out.println(clinic);
///////////////////////////////////////////////////////////////
        System.out.println("Adding new clients:");

        clinic.addClient(new Client(1, "Fred", "cat"));
        clinic.addClient(new Client(2, "Jason", "dog"));
        clinic.addClient(new Client(3, "Michael", "cat"));
        clinic.addClient(new Client(4, "Jason", "bird"));
        clinic.addClient(new Client(5, "Jason", "cat"));
        clinic.addClient(new Client(6, "Oliver", "dog"));
        clinic.addClient(new Client(7, "Tom", "cat"));

        System.out.println(clinic);
////////////////////////////////////////////////////////////////
        System.out.println("Finding a client of the pet:");

        clinic.findClientByPet("cat");
        clinic.findClientByPet("bird");
        clinic.findClientByPet("snake");
//////////////////////////////////////////////////////////////////////
        System.out.println("Finding a pet of the client:");

        clinic.findPetByClient("Jason");
        clinic.findPetByClient("John");
///////////////////////////////////////////////////////////////////////////
        System.out.println("Renaming the owner of the pet:");

        clinic.renameOwnerOfThePet("cat", "new cat owner");
        clinic.renameOwnerOfThePet("dog", "Denis");
        clinic.renameOwnerOfThePet("turtle", "Bob");

        System.out.println(clinic);
////////////////////////////////////////////////////////////////////////////
        System.out.println("Renaming the pet of the owner:");

        clinic.renamePetOfOwner("new cat owner", "tiger");

        System.out.println(clinic);
//////////////////////////////////////////////////////////////////////////////
        System.out.println("Deleting the owner of the pet:");

        clinic.deleteClient("new cat owner");

        System.out.println(clinic);

///////////////////////////////////////////////////////////////////////////////
        System.out.println("Deleting the pet of the owner:");

        clinic.deletePet("bird");

        System.out.println(clinic);


    }
}
