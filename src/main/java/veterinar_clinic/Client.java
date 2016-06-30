package veterinar_clinic;

/**
 * Created by lapte on 29.06.2016.
 */
public class Client {
    private int id;
    private String name;
    private String pet;

    public Client(int id, String name, String pet) {
        setId(id);
        setName(name);
        setPet(pet);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name=" + name +
                ", pet=" + pet +
                '}';
    }
}
