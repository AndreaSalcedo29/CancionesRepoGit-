package Canciones;
/**
 * Clase que muestra la reproducci�n de diferentes canciones
 * @author andre
 * @version 2.1
 * @see Cancion
 *
 */
public class PruebaCancion {
	public static void main(String[] args) {
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don�t Stop Believin�", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion("y soy rebelde�", "rebelde", 310, false);
		Cancion quintaCancion = new Cancion("5 minutos�", "mana", 317, false);
		
		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "est� sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canci�n");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}

/**
 * metodo con 2 parametros, para mostrar la siguiente cancion que se va a reproducir de la lista
 * @param miCancion
 * @param canciones
 */
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canci�n que sonar� despu�s de " + miCancion.getTitulo() + " ser� "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

/**
 * muestra cual es la cancion m�s larga
 * @param canciones
 */
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canci�n m�s larga es: " + Cancion.MayorDuracion(canciones));
	}

/**
 * recorre las canciones que hay y las muestra 
 * utiliza un solo parametro que recorre
 * @param canciones
 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canci�n es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	

}
