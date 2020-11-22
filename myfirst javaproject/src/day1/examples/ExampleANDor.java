package day1.examples;

public class ExampleANDor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 10;
		y = -10;
		if(x > 0 && y > 0) {
			System.out.println("both numbers are positive");
		}else if(x > 0 || y > 0 ) {
			System.out.println("atleast one number is positive");
		}else {
			System.out.println("both numbers are negative");
		}
	}


}
