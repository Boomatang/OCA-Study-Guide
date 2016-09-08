package Chapter2;

class IfThen{
	public static void main(String args[]){
		int hourOfDay = Integer.parseInt(args[0]);
		int morningGreetingCount = 0;
		
		if(hourOfDay < 11)
			System.out.println("Good Morning");
	
		if (hourOfDay < 11){
			System.out.println("Good Morning");
			morningGreetingCount++;
		} 
		
		if (hourOfDay < 11){
			System.out.println("Good Morning");
		} else if (hourOfDay < 15){
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
		
		System.out.println("Ternary Operator, Check it out");
		int y = 10;
		final int x;
		if (y>5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		
		int y1 = 10;
		int x1 = (y1 > 5) ? (2 * y1) : (3 * y1);
		
		int dayOfWeek = 5;
		switch(dayOfWeek) {
			default:
				System.out.println("Weekday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
		
	}
}