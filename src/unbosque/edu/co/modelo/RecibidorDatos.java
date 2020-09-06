/**
 * 
 */
package unbosque.edu.co.modelo;

import unbosque.edu.co.vista.Tabla;

/**
 * @author gomez
 *
 */
public class RecibidorDatos {

	private String [][] datosTabla;
	private String [] nombreMaterias;
	private int contador;
	
	/**
	 * <h1>Clase intermediara entre las ventanas de eliminar y agregar y la clase Tabla</h1>
	 */
	public RecibidorDatos(String [][] datos, String[] nombreAsignatura, int contadorNombre) {
		datosTabla = datos;
		nombreMaterias = nombreAsignatura;
		contador = contadorNombre;
		Tabla claseTabla = new Tabla(datosTabla, nombreMaterias, contador);
	}

}
