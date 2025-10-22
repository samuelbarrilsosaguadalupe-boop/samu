package paquete;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ejer2 {
	
	JFrame jfrVentana=null;
	JPanel jpnPanel=null;
	JLabel jlbRadio=null;
	JTextField jtfRadio=null;
	JLabel jlbArea=null;
	JTextField jtfArea=null;
	
	
	
	public ejer2() {
			//formulario
		jfrVentana = new JFrame();
		jfrVentana.setSize(500,300);
		jfrVentana.setLocationRelativeTo(null);
		jfrVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			//Panel
		jpnPanel = new JPanel();
		jpnPanel.setSize(750,750);
		jpnPanel.setBackground(Color.RED);
		jpnPanel.setLayout(null);
		jfrVentana.add(jpnPanel);
		
		
			//Etiqueta Radio
		jlbRadio = new JLabel();
		jlbRadio.setBounds(100,50,100,30);
		jlbRadio.setText("RADIO");
		jpnPanel.add(jlbRadio);
		
			//Etiqueta texto Radio
		jtfRadio = new JTextField();
		jtfRadio.setBounds(140,50,100,30);
		jpnPanel.add(jtfRadio);
		
			//Etiqueta Area
		jlbArea = new JLabel();
		jlbArea.setBounds(100,100,100,30);
		jlbArea.setText("AREA");
		jpnPanel.add(jlbArea);
		
			//Etiqueta texto Area
		jtfArea = new JTextField();
		jtfArea.setBounds(140,100,100,30);
		jtfArea.setEditable(false);
		jpnPanel.add(jtfArea);
		
			//Etiqueta
		
		
		
		
		
		
		
		
			//Ultima etiqueta
		jfrVentana.setVisible(true);		
	}

	public static void main(String[] args) {
		
		new ejer2();
	}

}
