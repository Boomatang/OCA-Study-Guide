package Chapter2;

class EatCheese {
	
	public static void eatCheese(int bitesOfCheese) {
		int roomInBelly = 5;
		while (bitesOfCheese > 0 && roomInBelly > 0){
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese + " pieces of cheese left.");
	}
	
	public static void main(String[] agrs){
		EatCheese.eatCheese(10);
	}
}