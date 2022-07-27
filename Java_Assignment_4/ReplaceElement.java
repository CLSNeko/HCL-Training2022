import java.util.LinkedList;
import java.util.Arrays;
public class ReplaceElement {
	
	public static void main(String[] args){
		LinkedList<String> items = new LinkedList<String>(Arrays.asList("Shinji", "Asuka", "Rei", "Misato"));
		System.out.println("Before Replacement: \n" + items + "\n");
		items.set(2, "Kaworu");
		System.out.println("After Replacement: \n" + items + "\n");
	}
}
