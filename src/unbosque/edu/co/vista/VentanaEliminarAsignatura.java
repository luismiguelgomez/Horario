/**
 * 
 */
package unbosque.edu.co.vista;

import java.awt.BorderLayout;  
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author gomez
 *
 */
public class VentanaEliminarAsignatura extends JFrame implements ActionListener{
	
	JButton botonCancelar;
	JButton btnEliminarAsignatura;
	private JComboBox combo;
	private JLabel mensaje;
	private String [][] datosVentanaEliminar;
	private String [] nombreAsignaturas;
	private int contadorNombre;
	
	/**
	 * <h1>Método constructor de VentanaEliminarAsignatura</h1>
	 * <pre>necesita tres parametros:<br>
	 * 1. String [][]<br>
	 * 2. String[] <br>
	 * 3. int 
	 * </pre>
	 * <post>
	 * Mostrar una ventana con un JComboBox que permite eliminar las asignaturas por su nombre
	 * </post>
	 * @param datos matriz utilizada para pintar datos de la clase Table
	 * @param asignaturas String[] de nombres de la materia
	 * @param pcontadorNombre entero para ir contando nombres y asi guardarlos con orden
	 */
	public VentanaEliminarAsignatura(String [][] datos, String[] asignaturas, int pcontadorNombre) {
		asignaturas[0] = "Asignaturas a eliminar:";
		combo = new JComboBox(asignaturas);
		nombreAsignaturas = asignaturas;
		datosVentanaEliminar = datos;
		contadorNombre = pcontadorNombre;
//		actualizarMaterias();
		//Componentes basicos de mi Jframe
		setSize(600,300);
		setTitle("Eliminar asignatura");
		setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.white);
		menuEliminacion();
		iniciarComponentes();
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * <h1>Busca los datos de la matriz y los elimina</h1>
	 * <pre> Matriz de datosVentanaEliminar y 
	 * seleccionar en el JComboBox </pre>
	 * <post>
	 * 1. Eliminar en la matriz datosVentanaEliminar la asignatura selecionada en el JComboBox
	 * 2. Eliminar a nombreAsignaturas el valor de la asignatura
	 * 3. contador nombre restarte una unidad
	 * 
	 * <h3>Para que asi en la tabla se elimine el nombre de la asignatura
	 * y en VentanaEliminarAsignatura no aparezca el el JCombobox el nombre de la materia eliminado
	 * </h3>
	 */
	private void eliminarAsignarura() {
		Object eliminarDato = "";
		if (combo.getSelectedItem() != null) {
			eliminarDato = combo.getSelectedItem();
		}
		
		for (int i = 0; i < datosVentanaEliminar.length; i++) {
			for (int j = 0; j < datosVentanaEliminar.length; j++) {
				if (datosVentanaEliminar[i][j].equals(eliminarDato)) {
					datosVentanaEliminar[i][j] = "";
				}
			}
		}
		
		nombreAsignaturas[contadorNombre] = "";
		contadorNombre = contadorNombre - 1;
	}

	/**
	 * <pre>LLlamar este metodo desde el constructor</pre>
	 * <post>Inicia el panel, agrega el boton cancelar, agrega el boton eliminar asginatura</post>
	 */
	private void iniciarComponentes() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(350,150,5,5);
		botonCancelar.setSize(150,100);
		botonCancelar.addActionListener(this);
		add(botonCancelar);
		
		btnEliminarAsignatura = new JButton("Eliminar asignatura");
		btnEliminarAsignatura.setBounds(100,150,70,70);
		btnEliminarAsignatura.setSize(150,100);
		btnEliminarAsignatura.addActionListener(this);
		add(btnEliminarAsignatura);
		
		
//		panel.add(botonCancelar, BorderLayout.SOUTH);
//		panel.add(btnEliminarAsignatura, BorderLayout.SOUTH);
        add (combo);
        add (mensaje);

		
		this.getContentPane().add(panel);
	}

	/**
	 * Acciones del botonCancelar y acciones del btnEliminarAsignatura
	 * <pre>Estar creado el botonCancelar, estar creado el btnEliminarAsignatura y 
	 * tener los parametros de la clase Tabla </pre>
	 * <post>Tener acciones para los botones </post>
	 */
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==botonCancelar) {
        	setVisible(false);
        	Tabla claseTabla = new Tabla(datosVentanaEliminar, nombreAsignaturas, contadorNombre);
        }
        
        if (e.getSource()==btnEliminarAsignatura) {
        	eliminarAsignarura();
        	setVisible(false);
        	Tabla claseTabla = new Tabla(datosVentanaEliminar, nombreAsignaturas, contadorNombre);
		}
    }
	
	/**
	 * Contiene el JLabel que hace referencia a la instrución de la materia que se desea eliminar
	 */
	private void menuEliminacion () {
        mensaje = new JLabel();
		mensaje.setBounds(5, 40, 350, 20);
		mensaje.setText("Seleccione la asignatura que desea eliminar" );
//		combo = new JComboBox(nombreAsignaturas);
		combo.setBounds(380, 40, 160, 20);
	}
	
}
