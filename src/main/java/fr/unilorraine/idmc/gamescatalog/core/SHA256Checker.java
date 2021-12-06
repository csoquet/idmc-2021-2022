package fr.unilorraine.idmc.gamescatalog.core;

import lombok.SneakyThrows;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

public class SHA256Checker implements PasswordChecker {

    @SneakyThrows
    public SHA256Checker(){
        // If this will fail, the app should not boot, it will not work in any case
        MessageDigest.getInstance("SHA-256");
    }

    @SneakyThrows
    // https://www.baeldung.com/java-md5
    public boolean areEqual(String source, String target) {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(target.getBytes());
        byte[] digest = md.digest();
        String targetEnc = DatatypeConverter.printHexBinary(digest).toUpperCase();

        return source.equalsIgnoreCase(targetEnc);
    }
}
