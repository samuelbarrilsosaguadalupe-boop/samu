package paquete;

import java.awt.Color;

import javax.swing.JButton;
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
	JLabel jlbLongitud=null;
	JTextField jtfLongitud=null;
	JButton jbtCalcular=null;
	
	public ejer2() {
			//formulario
		jfrVentana = new JFrame();
		jfrVentana.setSize(500,300);
		jfrVentana.setLocationRelativeTo(null);
		jfrVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			//Panel
		jpnPanel = new JPanel();
		jpnPanel.setSize(750,750);
		jpnPanel.setBackground(Color.YELLOW);
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
		
			//Etiqueta Longitud
		jlbLongitud = new JLabel();
		jlbLongitud.setBounds(70,140,100,30);
		jlbLongitud.setText("LONGITUD");
		jpnPanel.add(jlbLongitud);
		
			//Etiqueta Texto longitud
		jtfLongitud = new JTextField();
		jtfLongitud.setBounds(140,140,100,30);
		jtfLongitud.setEditable(false);
		jpnPanel.add(jtfLongitud);
		
			//Boton  Calcular
		jbtCalcular = new JButton();
		jbtCalcular.setBounds(260,70,100,50);
		jbtCalcular.setText("CALCULAR");
		jpnPanel.add(jbtCalcular);
		
		
			//accion del boton
		jbtCalcular.addActionListener(e -> {
			try {
				double radio = Double.parseDouble(jtfRadio.getText());			
				double area = (3.14*(radio*radio));
				double longitud = (2*3.12*radio);
				jtfArea.setText(String.valueOf(area));
				jtfLongitud.setText(String.valueOf(longitud));
			}
			catch (NumberFormatException ex) {
				jtfArea.setText("Error");
				jtfLongitud.setText("Error");
			}
			});
		
			//Ultima etiqueta
		jfrVentana.setVisible(true);		
	}

	public static void main(String[] args) {
		
		new ejer2();
	}

}
