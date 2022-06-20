import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class contains the main GUI for displaying lines and clusters
 *
 * @author Makayla Eaves
 * @version 2022.06.19
 */
public class MainUI extends JFrame implements ActionListener{
	JCheckBox cluster;
	JCheckBox line;
	JButton runButton;
	
	
	public static void main(String[] args) {
		new MainUI();	
	}
	
	/**
	 * This method creates the checkboxes, button, and their action listeners
	 */
	public MainUI() {
		this.setTitle("My Project Two");
		cluster = new JCheckBox("Cluster - K-means");
		line = new JCheckBox("Line - Nearest Neighbor");
		runButton = new JButton("Run");
		
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(cluster);
		 
		JPanel panel1 = new JPanel();
		panel1.add(cluster, 0, 0);
		panel1.add(line, 0, 1);
		panel1.add(runButton);
		
		//Work Area panel
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("WorkArea goes here"));
		
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(splitPane, BorderLayout.CENTER);

        this.setContentPane(content);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000, 700));
        this.pack();
		
		cluster.addActionListener(this);
		line.addActionListener(this);
		runButton.addActionListener(this);
		
		this.setVisible(true);
	}
	
	/**
	 * This method contains the events that occur with each action
	 * @param e the event that calls the action
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == runButton) {
			if (cluster.isSelected()) {
				System.out.println("You clicked: Cluster");
				//call the cluster method here
			}
			if (line.isSelected()) {
				System.out.println("You clicked: Line");
				//call the line method here
			}

	}
	}
}

