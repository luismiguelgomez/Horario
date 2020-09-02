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
	/**
	 * 
	 */
	public RecibidorDatos(String [][] datos) {
		datosTabla = datos;
		Tabla claseTabla = new Tabla(datosTabla);
	}

}
