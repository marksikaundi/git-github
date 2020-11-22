package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 20, 30, 40, 50};
		System.out.println( a[2] + " " + a[4]);
		// enhanced for
		for(int temp : a) {
			System.out.println(temp);
		}

	}

}
