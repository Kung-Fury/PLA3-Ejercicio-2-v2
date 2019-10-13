public class Juego {
	private Jugador jugador1;
	private Jugador jugador2;	
	private ILogica _iLogica;
	private IMostrar _iMostrar;
		
	private String[] jugadas;

	
	public String[] getJugadas() {
		return jugadas;
	}
	public void setJugadas(String[] jugadas) {
		this.jugadas = jugadas;
	}
	public Jugador getJugador1() {
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	public Juego(Jugador jugadorA, Jugador jugadorB, ILogica ilogica, IMostrar iMostrar) {
		jugador1 = jugadorA;
		jugador2 = jugadorB;
		_iLogica=ilogica;
		jugadas=_iLogica.validas();
		_iMostrar = iMostrar;
	}
	
	public Juego(Jugador jugadorA, Jugador jugadorB, ILogica ilogica) {
		this(jugadorA, jugadorB, ilogica, new Consola());
		
	}
	
	public void jugar() {
		jugador1.pedirJugada(jugadas);
		jugador2.pedirJugada(jugadas);
		_iMostrar.mostrar(jugador1.getNombre() + " elige " + jugador1.getJugada());
		_iMostrar.mostrar(jugador2.getNombre() + " elige " + jugador2.getJugada());
		int res=_iLogica.comprobar(jugador1.getJugada(), jugador2.getJugada());
			if (res == 1)  
				_iMostrar.mostrar("Gana " + jugador1.getNombre()); 
			if (res == 2) 
				_iMostrar.mostrar("Gana " + jugador2.getNombre()); 
			if (res == 0)
				_iMostrar.mostrar("Empate");
	}
}