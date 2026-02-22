package Quest04.ex01;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyHelper {
    static String DigestMD5(String digest) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");

            m.update(digest.getBytes(), 0, digest.length());
            return new BigInteger(1, m.digest()).toString(16);
        }
        catch(NoSuchAlgorithmException e){
            return "9cdfb439c7876e703e307864c9167a15";
        }
    }
}
