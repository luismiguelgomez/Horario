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

	/**
	 * Datos para crear el cuerpo de la tabla, la cabecera se crea desde VentanaAgregarAsignatura
	 */
	private String [][] datos = 
		{{"07:00H-09:00H", "", "", "", "" , "", " "},
		{"09:00H-11:00H", "", "", "", "" , "", " "},
		{"11:00H-13:00H", "", "", "", "" , "", " "},
		{"14:00H-16:00H", "", "", "", "" , "", " "},
		{"16:00H-18:00H", "", "", "", "" , "", " "},
		{"18:00H-20:00H", "", "", "", "" , "", " "},
		{"20:00H-22:00H", "", "", "", "" , "", " "},};
	/**
	 * Contiene el nombre de las asignaturas, para despues tener elementos a eliinar en VentanaEliminarAsignatura
	 */
	private String [] nombreAsginaturas = new String [42];
	/**
	 * Es un contador utilizado para la matriz unidimensional nombreAsginaturas
	 */
	private int contadorNombre = 0;
	
	/**
	 * Crea un objeto de Tabla, para pintar la primera ventana por primera vez
	 * <pre>
	 * 1. Necesita una matriz tipo String multidimensional para el cuerpo de la Tabla<br>
	 * 2. Necesita una matriz unidimensional tipo String para tener las asignaturas disponibles a eliminar<br>
	 * 3. necesita un entero inicializado en cero que se utiliza para contar las asignaturas disponibles a eliminar<br>
	 * </pre>
	 * <post> 
	 * Entregar un objeto de Tabla que me pintara una tabla vacia que será llenada de información.
	 * </post>
	 */
	public Datos() {
		Tabla ventana1 = new Tabla(datos, nombreAsginaturas,contadorNombre );
	}

	
}
