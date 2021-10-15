class Jugador{
	private int numUniforme;
	private String nombre;
	private int puntosAnotados;
	private String posicion;
	private float estatura;
	
	public void setJugador(int numUniforme, String nombre, int puntosAnotados, String posicion, float estatura){
		this.numUniforme = numUniforme;
		this.nombre = nombre;
		this.puntosAnotados = puntosAnotados;
		this.posicion = posicion;
		this.estatura = estatura;
	}
	
	public int getNumUniforme(){
		return numUniforme;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getPuntosAnotados(){
		return puntosAnotados;
	}
}


