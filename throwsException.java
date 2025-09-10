package Exceptions;
import java.io.IOException;
public class throwsException {
	public static void main(String[] args) {
	
		try {
			getFile(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	
	public static void getFile(String filename) throws IOException {
		if(filename==null) {
			throw new IOException("No file");
		}
		System.out.println("File is available");
	}
	
	
	
}
