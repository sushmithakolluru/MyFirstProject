import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub

		 JSONParser parser = new JSONParser();
		 Object obj = parser.parse(new FileReader ("C:\\Basic Java\\lib\\json-simple-1.1.jar"));
	}

}
