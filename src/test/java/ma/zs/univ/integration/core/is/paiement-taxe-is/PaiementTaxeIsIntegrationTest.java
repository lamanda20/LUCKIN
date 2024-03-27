package ma.zs.univ.integration.core.is.paiement-taxe-is;

import com.intuit.karate.junit5.Karate;

public class PaiementTaxeIsIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("PaiementTaxeIsHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
