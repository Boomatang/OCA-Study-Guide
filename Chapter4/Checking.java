package Chapter4;

class Checking{
	public static void check(){
		System.out.println("Checking 1");
	}

	public static void check(int num){
		check();
		System.out.println("checking " + num);
	}

	public static void main(String[] args){
		check(88);
	}
}
