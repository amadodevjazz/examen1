
public class Main {
	public static void main(String[] args) {
		
		Ganador jugador = new Ganador();
		System.out.println(jugador.calcularGanador(6,3));
		System.out.println(jugador.calcularGanador(2,5));
		System.out.println(jugador.calcularGanador(1,6));
		System.out.println(jugador.calcularCampeon());
	}

}
