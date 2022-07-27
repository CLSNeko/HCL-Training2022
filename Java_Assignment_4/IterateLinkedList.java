import java.util.LinkedList;
import java.util.Arrays;
public class IterateLinkedList {

	public static void main(String[] args){
		LinkedList<String> items = new LinkedList<String>(Arrays.asList("Shinji", "Asuka", "Rei", "Misato"));
		iterateLinkedList(items);
	}
	public static void iterateLinkedList(LinkedList<String> list){
		System.out.println("Iterating through linked list given...");
		for (int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}
