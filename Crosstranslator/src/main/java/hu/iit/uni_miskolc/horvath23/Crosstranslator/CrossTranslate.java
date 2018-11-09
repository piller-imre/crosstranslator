package hu.iit.uni_miskolc.horvath23.Crosstranslator;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

class WindowFrame extends JFrame {

	private static final long serialVersionUID = -351798560130670466L;
	JFrame mainFrame;
	JTextArea inputMessagePanel;
	JTextArea outputMessagePanel;
	JLabel label;
	JButton toPhp, toJava, toJavaScript, toC, toPython;
	
	
	WindowFrame() {
		mainFrame = new JFrame();
		toPhp = new JButton("PHP");
		toJava = new JButton("Java");
		toJavaScript = new JButton("JavaScript");
		toC = new JButton("C");
		toPython = new JButton("Python");
		label = new JLabel("VRL nyelv feldolgozása");
		inputMessagePanel = new JTextArea("ide add meg a VRL kódot");
		outputMessagePanel = new JTextArea();
		
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setGUI();
		mainFrame.setVisible(true);
	}
	
	void setGUI() {
		SpringLayout springLayout = new SpringLayout();
		mainFrame.getContentPane().setLayout(springLayout);
		mainFrame.getContentPane().setBackground(Color.decode("#DEB877"));
		
		springLayout.putConstraint(SpringLayout.WEST, inputMessagePanel, 70, SpringLayout.WEST, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, inputMessagePanel, 30, SpringLayout.NORTH, mainFrame.getContentPane());
		mainFrame.getContentPane().add(inputMessagePanel);
		
		label.setFont(new java.awt.Font("Courier", java.awt.Font.BOLD,20));
		label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		mainFrame.getContentPane().add(label);
		
		springLayout.putConstraint(SpringLayout.SOUTH, inputMessagePanel, -40, SpringLayout.NORTH, outputMessagePanel);
		springLayout.putConstraint(SpringLayout.EAST, inputMessagePanel, 0, SpringLayout.EAST, outputMessagePanel);
		springLayout.putConstraint(SpringLayout.NORTH, outputMessagePanel, 143, SpringLayout.NORTH, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, outputMessagePanel, 70, SpringLayout.WEST, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, outputMessagePanel, -10, SpringLayout.SOUTH, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, outputMessagePanel, -70, SpringLayout.EAST, mainFrame.getContentPane());
		outputMessagePanel.setEditable(false);
		mainFrame.getContentPane().add(outputMessagePanel);
		
		springLayout.putConstraint(SpringLayout.NORTH, toPhp, 6, SpringLayout.SOUTH, inputMessagePanel);
		springLayout.putConstraint(SpringLayout.WEST, toPhp, 70, SpringLayout.WEST, mainFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, toPhp, 135, SpringLayout.WEST, mainFrame.getContentPane());
		mainFrame.getContentPane().add(toPhp);
		
		springLayout.putConstraint(SpringLayout.NORTH, toJava, 6, SpringLayout.SOUTH, inputMessagePanel);
		springLayout.putConstraint(SpringLayout.WEST, toJava, 6, SpringLayout.EAST, toPhp);
		springLayout.putConstraint(SpringLayout.EAST, toJava, 57, SpringLayout.EAST, toPhp);
		mainFrame.getContentPane().add(toJava);
		
		springLayout.putConstraint(SpringLayout.NORTH, toJavaScript, 6, SpringLayout.SOUTH, inputMessagePanel);
		springLayout.putConstraint(SpringLayout.WEST, toJavaScript, 10, SpringLayout.EAST, toJava);
		springLayout.putConstraint(SpringLayout.EAST, toJavaScript, 56, SpringLayout.EAST, toJava);
		mainFrame.getContentPane().add(toJavaScript);
		
		springLayout.putConstraint(SpringLayout.NORTH, toC, 6, SpringLayout.SOUTH, inputMessagePanel);
		springLayout.putConstraint(SpringLayout.WEST, toC, 7, SpringLayout.EAST, toJavaScript);
		springLayout.putConstraint(SpringLayout.EAST, toC, 53, SpringLayout.EAST, toJavaScript);
		mainFrame.getContentPane().add(toC);
		
		springLayout.putConstraint(SpringLayout.NORTH, toPython, 6, SpringLayout.SOUTH, inputMessagePanel);
		springLayout.putConstraint(SpringLayout.WEST, toPython, 11, SpringLayout.EAST, toC);
		springLayout.putConstraint(SpringLayout.EAST, toPython, 0, SpringLayout.EAST, inputMessagePanel);
		mainFrame.getContentPane().add(toPython);
		
	}
}

public class CrossTranslate {
	public static void main(String[] args) {
		new WindowFrame();
	}
}
