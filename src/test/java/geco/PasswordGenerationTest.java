package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {
    private PasswordGeneration pg;


    @Before
    public void setup() {
        pg = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
        String password = pg.getRandomPassword();
        assertEquals("The password should be of length 8.", 8, password.length());
    }
}