package def;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.*;
import main.ClassExpression;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java_cup.runtime.ComplexSymbolFactory;

public class Listener extends MouseAdapter {

	JButton button;
	JLabel fileName,message;
	JPanel messagePanel;
	JScrollPane scrollPane;
	List<String> content = new ArrayList<>();
	
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
		    Runtime rt = Runtime.getRuntime();			
			Example_Annoflex anno = new Example_Annoflex();  
			StringBuilder data = new StringBuilder();
			
			try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {

				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					data.append(sCurrentLine);
				}

			} catch (IOException ex) {
				ex.printStackTrace();
			}
			
			anno.setString(data.toString());
			String token = anno.getNextToken();
			while (token != null) {
				content.add(token + "-" + anno.getMatchText());
				token = anno.getNextToken();
			}
			
			/*Parser parser = new Parser(new Scanner(content));
			try {
				parser.parse();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			
			System.out.println("Here is the standard output of the command:\n");
			String s = null;
			int i=0;
			message.setText("<html>");
			for (String string : content) {
				message.setText(message.getText() + string +"<br />");
			}
			message.setText(message.getText() + "</html>");
		}
	}
}
