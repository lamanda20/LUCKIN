package ma.zs.univ.integration.core.commun.societe;

import com.intuit.karate.junit5.Karate;

public class SocieteIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("SocieteHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
