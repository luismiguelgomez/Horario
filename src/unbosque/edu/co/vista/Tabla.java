package unbosque.edu.co.vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabla implements ActionListener{

	public JFrame ventana;
	private JTable tabla;
	/**
	 * Fila de los datos que se utilizara para la cabecera de la Tabla
	 */
	private String [] cabecera = {"", "LUNES", "MARTES", "MIERCOLES", "JUEVES" , "VIERNES", "SABADO"};
	private String [][] datosTabla;
	
	JButton botonAgregar;
	JButton botonBorrar;
	private String [] nombreAs;
	private int contadorNombres;
	
	/**
	 * <h1>Constructor de la clase Tabla</h1>
	 * <pre> Tres parametros, entre los que estan una matriz, una matriz unidimensional y un contador</pre>
	 * <h2>Post-Condiciones: Entregar una tabla con datos provenientes de otras clases, como la clase encargada de eliminar y agregar asignatura</h2>
	 * @param datos matriz que contiene el horario de los datos que utilizare
	 * @param nombreAsignaturas Contendra los nombres de las asignaturas
	 * @param contadorNombre contará cada asignatura nueva que voy a crear, para crear los datos en orden
	 */
	public Tabla(String [][] datos, String [] nombreAsignaturas, int contadorNombre) {
		contadorNombres = contadorNombre;
		nombreAs = nombreAsignaturas;
		datosTabla = datos;
		ventana = new JFrame("Tablas");
		ventana.setLayout(new FlowLayout());
		ventana.setSize(750, 250);
		ventana.setLocationRelativeTo(null);
		set_Tabla();
		botonsAceptarCancelar();
		ventana.add (botonAgregar);
		ventana.add (botonBorrar);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
	
	 /**
	  * Si existen nombres muy largos o se llega a dañar el tamaño predeterminado de la ventana, se crea un scroll
	  */
	public void set_Tabla() {
		tabla = new JTable(datosTabla, cabecera);
		JScrollPane JS = new JScrollPane(tabla);
		JS.setPreferredSize(new Dimension(620,135));
		ventana.add(JS);
	}
	
	/**
	 * Crea los botones de Agregar y Cancelar 
	 * <pre> Tener creado un JButton botonAgregar y JButton botonBorrar</pre>
	 * <post> Crear botones de eliminar y cancelar </post>
	 */
	private void botonsAceptarCancelar() {
		
		//Boton agregar asignatura
		botonAgregar = new JButton();
		botonAgregar.setText("Agregar Asignatura");
		botonAgregar.addActionListener(this);
		
		//Boton borrar asignatura
		botonBorrar = new JButton();
		botonBorrar.setText("Borrar Asignatura");
		botonBorrar.addActionListener(this);
	}
	
	/**
	 * <h1>Funcionalidad de los botones Agregar Asignatura y Borrar Asignatura</h1>
	 * <pre> Tener dos botones : 1. botonAgregar, 2.botonBorrar<br></pre>
	 * <h2>Post condiciones : Entregar objetos de VentanaAgregarAsignatura y  VentanaEliminarAsignatura</h2>
	 */
	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() == botonAgregar) {
			VentanaAgregarAsignatura ventanaAgregarAsignatura = new VentanaAgregarAsignatura(datosTabla, contadorNombres, nombreAs);
			ventana.setVisible(false);
		}
		if (ev.getSource() == botonBorrar) {
			VentanaEliminarAsignatura ventanaEliminarAsignatura = new VentanaEliminarAsignatura(datosTabla, nombreAs, contadorNombres);
			ventana.setVisible(false);
		}
		
	}

}
