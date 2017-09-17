import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MenuDemo extends JFrame implements ActionListener {
	
	JRadioButtonMenuItem btBlue;
	
	MenuDemo(){
		setSize(250,250);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JMenuBar jmb = new JMenuBar();					
// all menus attach to menu bar
		
		JMenu jmFile = new JMenu("File");				
// JMenu
		JMenuItem jmOpen = new JMenuItem("Open", 'O'); // can 
set Mnemonic directly from here
		JMenuItem jmClose = new JMenuItem("Close", 'C');	
// JMenu items are final items
		JMenuItem jmSave = new JMenuItem("Save", 'S');
		jmFile.add(jmOpen);
		//jmFile.addSeparator();  // this creates seperation 
line between menuItems
		jmFile.add(jmClose);	// add to JMenu
		jmFile.addSeparator();
		jmFile.add(jmSave);
		jmb.add(jmFile);		// finally add Top JMenu 
to JMenuBar
		
		JMenu jmOption = new JMenu("Options");	// another JMenu
		JMenu jmColor = new JMenu("Colors");	// creating a 
SubMenu called colors // can do this as much as want
		JMenu jmCheckBox = new JMenu("Box");
		jmOption.add(jmColor);					
// adding subMenu to topMenu
		jmOption.add(jmCheckBox);
		jmb.add(jmOption);			// adding 
TopMenu to JMenuBar
		
		jmOpen.addActionListener(this);
		jmClose.addActionListener(this);		// have 
to addActionListeners in order to attach function to buttons
		jmSave.addActionListener(this);
		
		setJMenuBar(jmb);						
// setJMenuBar really adds it to the JFrame
		
		jmFile.setMnemonic('F');
		
		
																							
		
jmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O , 
InputEvent.CTRL_MASK));	//puts Ctrl-O next to button
		
jmClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C , 
InputEvent.CTRL_MASK));
								
		JRadioButtonMenuItem btRed = new 
JRadioButtonMenuItem("Red");
		//JRadioButtonMenuItem 
		btBlue	= new JRadioButtonMenuItem("Blue");
		JRadioButtonMenuItem btGreen = new 
JRadioButtonMenuItem("Green");
		
		ButtonGroup btg = new ButtonGroup();
		btg.add(btRed);
		btg.add(btBlue);
		btg.add(btGreen);
		
		jmColor.add(btRed);
		jmColor.addSeparator();
		jmColor.add(btBlue);
		jmColor.addSeparator();
		jmColor.add(btGreen);
		
		btRed.setSelected(true);
		
		JCheckBoxMenuItem bt1 = new JCheckBoxMenuItem("First");
		JCheckBoxMenuItem bt2 = new JCheckBoxMenuItem("Second");
		
		jmCheckBox.add(bt1);
		jmCheckBox.addSeparator();
		jmCheckBox.add(bt2);

		
		
		btRed.addActionListener(this);
		btBlue.addActionListener(this);
		btGreen.addActionListener(this);
	}
	
	ImageIcon icon = new 
ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//ImageViewerIcon.png");
	
	
	public void actionPerformed(ActionEvent ae){
		if(btBlue.isSelected())
		JOptionPane.showMessageDialog(this, "Fuck this class", 
"title" , JOptionPane.ERROR_MESSAGE , icon);
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(() ->
		new MenuDemo());
	}
}

