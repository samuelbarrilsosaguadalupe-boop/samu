package paquete;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class layaout1 {
	
	JFrame jfrVentana=null;
	JPanel jpnPanel=null;
	JButton jbtNorte=null;
	JButton jbtCentro=null;
	JButton jbtEste=null;
	JButton jbtOeste=null;
	JButton jbtSur=null;
	
	public layaout1() {
			//Frame
		jfrVentana=new JFrame("Layaout 1");
		jfrVentana.setSize(500,300);
		jfrVentana.setLocationRelativeTo(null);
		jfrVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			//panel
		
		jpnPanel=new JPanel();
		jpnPanel.setSize(500,300);
		jpnPanel.setLayout(new BorderLayout());
		jfrVentana.add(jpnPanel);
		
			//boton norte
		jbtNorte=new JButton();
		jbtNorte.setText("Norte");
		jbtNorte.setBackground(Color.yellow);
		jpnPanel.add(jbtNorte, BorderLayout.NORTH);
		
			//boton centro
		jbtCentro=new JButton();
		jbtCentro.setText("Centro");
		jbtCentro.setBackground(Color.pink);
		jpnPanel.add(jbtCentro, BorderLayout.CENTER);
		
			//boton este
		jbtEste=new JButton();
		jbtEste.setText("Este");
		jbtEste.setBackground(Color.blue);
		jpnPanel.add(jbtEste, BorderLayout.EAST);
			//boton oeste
		jbtOeste=new JButton();
		jbtOeste.setText("Oeste");
		jbtOeste.setBackground(Color.red);
		jpnPanel.add(jbtOeste, BorderLayout.WEST);
		
			//boton
		jbtSur=new JButton();
		jbtSur.setText("Sur");
		jbtSur.setBackground(Color.green);
		jpnPanel.add(jbtSur, BorderLayout.SOUTH);
			
			//ultima instruccion
		jfrVentana.setVisible(true);
	}

	public static void main(String[] args) {
		new layaout1();
	}

}
