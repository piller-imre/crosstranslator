package def;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

class Frame extends JFrame {
	
	JPanel panel, messagePanel;
	JScrollPane scrollPane;
	JLabel label, msg;
	JButton button;
	
	Frame() {
		setSize(500, 500);
		button = new JButton("Fájl kiválasztása");
		panel = new JPanel();
		messagePanel = new JPanel();
		msg = new JLabel();
		label = new JLabel();
		scrollPane = new JScrollPane(messagePanel);
		setGUI();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
	void setGUI() {
		panel.setBackground(Color.decode("#DEB877"));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(30, 30, 60, 30));
        
        label.setText("VRL nyelv feldolgozása");
        label.setFont(new java.awt.Font("Courier", java.awt.Font.BOLD,20));
        label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
        //button.setMargin(new Insets(10,10,10,10));
        button.setBackground(Color.decode("#D7AE8F"));
        button.setForeground(Color.decode("#000000"));
        /*button.setContentAreaFilled(false) ;
        button.setBorderPainted(false);
        button.setOpaque(true);*/
        button.setAlignmentX(JComponent.CENTER_ALIGNMENT);		
		
		messagePanel.setLayout(new FlowLayout());
		messagePanel.setBackground(Color.WHITE);
		messagePanel.add(msg);
		
		panel.add(label);
		panel.add(Box.createVerticalStrut(20));
		panel.add(button);
		panel.add(Box.createVerticalStrut(20));
		panel.add(scrollPane);
		panel.add(Box.createVerticalStrut(20));
		add(panel);
		
		button.addMouseListener(new Listener(button,msg,messagePanel,scrollPane));
	}

}

public class StartClass {
	public static void main(String[] args) {
		new Frame();
	}
}
