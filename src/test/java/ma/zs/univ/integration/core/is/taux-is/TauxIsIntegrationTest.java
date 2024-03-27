package ma.zs.univ.integration.core.is.taux-is;

import com.intuit.karate.junit5.Karate;

public class TauxIsIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("TauxIsHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
