
public class Test {
	public static void main(String[] args) {
		int outer = 3;
		for(int i=0; i < 5; i++){
		int local = i + outer; // outer is accessible here
		System.out.println(local);
		}
		// outer is still accessible here.
		System.out.println(outer); // 3 4 5 6 7 3
		}
}