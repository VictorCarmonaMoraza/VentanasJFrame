import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentnaPrincipal {

	
	public static void main(String[] args) {
		
		//Creamos un JFrame que nos hara de ventana
		JFrame ventana = new JFrame("Titulo ventana");
		
		//Establecemos la ventana avisible
		ventana.setVisible(true);
		
		//establecemos el tamaño de la ventana
		ventana.setSize(400, 400);
		
		//Creamos un panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		//Añadimos a la ventana el panel
		ventana.add(panel);
		
		//Creamos una label opara mostar un texto
		JLabel etiqueta = new JLabel();
		etiqueta.setText("Primera prueba con JFrame");
		
		//Le asignamos un tamaño a la etiqueta
		etiqueta.setBounds(100, 100, 400, 35);
		
		//Añadimos la etiqueta al panel
		panel.add(etiqueta);
		
		//Creamos un boton para cerrar la ventana
		JButton boton = new JButton("Close");
		
		//
		boton.setText("Cerrar");
		boton.setBounds(250, 250, 100, 35);
		
		//Le damos una accion al boton
		boton.addActionListener(new CerrarVentana());
		
		panel.add(boton);
		
		
	}
}

class CerrarVentana implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
