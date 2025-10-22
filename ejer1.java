package paquete;


import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ejer1 {
	
	JFrame jfrVentana = null;
	JPanel jpnPanel = null;
	
	JLabel jlbTitulo = null;
	JLabel jlbBase = null;
	JTextField jtfBase = null;
	JLabel jlbAltura = null;
	JTextField jtfAltura = null;
	JButton jbtCalcular = null;
	JLabel jlbResultado = null;
	JTextField jtfResultado = null;
	
	
	public ejer1() {
			//formulario
		jfrVentana = new JFrame();
		jfrVentana.setSize(500,500);
		jfrVentana.setLocationRelativeTo(null);
		jfrVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			//panel
		jpnPanel = new JPanel();
		jpnPanel.setSize(500,500);
		jpnPanel.setBackground(Color.gray);
		jpnPanel.setLayout(null);
		jfrVentana.add(jpnPanel);
		
			//Etiqueta titulo
		jlbTitulo = new JLabel();
		jlbTitulo.setBounds(150,50,200,30);
		jlbTitulo.setText("Calcula el area del triangulo");
		jpnPanel.add(jlbTitulo);
		
			//Etiqueta Base
		jlbBase = new JLabel();
		jlbBase.setBounds(100,150,100,30);
		jlbBase.setText("Base:");
		jpnPanel.add(jlbBase);
		
			//Etiqueta Texto Base
		jtfBase = new JTextField();
		jtfBase.setBounds(140,150,100,30);
		jpnPanel.add(jtfBase);
		
			//Etiqueta Altura
		jlbAltura = new JLabel();
		jlbAltura.setBounds(100,200,100,30);
		jlbAltura.setText("Altura");
		jpnPanel.add(jlbAltura);
		
			//Etiqueta Texto Altura
		jtfAltura = new JTextField();
		jtfAltura.setBounds(140,200,100,30);
		jpnPanel.add(jtfAltura);
		
			//Boton
		jbtCalcular = new JButton();
		jbtCalcular.setText("CALCULAR");
		jbtCalcular.setBounds(300,200,100,50);
		jpnPanel.add(jbtCalcular);
		
			//Etiqueta Resultado
		jlbResultado = new JLabel();
		jlbResultado.setBounds(100,250,100,30);
		jlbResultado.setText("Resultado");
		jpnPanel.add(jlbResultado);
		
			//Etiqueta texto Resultado
		jtfResultado = new JTextField();
		jtfResultado.setBounds(160,250,100,30);
		jtfResultado.setEditable(false); //impide que este cuadro se pueda editar
		jpnPanel.add(jtfResultado);
		
			//Accion del boton 
		jbtCalcular.addActionListener(e -> {
		    try {
		        double base = Double.parseDouble(jtfBase.getText());
		        double altura = Double.parseDouble(jtfAltura.getText());
		        double area = (base * altura) / 2;		        
		        jtfResultado.setText(String.valueOf(area));
		        }
		    catch (NumberFormatException ex) {
		        jtfResultado.setText("Error");
		    	}
		});

		
			//ultima instruccion
		jfrVentana.setVisible(true);		
	}

	public static void main(String[] args) {
		
		new ejer1();
	}

}
