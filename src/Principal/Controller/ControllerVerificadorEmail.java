package Principal.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerVerificadorEmail {
    
    public static boolean verificaEmail(String sEmail) {

        boolean bValid = false;

        if (sEmail != null && sEmail.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(sEmail);
            if (matcher.matches()) {
                bValid = true;
            }
        }
        return bValid;
    }
}
