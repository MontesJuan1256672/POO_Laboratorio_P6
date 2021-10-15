import java.util.Arrays;

class Equipo{
	private final int x = 10;//jugadores
	private String nombreEquipo;
	private String division;
	private String nombreEntrenador;
	private int torneosParticipados;
	private int torneosGanados;
	private int torneosPerdidos;
	//declaración de arreglo de objetos tipo Jugador
	Jugador players[] = new Jugador[x];
	
	public void setEquipo(String nombreEquipo, String division, String nombreEntrenador, int torneosParticipados, int torneosGanados, int torneosPerdidos){
		this.nombreEquipo = nombreEquipo;
		this.division = division;
		this. nombreEntrenador = nombreEntrenador;
		this.torneosParticipados = torneosParticipados;
		this.torneosGanados = torneosGanados;
		this.torneosPerdidos = torneosPerdidos;
	}
	
	public void agregarJugadores(){
		System.out.println("Informacion de los jugadores");
		for(int i = 0; i < x; i++){
			System.out.println("Jugador " + (i+1) + ":");
			//agrega un elemento más a la copia del arreglo
			players[i] = new Jugador();
			
			//inicializa los atributos de la clase Jugador
			players[i].setJugador(CapturaEntrada.capturarEntero("Numero de uniforme"),
								  CapturaEntrada.capturarString("Nombre"),
								  CapturaEntrada.capturarEntero("Puntos anotados"),
								  CapturaEntrada.capturarString("Posicion"),
								  CapturaEntrada.capturarFloat("Estatura"));
			System.out.println("\n");
		}
	}
	
	//método que imprime informacion de los jugadores
	public void imprimeJugadores(){
		System.out.println("***<<<JUGADORES>>>***:");
		for(int i = 0; i < x; i++){
			System.out.println("Nombre del jugadore:" + players[i].getNombre());
			System.out.println("Numero de uniforme: " + players[i].getNumUniforme());
			System.out.println("Numero de jugadores: " + getCantidadJugadores());
			System.out.println("Puntos anotados por jugadore: " + getPuntosTotales());
			System.out.println("\n");				   
		}
	}
	
	//Devolver la cantidad de jugadores registrados en el equipo
	public int getCantidadJugadores(){
		return players.length;
	}
	
	//Devolver la suma de los puntos totales anotados por los jugadores
	public int getPuntosTotales(){
		int contador = 0;
		
		for (int i = 0; i < players.length; i++){
			contador += players[i].getPuntosAnotados();
		}
		return contador;
	}
	
	public String getNombreEquipo(){
		return nombreEquipo;
	}
	
	public String getDivision(){
		return division;
	}
	
	
}
