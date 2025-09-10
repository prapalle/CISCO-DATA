/*package FileHandling;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
public class handlingFile {
	
@Test
public void fileCreation() throws IOException {
	File f=new File("createfile.txt");
	
	if(f.createNewFile()) {
		System.out.println("File created and Name is "+f.getName());
	}else {
		System.out.println("File already created");
	}
	
	
}
}*/
package FileHandling;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
public class handlingFile {
	
@Test
public void fileCreation() throws IOException {
	File f1=new File("createfile1.doc");
	
	if(f1.createNewFile()) {
		System.out.println("File created and Name is "+f1.getName());
		System.out.println(f1.getAbsolutePath());
		System.out.println("Can Write on file "+f1.canWrite());
		System.out.println("Can Read this file "+f1.canRead());
		
	}else {
		System.out.println("File already created");
	}
	
	
}
}
