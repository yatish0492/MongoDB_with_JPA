import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String[] a = {"a","b"};
		List<String> b  = new ArrayList<String>();
		b.add("a");
		b.add("b");
		String[] c = b.toArray(new String[0]);
		for (String pop :c) {
            System.out.println(pop);
        }
		

	}

}
