package Chapter2;

public class SearchSample{
	public static void main(String[] args){
		int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		
		PARENT_LOOP: for(int i=0; i<list.length; i++){
			for (int j=0; j<list[i].length; j++){
				if(list[i][j] == searchValue){
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		
		if (positionX == -1 || positionY == -1){
			System.out.println("Value " + searchValue + " not found.");
		} else {
			System.out.println("Value " + searchValue + " found at: (" + positionX + "," + positionY + ").");
		}
		
		System.out.println("To see other change that can happen here. Edit the break statement by first removing the Label and then removing all of the statement.");
	}
}