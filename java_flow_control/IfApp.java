
public class IfApp {

	public static void main(String[] args) {
		
		System.out.println("a");
		
//		if(false) {
//			System.out.println(1);
//			
//		} else {
//			if (true) {
//				System.out.println(2);
//			} else {
//				System.out.println(2);
//			}	
//		}
		
		//위의 코드와 아래의 코드는 같다
		
		if(false) {
			System.out.println(1);
			
		} 
		else if(true) {
			System.out.println(2);
			
		} 
		else {
			System.out.println(3);
		}
		
		System.out.println("b");

	}

}
