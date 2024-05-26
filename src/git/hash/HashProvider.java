package git.hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashProvider {
    public static String hash(String fileContents){
        return sha1("blob %d\0%s".formatted(fileContents.length(), fileContents));
    }

    private static String sha1(String fileContents) {
        try {
            var digest = MessageDigest.getInstance("SHA-1");
            digest.reset();

            digest.update(fileContents.getBytes(StandardCharsets.UTF_8));

            var digested = digest.digest();
            StringBuilder result = new StringBuilder();
            for(var x : digested){
                result.append(String.format("%02x", x));
            }

            return result.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
