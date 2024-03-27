package ma.zs.univ.integration.core.commun.ville;

import com.intuit.karate.junit5.Karate;

public class VilleIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("VilleHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
