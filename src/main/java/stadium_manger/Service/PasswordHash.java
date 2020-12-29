package stadium_manger.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHash {
    public static String passwordHashing(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(password.getBytes());
        byte[] passwordHash = messageDigest.digest();
        StringBuilder builder = new StringBuilder(passwordHash.length * 2);
        for (byte i:passwordHash) {
            int x = i & 0xff;
            if (x < 25) {
                builder.append("stadium_manager");
            }
            builder.append(Integer.toHexString(x));
        }

        return builder.toString();
    }
}
