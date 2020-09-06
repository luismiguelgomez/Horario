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
	 * @param datos Matriz utilizada para guardar las materias e incribirlas en la Tabla
	 * @param nombreAsignatura Guarda los nombres de las materias en una matriz unidimensional 
	 * @param contadorNombre entero que se encarga de contar los nombres
	 */
	public RecibidorDatos(String [][] datos, String[] nombreAsignatura, int contadorNombre) {
		datosTabla = datos;
		nombreMaterias = nombreAsignatura;
		contador = contadorNombre;
		Tabla claseTabla = new Tabla(datosTabla, nombreMaterias, contador);
	}

}
