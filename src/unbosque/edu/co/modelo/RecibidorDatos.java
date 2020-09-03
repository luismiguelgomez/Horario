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
	 * 
	 */
	public RecibidorDatos(String [][] datos, String[] nombreAsignatura, int contadorNombre) {
		datosTabla = datos;
		nombreMaterias = nombreAsignatura;
		contador = contadorNombre;
		Tabla claseTabla = new Tabla(datosTabla, nombreMaterias, contador);
	}

}
