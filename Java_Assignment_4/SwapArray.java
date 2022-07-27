import java.util.Arrays;
import java.util.ArrayList;
public class SwapArray {

	public static void main(String[] args){
		ArrayList<String> items = new ArrayList<String>(Arrays.asList("Shinji", "Asuka", "Rei", "Misato"));
		String temp = "";
		System.out.println(items+"\n");
		System.out.println("Swapping Elements 0 and 1... \n");
		temp = items.get(0);
		items.set(0, items.get(1));
		items.set(1, temp);
		System.out.println(items);
	}
}
