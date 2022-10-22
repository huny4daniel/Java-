
public class LogicalOperatorApp {

	public static void main(String[] args) {

		System.out.println(1 == 1);
		
		// AND (둘 다 true여야 true)
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		// OR (둘 중에 하나만 true여도 true)
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // false
		System.out.println(false || false); // false
		
		// Not (반대로)
		System.out.println(!true); // false
		System.out.println(!false); // true
		
	}

}
