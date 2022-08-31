package images;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public SimplePresentationScreen(Student studentData) {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(230, 230, 250));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aldan\\OneDrive\\Escritorio\\proyecto1\\proyecto-1\\src\\images\\tdp.png"));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(667, 334));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 287);
		tabInformation = new JPanel();
		tabInformation.setBackground(new Color(248, 248, 255));
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LU :");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 31, 75, 13);
		tabInformation.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido :");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 65, 75, 13);
		tabInformation.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre :");
		lblNewLabel_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 105, 75, 13);
		tabInformation.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail :");
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 140, 75, 13);
		tabInformation.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Github URL :");
		lblNewLabel_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 174, 92, 13);
		tabInformation.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(108, 30, 295, 19);
		tabInformation.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 64, 295, 19);
		tabInformation.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 104, 295, 19);
		tabInformation.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(108, 139, 295, 19);
		tabInformation.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 173, 295, 19);
		tabInformation.add(textField_4);
		textField_4.setColumns(10);
		contentPane.add(tabbedPane);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\aldan\\OneDrive\\Escritorio\\proyecto1\\proyecto-1\\src\\images\\fotoaldi1.jpeg"));
		lblNewLabel_5.setBounds(461, 45, 170, 215);
		
		ImageIcon ico= new ImageIcon(getClass().getResource("C:\\Users\\aldan\\OneDrive\\Escritorio\\proyecto1\\proyecto-1\\src\\images\\fotoaldi1.jpeg"));
		ImageIcon img= new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_5.getWidth(),lblNewLabel_5.getHeight(),Image.SCALE_SMOOTH));
		
		lblNewLabel_5.setIcon(img);
		contentPane.add(lblNewLabel_5);
	}
}

