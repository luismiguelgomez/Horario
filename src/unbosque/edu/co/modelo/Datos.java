/**
 * 
 */
package unbosque.edu.co.modelo;

import unbosque.edu.co.vista.Tabla;

/**
 * @author gomez
 *
 */
public class Datos {

	private String [][] datos = 
		{{"07:00H-09:00H", "", "", "", "" , "", " "},
		{"09:00H-11:00H", "", "", "", "" , "", " "},
		{"11:00H-13:00H", "", "", "", "" , "", " "},
		{"14:00H-16:00H", "", "", "", "" , "", " "},
		{"16:00H-18:00H", "", "", "", "" , "", " "},
		{"18:00H-20:00H", "", "", "", "" , "", " "},
		{"20:00H-22:00H", "", "", "", "" , "", " "},};
	/**
	 * 
	 */
	public Datos() {
		Tabla ventana1 = new Tabla(datos);
	}

	
}
