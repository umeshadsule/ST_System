package RemoveIntValueFromList;

import java.util.ArrayList;
import java.util.List;

public class RemoveInt {

	public static void main(String[] args) {
		List<Object> al=new ArrayList();
		al.add("Umesh");
		al.add(10);
		al.add(10.20);
		
		al.removeAll(al);
		al.add(10);
		System.out.println(al);

	}

}
