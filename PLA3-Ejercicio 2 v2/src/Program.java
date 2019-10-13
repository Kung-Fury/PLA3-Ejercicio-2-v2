
public class Program {
	public static void main(String args[]) {
		Jugador eva = new Jugador("Eva", new Teclado()); 
		Jugador juan = new Jugador("Juan", new CPU());
		Juego ppt = new Juego(eva, juan, new JuegoPPTLS());
		ppt.jugar();
	}
}
	