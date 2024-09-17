
public class practica2 {

	public static void main(String[] args) {
		
		
 			String palabraAlreves= cambio("Hola mundo");
		
			System.out.print(palabraAlreves);
			
			
	}

	
	public static String cambio(String palabra) {
		
		String palabraAlreve="";
		
		for (int i = palabra.length(); i > 0; i--) {
			
			char letra = palabra.charAt(i-1);
			
			palabraAlreve += letra;
			
		}
		
		
		return  palabraAlreve;
		
		
	}
	
	
}
