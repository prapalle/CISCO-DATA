/*package OOPS;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;
public class fileWriteExample {
	
	
	@Test
	public void writefile() throws IOException {
		
		FileWriter fw=new FileWriter("createfile1.txt");
		fw.write("Hello, This is File Writer 1");
		fw.write("Hello, This is File Writer 2");
		fw.write("Hello, This is File Writer 3");
		fw.write("Hello, This is File Writer 4");
		
		
		
		fw.close();
	}
}*/

//write and read data
/*package OOPS;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;
public class fileWriteExample {
	
	
	@Test
	public void writefile() throws IOException {
		
		FileWriter fw=new FileWriter("createfile1.txt");
		fw.write("Hello, This is File Writer 1");
		fw.write("Hello, This is File Writer 2");
		fw.write("Hello, This is File Writer 3");
		fw.write("Hello, This is File Writer 4");
		
		
		
		fw.close();
	}
}*/

package OOPS;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.testng.annotations.Test;
public class fileWriteExample {
	
	
	@Test
	public void writefile() throws IOException {
		
		FileWriter fw=new FileWriter("createfile1.txt");
		fw.write("Hello, This is File Writer 21");
		fw.write("Hello, This is File Writer 21");
		fw.write("Hello, This is File Writer 31");
		fw.write("Hello, This is File Writer 41");
		
		
		
		fw.close();
	}
	
	@Test
	public void readFile() throws FileNotFoundException {
		File f=new File("createfile1.txt");
		Scanner data=new Scanner(f);
		
		while(data.hasNextLine()) {
			String st=data.nextLine();
			System.out.println(st);
		}
		
		data.close();
		
		
	}
	
	
	
//Delete File
@Test
	public void deleteFile() {
		File f=new File("createfile.txt");
		
		f.delete();
		
		
	}
}