package hu.iit.uni_miskolc.horvath23.Crosstranslator;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class WindowFrame extends JFrame {

	private static final long serialVersionUID = -351798560130670466L;
	
	JFrame mainFrame;
	JTextArea inputMessagePanel;
	JTextArea outputMessagePanel;
	JLabel label;
	JButton toPhp, toJava, toJavaScript, toC, toPython;
	JPanel buttonPanel;
	
	WindowFrame() {
		mainFrame = new JFrame();
		toPhp = new JButton("PHP");
		toJava = new JButton("Java");
		toJavaScript = new JButton("JavaScript");
		toC = new JButton("C");
		toPython = new JButton("Python");
		label = new JLabel("VRL nyelv feldolgozása");
		inputMessagePanel = new JTextArea("Ide add meg a VRL kódot!");
		outputMessagePanel = new JTextArea();
		
		buttonPanel = new JPanel();
		
		mainFrame.setBounds(100, 100, 720, 480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setGUI();
		mainFrame.setVisible(true);
	}
	
	void setGUI() {
		mainFrame.getContentPane().setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.Y_AXIS));
		mainFrame.getContentPane().setBackground(Color.decode("#DEB877"));
				
		label.setFont(new java.awt.Font("Courier", java.awt.Font.BOLD,20));
		label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		mainFrame.getContentPane().add(label);
		
		mainFrame.getContentPane().add(inputMessagePanel);
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		buttonPanel.add(toPhp);
		buttonPanel.add(toJava);
		buttonPanel.add(toJavaScript);
		buttonPanel.add(toC);
		buttonPanel.add(toPython);

		mainFrame.getContentPane().add(buttonPanel);
		
		outputMessagePanel.setEditable(false);
		mainFrame.getContentPane().add(outputMessagePanel);		
	}
}

public class CrossTranslate {
	public static void main(String[] args) {
		new WindowFrame();
	}
}
