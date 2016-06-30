package veterinar_clinic;

import java.util.ArrayList;

/**
 * Created by lapte on 29.06.2016.
 */
public class Clinic {
    public ArrayList<Client> clients = new ArrayList<Client>();

    public Clinic() {
        this.clients = null;
    }

    public Clinic(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public boolean addClient(Client client) {
        boolean isAdd = false;
        this.clients.add(client);
        isAdd = true;
        return isAdd;
    }


    public boolean findClientByPet(String pet) {
        int count = 0;
        boolean isFound = false;
        try {
            for (Client client1 : this.clients) {
                if (client1.getPet().equals(pet)) {
                    System.out.println(pet + " belongs to " + client1.getName());
                    count++;
                    isFound = true;
                }
            }
            if (count == 0) {
                System.out.println("No clients found.");
                throw new MyException("Not printed to console. Exception: No clients found.");
            }
        } catch (MyException me) {
            System.out.println("Exception is worked out!");
        }
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.println(border);

        return isFound;
    }

    public void findPetByClient(String clientName) {
        int count = 0;
        for (Client client1 : this.clients) {
            if (client1.getName().equals(clientName)) {
                System.out.println(client1.getName() + " has " + client1.getPet());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No pet found.");
        }
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.println(border);
    }

    public void renameOwnerOfThePet(String pet, String newClientName) {
        int count = 0;
        for (Client client1 : this.clients) {
            if (client1.getPet().equals(pet)) {
                System.out.println("Old information: " + client1);
                client1.setName(newClientName);
                System.out.println("Updated client: " + client1);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No client found.");
        }
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.println(border);
    }

    public void renamePetOfOwner(String clientName, String pet) {
        int count = 0;
        for (Client client1 : this.clients) {
            if (client1.getName().equals(clientName)) {
                System.out.println("Old information: " + client1);
                client1.setPet(pet);
                System.out.println("Updated client: " + client1);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No pet found.");
        }
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.println(border);
    }


    public void deleteClient(String clientName) {
        int count = 0;
        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).getName().equals(clientName)) {
                this.clients.remove(i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No client found.");
        }
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.println(border);
    }

    public void deletePet(String pet) {
        int count = 0;
        for (Client client1 : this.clients) {
            if (client1.getPet().equals(pet)) {
                client1.setPet("no pet");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No pet found.");
        }
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.println(border);
    }

    @Override
    public String toString() {
        String plantTableFormat = "%-15s%-20s%-20s%n";
        String sf = "";
        String sCategories = String.format(plantTableFormat, "Client id", "Client name", "Pet");
        String sLine = "----------------------------------------------";
        String sEnter = "\n";

        for (Client client1 : this.clients) {
            sf += String.format(plantTableFormat, client1.getId(), client1.getName(), client1.getPet() + "\n");
        }
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

        return sCategories + sLine + sEnter + sEnter + sf + border;
    }
}
