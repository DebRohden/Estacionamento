package Principal.Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ControllerCriptografia {

	public static byte[] criptografa(String senha) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(senha.getBytes());
			return md.digest();
		} catch (NoSuchAlgorithmException e) {
			return null;
		}

	}

	public static String stringHexa(byte[] bytes) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			int parteAlta = ((bytes[i] >> 4) & 0xf) << 4;
			int parteBaixa = bytes[i] & 0xf;
			if (parteAlta == 0) {
				s.append('0');
			}
			s.append(Integer.toHexString(parteAlta | parteBaixa));
		}
		return s.toString();
	}
}
