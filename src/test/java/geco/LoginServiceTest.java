package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    private String[] login;
    private LoginService ls;

    @Before
    public void setup() {
        login = new String[]{"a", "b", "c", "dog", "dinosaur", "winner", "chicken", "dinner", "cat", "zebra"};
        ls = new LoginService(login);
    }


    @Test
    public void testLoginExists() {
        assertTrue("The list should contain the login a", ls.loginExists("a"));
        assertFalse("The list should not contain the login f", ls.loginExists("f"));
    }

    @Test
    public void testAddLogin() {
        ls.addLogin("f");
        assertTrue("The list should now contain the login f", ls.loginExists("f"));
    }

    @Test
    public void testFindAllLoginsStartingWith() {
        List<String> startsWithD = ls.findAllLoginsStartingWith("d");
        List<String> expected = Arrays.asList(new String[]{"dinner", "dinosaur", "dog"});
        assertEquals("The method should return all 3 login starting with d.", expected, startsWithD);
    }

    @Test
    public void testFindAllLogins() {
        List<String> expected = Arrays.asList(login);
        Collections.sort(expected);

        assertEquals("The method should return all login given to the constructor.", expected, ls.findAllLogins());
    }
}