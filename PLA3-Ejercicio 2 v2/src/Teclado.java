import java.util.Arrays;
import java.util.Scanner;

public class Teclado implements IJugada {
	public Teclado() {
	}
	@Override
	public String pedirJugada(String[] validas) {
		Scanner entrada = new Scanner(System.in);
		String jugada;
		do {
			System.out.println("Introduzca la jugada");
			jugada=entrada.nextLine();
		} while(!Arrays.asList(validas).contains(jugada));
		entrada.close();
		return jugada;
	}
}