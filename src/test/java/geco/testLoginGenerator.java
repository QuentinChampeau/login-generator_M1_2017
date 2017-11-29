package geco;
import geco.LoginService;
import geco.LoginGenerator;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class testLoginGenerator {
    private LoginService loginService = new LoginService(new String[] {"JROL", "BPER",
            "CGUR", "JDUP", "JRAL", "JRAL1"});

    @Test
    public void testGenerateLoginForDurandAndPaul() {
        LoginGenerator logiGenerator = new LoginGenerator(loginService);
        String PDUR = logiGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertThat(PDUR, is("PDUR"));
    }

    @Test
    public void testGenerateLoginForRollingAndJean() {
        LoginGenerator logiGenerator = new LoginGenerator(loginService);
        String JROL = logiGenerator.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertThat(JROL, is("JROL"));
    }

    @Test
    public void testGenerateLoginForDurand2AndPaul() {
        LoginGenerator logiGenerator = new LoginGenerator(loginService);
        String PDUR2 = logiGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertThat(PDUR2, is("PDUR2"));
    }

    @Test
    public void testGenerateLoginForJohnAndRalling() {
        LoginGenerator logiGenerator = new LoginGenerator(loginService);
        String JRAL2 = logiGenerator.generateLoginForNomAndPrenom("John", "Ralling");
        assertThat(JRAL2, is("JRAL2"));
    }

}