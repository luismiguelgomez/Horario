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
	private String [] cabecera = {"", "LUNES", "MARTES", "MIERCOLES", "JUEVES" , "VIERNES", "SABADO"};
	private String [][] datos = 
		{{"7AM", "", "", "", "" , "", " "},
		{"9AM", "", "", "", "" , "", " "},
		{"11AM", "", "", "", "" , "", " "},
		{"1PM", "", "", "", "" , "", " "},
		{"3PM", "", "", "", "" , "", " "},
		{"5PM", "", "", "", "" , "", " "},
		{"7PM", "", "", "", "" , "", " "},};
	
	JButton botonAgregar;
	JButton botonBorrar;
	
	
	public Tabla() {
		ventana = new JFrame("Tablas");
		ventana.setLayout(new FlowLayout());
		ventana.setSize(700, 250);
		ventana.setLocationRelativeTo(null);
		set_Tabla();
		botonsAceptarCancelar();
		ventana.add (botonAgregar);
		ventana.add (botonBorrar);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
	
	public void set_Tabla() {
		tabla = new JTable(datos, cabecera);
		JScrollPane JS = new JScrollPane(tabla);
		JS.setPreferredSize(new Dimension(600,135));
		ventana.add(JS);
	}
	
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

	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() == botonAgregar) {
			VentanaAgregarAsignatura ventanaAgregarAsignatura = new VentanaAgregarAsignatura();
		}
		if (ev.getSource() == botonBorrar) {
			VentanaEliminarAsignatura ventanaEliminarAsignatura = new VentanaEliminarAsignatura();
		}
		
	}
	
	

}