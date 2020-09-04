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

import unbosque.edu.co.modelo.RecibidorDatos;


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
	JTextField nombreAsignatura;
	JTextField nombreProfesor;
	JCheckBox LUNES;
	JCheckBox MARTES;
	JCheckBox MIERCOLES;
	JCheckBox JUEVES;
	JCheckBox VIERNES;
	JCheckBox SABADO;
	JButton aceptar;
	JButton cancelar;
	String [][] datosVentanaAsignatura;
	String [] arregloNombreAsignatura;
	private int fila = 0;
	private int columa = 0;
	private int contadorNombres;
	
	/**
	 * 
	 */
	public VentanaAgregarAsignatura(String [][] datos, int contadorNombre, String [] pnombreAsignatura) {
		arregloNombreAsignatura = pnombreAsignatura;
		contadorNombres = contadorNombre;
		datosVentanaAsignatura = datos;
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
		add (nombreAsignatura);
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
		
		
		nombreAsignatura = new JTextField(30);
		nombreAsignatura.setBounds(350,30,200,25);
		nombreProfesor = new JTextField(30);
		nombreProfesor.setBounds(350, 70, 200, 25);
		
		String [] colores = {"Seleccione un color", "Rojo", "Azul", "Naranja","Verde","Amarillo","Gris","Cyan","Rosado"};
		
		color = new JComboBox(colores);
		color.setBounds(350, 110, 200, 25);
		color.addActionListener(this);
		
		
		//Arreglo de prueba
		String [] horario = {"Seleccione","07:00H-09:00H","9:00H-11:00H","11:00H-13:00H","14:00H-16:00H","16:00H-18:00H","18:00H-20:00H","20:00H-22:00H"};
		
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
			obtenerDatosAsignatura();
			validarSeleccion();
		}
		
		if (e.getSource() == cancelar) {
			setVisible(false);
			Tabla claseTabla = new Tabla(datosVentanaAsignatura,arregloNombreAsignatura,contadorNombres);
		}
		
	}

	private void obtenerDatosAsignatura() {
		// TODO Auto-generated method stub
		
//		datosVentanaAsignatura.add(nombreAsignatura.getText());
		if (menuHorario.getSelectedItem().equals("07:00H-09:00H")) {
			fila = 0;
		} else {
			if (menuHorario.getSelectedItem().equals("9:00H-11:00H")) {
				fila = 1;
			}
			if (menuHorario.getSelectedItem().equals("11:00H-13:00H")) {
				fila = 2;
			}
			if (menuHorario.getSelectedItem().equals("14:00H-16:00H")) {
				fila = 3;
			}
			if (menuHorario.getSelectedItem().equals("16:00H-18:00H")) {
				fila = 4;
			}
			if (menuHorario.getSelectedItem().equals("18:00H-20:00H")) {
				fila = 5;
			}
			if (menuHorario.getSelectedItem().equals("20:00H-22:00H")) {
				fila = 6;
			}
		}
		if (LUNES.isSelected()) {
			columa = 1;
			datosVentanaAsignatura[fila][columa] = nombreAsignatura.getText();
		}
		if (MARTES.isSelected()) {
			columa = 2;
			datosVentanaAsignatura[fila][columa] = nombreAsignatura.getText();
		}
		if (MIERCOLES.isSelected()) {
			columa = 3;
			datosVentanaAsignatura[fila][columa] = nombreAsignatura.getText();
		}
		if (JUEVES.isSelected()) {
			columa = 4;
			datosVentanaAsignatura[fila][columa] = nombreAsignatura.getText();
		}
		if (VIERNES.isSelected()) {
			columa = 5;
			datosVentanaAsignatura[fila][columa] = nombreAsignatura.getText();
		}
		if (SABADO.isSelected()) {
			columa = 6;
			datosVentanaAsignatura[fila][columa] = nombreAsignatura.getText();
		}

		guardarNombres();
		RecibidorDatos claseRecibidorDatos = new RecibidorDatos(datosVentanaAsignatura, arregloNombreAsignatura, contadorNombres);
		setVisible(false);
		
	}

	private void guardarNombres() {
		if (arregloNombreAsignatura[0] == null) {
			contadorNombres = contadorNombres + 1;
		} else {
			contadorNombres = contadorNombres+1;
		}
		
		if (menuHorario.getSelectedItem().equals("07:00H-09:00H")) {
			arregloNombreAsignatura [contadorNombres] = nombreAsignatura.getText();
		} else {
			if (menuHorario.getSelectedItem().equals("9:00H-11:00H")) {
				arregloNombreAsignatura [contadorNombres] = nombreAsignatura.getText();
			}
			if (menuHorario.getSelectedItem().equals("11:00H-13:00H")) {
				arregloNombreAsignatura [contadorNombres] = nombreAsignatura.getText();
			}
			if (menuHorario.getSelectedItem().equals("14:00H-16:00H")) {
				arregloNombreAsignatura [contadorNombres] = nombreAsignatura.getText();
			}
			if (menuHorario.getSelectedItem().equals("16:00H-18:00H")) {
				arregloNombreAsignatura [contadorNombres] = nombreAsignatura.getText();
			}
			if (menuHorario.getSelectedItem().equals("18:00H-20:00H")) {
				arregloNombreAsignatura [contadorNombres] = nombreAsignatura.getText();
			}
			if (menuHorario.getSelectedItem().equals("20:00H-22:00H")) {
				arregloNombreAsignatura [contadorNombres] = nombreAsignatura.getText();
			}
		}
	}

	private void validarSeleccion() {
		// TODO Auto-generated method stub
		int nFila = 0;
		String seleccion = "";
		
		if (LUNES.isSelected()) {
			seleccion += "Lunes seleccionado";
			nFila = 1;
		} 
		if (MARTES.isSelected()) {
			seleccion += "Martes seleccionado";
			nFila = 2;
		} if (MIERCOLES.isSelected()) {
			seleccion += "Miercoles seleccionado";
			nFila = 3;
		} if (JUEVES.isSelected()) {
			seleccion += "Miercoles seleccionado";
			nFila = 4;
		} if (VIERNES.isSelected()) {
			seleccion += "Miercoles seleccionado";
			nFila = 5;
		} if (SABADO.isSelected()) {
			seleccion += "Miercoles seleccionado";
			nFila = 6;
		}
			
	}
	
	public JTextField getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(JTextField nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
			
	}

