/**
 * 
 */
package unbosque.edu.co.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author gomez
 *
 */
public class VentanaEliminarAsignatura extends JFrame implements ActionListener{
	
	JButton botonCancelar;
	JButton btnEliminarAsignatura;
	private JComboBox combo;
	private JLabel mensaje;
	/**
	 * 
	 */
	public VentanaEliminarAsignatura() {
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
		add(btnEliminarAsignatura);
		
		
//		panel.add(botonCancelar, BorderLayout.SOUTH);
//		panel.add(btnEliminarAsignatura, BorderLayout.SOUTH);
        add (combo);
        add (mensaje);

		
		this.getContentPane().add(panel);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==botonCancelar) {
        	setVisible(false);
        }
    }
	
	private void menuEliminacion () {
		mensaje = new JLabel();
		mensaje.setBounds(5, 40, 350, 20);
		mensaje.setText("Seleccione la asignatura que desea eliminar");
		
		combo = new JComboBox<String>();
		combo.setBounds(400, 40, 135, 20);
		combo.addItem("uno");
		combo.addItem("dos");
		combo.addItem("tres");
	}

	
	
}