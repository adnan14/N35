import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;


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