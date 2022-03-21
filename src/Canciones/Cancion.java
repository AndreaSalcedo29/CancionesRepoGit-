package Canciones;

/**
 * Es una clase para crear canciones
 * Los atributos son titulo, grupo,duracion y sonando
 * @author andre
 * @version 2.1
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores

	/**
	 * constructor sin parametros, para inicializar la cancion
	 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
/**
 * constructor con dos parametros
 * @param titulo
 * @param duracion se mide en minutos
 * la cancion no esta sonando
 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
/**
 * constructor con 4 parametros
 * @param titulo
 * @param grupo
 * @param duracion en minutos
 * @param sonando, donde le ponemos true para indicar si se esta reproduciendo
 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
/**
 * metodo para empezar a reproducir la cancion y nos retorna un booleano para saberlo
 * @return, true si esta sonando
 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
/**
 * si la cancion no esta sonando devuelve un false, si la cancion suena devuelve true y la cambia a false
 * @return
 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	/**
	 * Retorna el titulo de la cancion
	 * @return titulo de la cancion
	 */
	// meter métodos get/set/toString()
	public String getTitulo() {
		return titulo;
	}
/**
 * con un parametro
 * modifica el titulo de la cancion
 * @param titulo
 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
/**
 * saber a que grupo pertenece la cancion
 * @return el nombre del grupo
 */
	public String getGrupo() {
		return grupo;
	}
/**
 * modifica el grupo de la cancion
 * @param grupo el nuevo grupo que ha elegido
 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
/**
 * la duracion de la cancion
 * @return en minutos
 */
	public int getDuracion() {
		return duracion;
	}
/**
 * modificar la duracion de la cancion 
 * @param duracion en minutos 
 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
/**
 * Nos indica si la cancion esta sonando o no
 * @return
 */
	public boolean isSonando() {
		return sonando;
	}
/**
 * modifica si la cancion esta sonando y la guarda en el atributo
 * @param sonando, devuelve booleano
 */
	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
/**
 * para comparar dos canciones solo usando dos parametros si son iguales son la misma cancion 
 * @param cancion
 * @return dice si es la misma cancion y si no es si la podra reproducir
 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
/**
 * nos devuelve la cancion de un array la que mas duracion tiene
 * @param canciones
 * @return, la canción de mayor duracion
 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
/**
 * para ver cual es la siguiente cancion en la lista
 * @param canciones
 * @param titulo
 * @return muestra la siguiente cancion que se reproducirá
 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	/**
	 * muestra la cancion con todos sus atributos y si esta sonando o no
	 */
	@Override 
	public String toString() { 
	return "Datos de la canción [titulo=" + titulo + ", autor=" +  grupo + ", duracion=" + duracion + ", sonando=" + sonando 
	+ "]"; 
	}

}
