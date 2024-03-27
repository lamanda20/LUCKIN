package ma.zs.univ.service;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;

import java.util.Random;
public class ICEGenerator {

    public static String generateICE() {
        // Format de l'ICE : 15 chiffres
        int length = 15;
        Random random = new Random();
        StringBuilder iceBuilder = new StringBuilder();
        for(int i=0; i < length; i++) {
            iceBuilder.append(random.nextInt(9)); // Ajoute un chiffre aléatoire entre 0 et 9
        }
        return iceBuilder.toString();
    }
}