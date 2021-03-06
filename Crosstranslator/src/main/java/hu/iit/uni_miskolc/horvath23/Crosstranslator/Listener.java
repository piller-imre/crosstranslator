package hu.iit.uni_miskolc.horvath23.Crosstranslator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import hu.iit.uni_miskolc.horvath23.Crosstranslator.lexer.Scanner;
import hu.iit.uni_miskolc.horvath23.Crosstranslator.parser.Parser;
import java_cup.Lexer;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ScannerBuffer;

public class Listener extends MouseAdapter {

	JButton button;
	JLabel fileName;
	JLabel message;
	JPanel messagePanel;
	JScrollPane scrollPane;
	ArrayList<String> content = new ArrayList<String>();
	
	Listener(JButton button,JLabel message, JPanel messagePanel, JScrollPane scrollPane){
		this.button = button;
		this.message = message;
		this.messagePanel = messagePanel;
		this.scrollPane = scrollPane;
	}

	@Override
	public void mouseClicked(MouseEvent e){
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Fájl kiválasztása");
		int result = chooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
		    File file = chooser.getSelectedFile();
		    try {
		    	//Lexer scanner = new Lexer(new FileReader(file));
		    	Scanner scanner = new Scanner(new FileReader(file));
		    	ScannerBuffer buffer = new ScannerBuffer(scanner);
				Parser parser = new Parser(buffer, new ComplexSymbolFactory());
				try {
					parser.parse();
				} catch (Exception exception) {
					System.out.println(exception.getMessage());
				}
				System.out.println(buffer.getBuffered());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
