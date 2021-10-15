class Torneo{
	private final int x = 5;//equipos
	private String nombreTorneo;
	private String region;
	private int numEquipos;
	private int partidosJugados;
	private int partidosPendientes;
	
	Equipo teams[] = new Equipo[x];
	
	//método que inicializa los atributos de la clase
	public void setTorneo(String nombreTorneo, String region, int numEquipos, int partidosJugados, int partidosPendientes){
		this.nombreTorneo = nombreTorneo;
		this.region = region;
		this.numEquipos = numEquipos;
		this.partidosJugados = partidosJugados;
		this.partidosPendientes = partidosPendientes;
	}
	
	public void agregarEquipos(){
		System.out.println("Informacion de los equipos");
		for(int i = 0; i < x; i++){
			System.out.println("Equiopo " + (i+1) + ":");
			//agrega un elemento más a la copia del arreglo
			teams[i] = new Equipo();
			
			//inicializa los atributos de la clase Jugador
			teams[i].setEquipo(CapturaEntrada.capturarString("Nombre del equipo"),// nombreEquipo
							   CapturaEntrada.capturarString("Division"),//division
							   CapturaEntrada.capturarString("Nombre del entrenador"),//nombreEntrenador
							   CapturaEntrada.capturarEntero("Torneos con participacio"),//torneosParticipados
							   CapturaEntrada.capturarEntero("Torneos ganados"),//torneosGanados
							   CapturaEntrada.capturarEntero("Torneos perdidos"));//torneosPerdidos
			System.out.println("\n");
			
			//se invoca el método que agrega información de los jugadores
			teams[i].agregarJugadores();
		}
	}
	
	public void imprimeEquipos(){
		for(int i = 0; i < x; i++){
			System.out.println("***<<<EQUIPO>>>***:");
			System.out.println("Nombre del equipo:" + teams[i].getNombreEquipo());
			System.out.println("Division: " + teams[i].getDivision());
			System.out.println("\n");
			//mostrar informacion de los jugadores
			//se invoca método de la clase equipos
			teams[i].imprimeJugadores();
			System.out.println("\n");				   
		}
	}
	
	//getters de los atributos de la clase
	public String getNombreTorneo(){
		return nombreTorneo;
	}
	
	public String getRegion(){
		return region;
	}
	
	public int getNumEquipos(){
		return numEquipos;
	}
	
	public int getPartidosJugados(){
		return partidosJugados;
	}
	
	public int getPartidosPendientes(){
		return partidosPendientes;
	}
}

