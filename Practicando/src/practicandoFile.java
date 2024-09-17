import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class practicandoFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el nombre ");

		String nomFichero = sc.nextLine();

		File fichero = new File(nomFichero);
		
		try {
			
			System.out.println((fichero.createNewFile()?"fichero creado":"fichero ya existe"));
			
			
			System.out.println("escribi en el fichero:");
			
			String escribir = sc.nextLine();
			
			FileWriter escribiendo = new FileWriter(fichero);
			
			escribiendo.write(escribir);
			
			escribiendo.close();
			
			BufferedWriter leer = new BufferedWriter(escribiendo);
			
			
			
			//AHORA LEEMOS LO QUE TENEMOS EN EL FICHERO
			
			FileReader leyendo= new FileReader(fichero);
			
			BufferedReader lee = new BufferedReader(leyendo);
			
			String byteee;
			while((byteee = lee.readLine()) != null) {
				System.out.println(byteee);
			}
			
			leyendo.close();
			lee.close();
			
		} catch (Exception e) {
			System.out.println("error al crear el archivo");
		}

	}

}
