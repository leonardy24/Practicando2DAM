
public class practica1 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 101; i++) {
			
			if(i % 3==0) {
				
				System.out.println("fizz");
				
			}
			
			else if(i % 5== 0) {
				
				System.out.println("buzz");
			}
			
			else if(i% 3 == 0 && i % 5 ==0) {
				
				System.out.println("fizzbuzz");
			}
			
			
		}

	}

}
