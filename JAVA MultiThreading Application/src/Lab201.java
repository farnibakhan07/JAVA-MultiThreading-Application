import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab201 {

	private JFrame frame;
	public static JTextField textField;
	public static JTextArea textAreaCMDOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab201 window = new Lab201();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lab201() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 398, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnExecuteCommand = new JButton("Execute command");
		btnExecuteCommand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CommandExecution R2 = new CommandExecution( "Thread-2");
			    R2.start();
			   
			}
		});
		btnExecuteCommand.setBounds(10, 50, 138, 23);
		frame.getContentPane().add(btnExecuteCommand);
		
		JButton fibonacciButton = new JButton("Fibonacci");
		fibonacciButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fibonacciSeries R1 = new fibonacciSeries( "Thread-1");
			      R1.start();
			}
		});
		fibonacciButton.setBounds(158, 50, 89, 23);
		frame.getContentPane().add(fibonacciButton);
		
		 textAreaCMDOut = new JTextArea();
		textAreaCMDOut.setBounds(20, 84, 376, 153);
		textAreaCMDOut.setText("");
		frame.getContentPane().add(textAreaCMDOut);
	}

}
