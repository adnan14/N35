import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MainFrame extends JFrame {
	private JLabel nameLabel;
	private JButton newNameButton;
	private JPanel mainPanel;

	public MainFrame(Students students) {
		super("Prozivka");
		
		nameLabel = new JLabel();
		nameLabel.setText(students.getRandomStudent());
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER); // centriranje!!
		
		NextStudentListener nsl = new NextStudentListener(nameLabel, students);
		
		JButton newNameButton = new JButton("Dalje...");
		newNameButton.addActionListener(nsl);
		
		System.out.println(students.getRandomStudent());
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(nameLabel, BorderLayout.CENTER);
		mainPanel.add(newNameButton, BorderLayout.PAGE_END);

		setSize(400, 300);		// bilo: mainWindow.setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // bilo: mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mainPanel); // bilo: mainWindow.setContentPane(mainPanel);
		
	}
	
	public class NextStudentListener implements ActionListener { 
		private JLabel nameLabel;
		private Students students;
		
		public NextStudentListener(JLabel nameLabel, Students students) {
			this.nameLabel = nameLabel;
			this.students = students;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			nameLabel.setText(students.getRandomStudent());
			
		}
	
	
	}
	
}
