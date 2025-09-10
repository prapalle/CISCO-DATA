package Collections;
import java.util.ArrayList;
public class ArrayListExamplejava {
	public static void main(String[] args) {
		
ArrayList<String> topics=new ArrayList<String>();
//add values
topics.add("Java");
topics.add("Selenium");
topics.add("JDBC");
topics.add("HTML");
		System.out.println(topics);
		
		//insert a value
		topics.add(0, "JavaScript");		
		System.out.println(topics);
		
		
		System.out.println(topics.get(2));
		
		//update a value
		topics.set(2, "API");
		System.out.println(topics);
		
		//remove a value
		topics.remove(3);
		System.out.println(topics);
	}
}
