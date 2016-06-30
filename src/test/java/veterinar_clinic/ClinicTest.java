package veterinar_clinic;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by lapte on 29.06.2016.
 */
public class ClinicTest {

    @Test
    public void testAddClient() throws Exception {

    }

    @Test
    public void testFindClientByPet() throws Exception {
        boolean actual = new Clinic(new ArrayList<Client>()).findClientByPet("bird");
        boolean expected = false;
        Assert.assertEquals("Test for method findClientByPet()", expected, actual);
    }

    @Test
    public void testFindPetByClient() throws Exception {

    }

    @Test
    public void testRenameOwnerOfThePet() throws Exception {

    }

    @Test
    public void testRenamePetOfOwner() throws Exception {

    }

    @Test
    public void testDeleteClient() throws Exception {

    }

    @Test
    public void testDeletePet() throws Exception {

    }
}