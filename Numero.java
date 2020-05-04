import java.util.Scanner;

public class Numero {
	
	public static boolean esNumero(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		String cadena = sc.nextLine();
		while(!esNumero(cadena)) {
			System.err.println("no has insertado un numero, prueba de nuevo: ");
			cadena = sc.nextLine();
		}
		int numero=Integer.parseInt(cadena);
		System.out.println(numero+2);		
	}

}
