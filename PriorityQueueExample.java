package Collections;
import java.util.PriorityQueue;
public class PriorityQueueExample {
	
	
	
	public static void main(String[] args) {
		
PriorityQueue<String> q=new PriorityQueue<String>();
		
		q.add("Test1 ");
		q.add("Test3 ");
		q.add("Test2 ");
		q.add("Test4 ");
		q.add("Test5 ");
		q.add("Test6 ");
		
		//System.out.println(q.poll());
		//System.out.println(q.peek());
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
}
