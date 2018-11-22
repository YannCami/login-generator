package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    private LoginService loginService;
    private LoginGenerator loginGenerator;

    @Before
    public void setup() {
        loginService = new LoginService(new String[]{"JROL", "DPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
        loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertTrue("The loginService should now contain the login PDUR", loginService.loginExists("PDUR"));

        //CT1
        loginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        assertTrue("The loginService should now contain the login JRAL2", loginService.loginExists("JRAL2"));

        //CT2
        loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertTrue("The loginService should now contain the login JROL1", loginService.loginExists("JROL1"));

        //CT3
        loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertTrue("The loginService should now contain the login PDUR", loginService.loginExists("PDUR"));
    }

}