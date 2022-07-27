import java.util.Arrays;
import java.util.ArrayList;
public class ReverseArray {

	public static void main(String[] args){
		ArrayList<String> items1 = new ArrayList<String>(Arrays.asList("Shinji", "Asuka", "Rei", "Misato"));
		ArrayList<String> items2 = new ArrayList<String>();
		System.out.println(items1+"\n");
		System.out.println("Reversing ArrayList \n");
		for (int i = items1.size()-1; i >= 0; i--) {
			items2.add(items1.get(i));
		}
		System.out.println(items2);
	}
}
