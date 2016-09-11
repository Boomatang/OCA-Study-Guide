package structure; // package must be first non-comment
import java.util.*; // import must come after package

public class Meerkat { // then comes the class
	double weight; // fields and methods can go in either order
	
	public double getWeight() {
		return weight; 
		}
	
	double height; // another field - they don't need to be together

	public static void main(String[] args) {
		System.out.println("Program has ran");
	}
}



/*
A file can have more than one class
There do not need to be a public class
but can only have one public class
That one public class most have the same name as the file
*/
class Paw { 
	
}
