package Chapter2;

class NumberTypes{
	public static void main(String[] args){
		System.out.println();
		int x = 2 * 5 + 3 * 4 - 8;
		System.out.println("Value for 2 * 5 + 3 * 4 - 8 = " + x);
		
		int x1 = 2 * ((5 + 3) * 4 - 8);
		System.out.println("Value for 2 * ((5 + 3) * 4 - 8) = " + x1);
		System.out.println();
		
		System.out.println("9 / 3 = " + 9/3);
		System.out.println("9 % 3 = " + 9%3);
		
		System.out.println("10 / 3 = " + 9/3);
		System.out.println("10 % 3 = " + 9%3);
		
		System.out.println("11 / 3 = " + 9/3);
		System.out.println("11 % 3 = " + 9%3);
		
		System.out.println("12 / 3 = " + 9/3);
		System.out.println("12 % 3 = " + 9%3);
		
		System.out.println();
		
		int x2 = 1;
		long y = 33;
		System.out.println(x2 * y);
		System.out.println();
		
		boolean x3 = false;
		System.out.println(x3);
		x3 = !x3;
		System.out.println(x3);
		System.out.println();
		
		double x4 = 1.21;
		System.out.println(x4);
		x4 = -x4;
		System.out.println(x4);
		x4 = -x4;
		System.out.println(x4);
		System.out.println();
		
		System.out.println("Increment and Decrement Operstors");
		System.out.println();
		
		int counter = 0;
		System.out.println(counter);
		System.out.println(++counter);
		System.out.println(counter);
		System.out.println(counter--);
		System.out.println(counter);
		System.out.println();
		
		int x5 = 3;
		int y1 = ++x5 * 5 / x5-- + --x5;
		System.out.println("Whats x5 and y1 in the following: y1 = ++x5 * 5 / x5-- + --x5 where x5 = 3"); // x5 = 2 and y1 = 7
		System.out.println("x5 is " + x5);
		System.out.println("y1 is " + y1);
		System.out.println();
		
		
	}
}