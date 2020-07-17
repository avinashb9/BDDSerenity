package project.utilities;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GenericUtils {
	
	public static String decode(String value){
		byte[] decodedValue = null;
		decodedValue = Base64.getDecoder().decode(value);
		return new String(decodedValue,StandardCharsets.UTF_8);
	}

}
