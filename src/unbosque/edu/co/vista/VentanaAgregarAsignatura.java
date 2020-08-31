/**
 * 
 */
package unbosque.edu.co.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author gomez
 *
 */
public class VentanaAgregarAsignatura extends JFrame implements ActionListener {

	public JLabel mensaje;
	public JLabel nprofesor;
	public JLabel tColor;
	public JLabel horario;
	public JLabel tHorario;
	public JComboBox<String> color;
	JComboBox<String> menuHorario;
	JTextField nombrecolor;
	JTextField nombreProfesor;
	JCheckBox LUNES;
	JCheckBox MARTES;
	JCheckBox MIERCOLES;
	JCheckBox JUEVES;
	JCheckBox VIERNES;
	JCheckBox SABADO;
	JButton aceptar;
	JButton cancelar;
	
	/**
	 * 
	 */
	public VentanaAgregarAsignatura() {
		setSize(600,500);
		setTitle("Agregar color");
		setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.white);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
	
		inicializarComponentes();
		add (mensaje);
		add (nombrecolor);
		add (nprofesor);
		add (nombreProfesor);
		add (tColor);
		add (color);
		add (menuHorario);
		add (tHorario);
		add (LUNES);
		add (MARTES);
		add (MIERCOLES);
		add (JUEVES);
		add (VIERNES);
		add (SABADO);
		add (aceptar);
		add (cancelar);
		
		paintComponents(getGraphics());
	}
	
	private void inicializarComponentes () {
		
		mensaje = new JLabel();
		mensaje.setText("Nombre de la asignatura");
		mensaje.setBounds(10, 0, 200, 100);
		nprofesor = new JLabel();
		nprofesor.setText("Nombre del profesor:");
		nprofesor.setBounds(10, 30, 250, 100);
		tColor = new JLabel();
		tColor.setText("Asignar un color: ");
		tColor.setBounds(10, 70, 150, 100);
		tHorario = new JLabel();
		tHorario.setText("Elige el horario");
		tHorario.setBounds(10, 110, 150, 100);
		
		
		nombrecolor = new JTextField(30);
		nombrecolor.setBounds(350,30,200,25);
		nombreProfesor = new JTextField(30);
		nombreProfesor.setBounds(350, 70, 200, 25);
		
		String [] colores = {"Seleccione un color", "Rojo", "Azul", "Verde","Amarillo"};
		
		color = new JComboBox(colores);
		color.setBounds(350, 110, 200, 25);
		color.addActionListener(this);
		
		
		//Arreglo de prueba
		String [] horario = {"Seleccione","7AM","9AM","11AM","1PM","3PM","5PM","7PM","9PM"};
		
		menuHorario = new JComboBox (horario);
		menuHorario.setBounds(350, 150, 200, 25);
		menuHorario.addActionListener(this);
		
		//checkbox de dias
		LUNES = new JCheckBox();
		LUNES.setText("LUNES");
		LUNES.setBounds(90,180,120,40);
		
		MARTES = new JCheckBox();
		MARTES.setText("MARTES");
		MARTES.setBounds(230,180,120,40);
		
		MIERCOLES = new JCheckBox();
		MIERCOLES.setText("MIERCOLES");
		MIERCOLES.setBounds(380,180,120,40);
		
		JUEVES = new JCheckBox();
		JUEVES.setText("JUEVES");
		JUEVES.setBounds(90,250,120,40);
		
		VIERNES = new JCheckBox();
		VIERNES.setText("VIERNES");
		VIERNES.setBounds(230,250,120,40);
		
		SABADO = new JCheckBox();
		SABADO.setText("SABADO");
		SABADO.setBounds(380,250,120,40);
		
		
		cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setBounds(300, 350, 200, 100);
		cancelar.addActionListener(this);
		
		
		aceptar = new JButton();
		aceptar.setText("Aceptar");
		aceptar.setBounds(90, 350, 200, 100);
		aceptar.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == aceptar) {
			System.out.println("Dio clic a boton submit");
			validarSeleccion();
		}
		
		if (e.getSource() == cancelar) {
			setVisible(false);
		}
		
		if (e.getSource() == color) {
			System.out.println("El color elegido fue: "  + color.getSelectedItem());
			System.out.println("El index del color fue:" + color.getSelectedItem());
		}
		
		if (e.getSource() == menuHorario) {
			System.out.println("El horario elegido fue: " + menuHorario.getSelectedItem());
			System.out.println("Index: " + menuHorario.getSelectedIndex());
		}
		
	}

	private void validarSeleccion() {
		// TODO Auto-generated method stub
		System.out.println("Entro a validar session");
		int nFila = 0;
		String seleccion = "";
		
		if (LUNES.isSelected()) {
			seleccion += "Lunes seleccionado";
			System.out.println("LUNES");
			nFila = 1;
		} 
		if (MARTES.isSelected()) {
			seleccion += "Martes seleccionado";
			System.out.println("MARTES");
			nFila = 2;
		} if (MIERCOLES.isSelected()) {
			seleccion += "Miercoles seleccionado";
			System.out.println("MIERCOLES");
			nFila = 3;
		} if (JUEVES.isSelected()) {
			seleccion += "Miercoles seleccionado";
			System.out.println("JUEVES");
			nFila = 4;
		} if (VIERNES.isSelected()) {
			seleccion += "Miercoles seleccionado";
			System.out.println("Viernes");
			nFila = 5;
		} if (SABADO.isSelected()) {
			seleccion += "Miercoles seleccionado";
			System.out.println("Sabado");
			nFila = 6;
		}
			
		}
			
	}

