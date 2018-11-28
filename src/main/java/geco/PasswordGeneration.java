package geco;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Cette classe permet de générer des mots de passe aléatoires
 * de 8 caractères de long.
 */
public class PasswordGeneration {

    private static final int LENGTH_OF_PASSWORD = 8;
    private static final int NUMBER_OF_CHAR = 62;
    private static final String ALL_CHAR =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /**
     * Génère un mot de passe aléatoire de 8 caractères.
     * @return Un String correspondant au mot de passe
     */
    public final String getRandomPassword() {
        StringBuilder pwd = new StringBuilder();
        for (int i = 0; i < LENGTH_OF_PASSWORD; ++i) {
            int randomNum = ThreadLocalRandom.current()
                    .nextInt(0, NUMBER_OF_CHAR + 1);
            pwd.append(ALL_CHAR.charAt(randomNum));
        }
        return pwd.toString();
    }
}
