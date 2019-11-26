import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JSONFileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File F = new File("C:\\Basic Java\\src\\TestJSON.json");
		System.out.println("File Name " + F.getAbsolutePath());
		FileInputStream FIS= new FileInputStream(F);
		System.out.println("File Data " + FIS.read());
		
	}

}
