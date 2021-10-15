class LigaBaloncesto{
	public static void main(String args[]){
		Torneo spacejam = new Torneo();
		
		System.out.println("Ingrese informacion del torneo.");
		spacejam.setTorneo(CapturaEntrada.capturarString("Nombre del torneo"),
							 CapturaEntrada.capturarString("Region"),
							 CapturaEntrada.capturarEntero("Total de equipos"),
							 CapturaEntrada.capturarEntero("Partidos jugados"),
							 CapturaEntrada.capturarEntero("Partidos pendientes"));
		System.out.println("\n");
		
		//se invoca al método que agrega informacion de los equipos
		//mismo método a su vez invoca un método de la clase Equipo que agrega informacion de los jugadores
		spacejam.agregarEquipos();
		
		//mostrar informacion del torneo
		System.out.println("");
		System.out.println("<<<INFORMACION DEL TORNEO.>>>");
		System.out.println("Nombre del torneo: "+ spacejam.getNombreTorneo()); 
		System.out.println("Region: " + spacejam.getRegion());
		System.out.println("Total de equipos: " + spacejam.getNumEquipos());
		System.out.println("Partidos jugados: " + spacejam.getPartidosJugados());
		System.out.println("Partidos pendientes: " + spacejam.getPartidosPendientes());
		System.out.println("\n");
		//mostrar informacion de los equipos
		//se invoca el método imprimeEquipos de la clase Torneo
		spacejam.imprimeEquipos();
		
		
		
		
	}
}