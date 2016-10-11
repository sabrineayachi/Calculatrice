package Calculation;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Embed HTML directly into the Javadoc.
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class CalculUI {
	JFrame j = new JFrame();
	
	JLabel l1 = new JLabel("Nombre1");
	JTextField txt1 = new JTextField(10);
	
	JLabel l2 = new JLabel("Nombre2");
	JTextField txt2 = new JTextField(10);
	
	JButton btn1 = new JButton("+");
	JButton btn2 = new JButton("-");
	JButton btn3 = new JButton("*");
	JButton btn4 = new JButton("/");
	
	JLabel l3 = new JLabel("r�sultat");
	
	
	public void graphique() {
		j.setBounds(400,400,400,400);
		j.setVisible(true);
		
		JPanel panel1 = new JPanel();
		panel1.add(l1);
		panel1.add(txt1);
		panel1.add(l2);
		panel1.add(txt2);
		
		JPanel panel2 = new JPanel();
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(btn3);
		panel2.add(btn4);
		
		JPanel panel3 = new JPanel();
		panel3.add(l3);
		
		j.add(panel1, BorderLayout.NORTH);
		j.add(panel2, BorderLayout.CENTER);
		j.add(panel3, BorderLayout.SOUTH);
		
		
		
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String val1 = txt1.getText();
				String val2 = txt2.getText();
				
				int a = Integer.parseInt(val1);
			

				int b = Integer.parseInt(val2);
				Calcul c = new Calcul();
				
				int res = c.addition(a, b);
				l3.setText("Resultat = " + res);
				System.out.println("add");
				
			}
		});
		
        btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("soustruction");
				
			}
		});
		
       btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("multiplication");
				
			}
		});
       
       btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		CalculUI c = new CalculUI();
		c.graphique();

	}
}

