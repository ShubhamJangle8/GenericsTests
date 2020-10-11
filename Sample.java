import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample<X, Y, Z> {
	X[] xArray;
	Y[] yArray;
	Z[] zArray;
	
	
	public Sample(X[] xArray, Y[] yArray, Z[] zArray) {
		super();
		this.xArray = xArray;
		this.yArray = yArray;
		this.zArray = zArray;
	}

	public static <E> void printArray(E a[]) {
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public void toPrint() {
		printArray(xArray);
		printArray(yArray);
		printArray(zArray);
		
	}
	
	
	public static void main(String[] args) {
		Integer a[] = {1,2,3};
		List<Integer> list1 = Arrays.asList();
		list1.stream().forEach(n -> System.out.println(n));
		List<Integer> list = new ArrayList<>();
		list.add(4);
		for(int i = 0; i< list.size() ; i++) {
			System.out.println(list.get(i));
		}
		Integer a[] = {1,2,3,4};
		Double b[] = {1.0,2.0,3.0};
		Character c[] = {'a','b','c','d'};
		new Sample<Integer, Double, Character>(a, b, c).toPrint();
		
	}
}
