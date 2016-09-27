package three;

public class App {
/**
 * 
 * Print the value of variable called same which will be either true or false.
 * 
 *  == is used to test object references that compares the memory address
 * .equals() is used to tests the string values.
 *  == is actually comparing the memory address
 *  
 * http://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
 * @param args
 */
	public static void main(String[] args) {
		boolean same;
		String S1 = "app";
		String S2 = "app";
		
		same = (S1 == S2);
		System.out.println(same);	
		
		S2 = new String("app");
		
		same = (S1 == S2);
		System.out.println(same);
		
		same = (S1.equals(S2));
		System.out.println(same);
	}

}
