import java.util.HashSet;
import java.util.Arrays;
public class ConvertHash{
	
	public static void main(String[] args){
		HashSet<String> items = new HashSet<String>(Arrays.asList("Shinji", "Asuka", "Rei", "Misato"));
		String arr[] = new String[items.size()];
		System.out.println("Original HashSet: \n" + items + "\n");
		items.toArray(arr);
		System.out.println("Array Created.");
		for (String ele:arr){
			System.out.println(ele);
		}
	}
}
