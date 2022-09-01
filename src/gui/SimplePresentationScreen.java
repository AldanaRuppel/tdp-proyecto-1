package gui;

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
import javax.swing.SwingConstants;

import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField LU;
	private JTextField Apellido;
	private JTextField Nombre;
	private JTextField Email;
	private JTextField Git;

	public SimplePresentationScreen(Student studentData) {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(230, 230, 250));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aldan\\OneDrive\\Escritorio\\proyecto1\\proyecto-1\\src\\images\\tdp.png"));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantal6a de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(668, 361));
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
		tabInformation.setBackground(new Color(230, 230, 250));
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
		
		LU = new JTextField();
		LU.setForeground(new Color(0, 0, 0));
		LU.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		LU.setBackground(Color.WHITE);
		LU.setEnabled(false);
		LU.setEditable(false);
		LU.setBounds(108, 30, 295, 19);
		tabInformation.add(LU);
		LU.setColumns(10);
		LU.setText("" +studentData.getId());
		
		Apellido = new JTextField();
		Apellido.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		Apellido.setBackground(Color.WHITE);
		Apellido.setEnabled(false);
		Apellido.setEditable(false);
		Apellido.setBounds(108, 64, 295, 19);
		tabInformation.add(Apellido);
		Apellido.setColumns(10);
		Apellido.setText(studentData.getLastName());
		
		Nombre = new JTextField();
		Nombre.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		Nombre.setBackground(Color.WHITE);
		Nombre.setEnabled(false);
		Nombre.setEditable(false);
		Nombre.setBounds(108, 104, 295, 19);
		tabInformation.add(Nombre);
		Nombre.setColumns(10);
		Nombre.setText("" +studentData.getFirstName());
		
		Email = new JTextField();
		Email.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		Email.setBackground(Color.WHITE);
		Email.setEnabled(false);
		Email.setEditable(false);
		Email.setBounds(108, 139, 295, 19);
		tabInformation.add(Email);
		Email.setColumns(10);
		Email.setText("" +studentData.getMail());
		
		Git = new JTextField();
		Git.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		Git.setBackground(Color.WHITE);
		Git.setEnabled(false);
		Git.setEditable(false);
		Git.setBounds(108, 173, 295, 19);
		tabInformation.add(Git);
		Git.setColumns(10);
		Git.setText(studentData.getGithubURL());
		contentPane.add(tabbedPane);
		
		JLabel FotoId = new JLabel("");
		FotoId.setBounds(465, 35, 166, 219);
		FotoId.setHorizontalAlignment(SwingConstants.CENTER);
		FotoId.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		contentPane.add(FotoId);
		
		DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalTime horaActual = LocalTime.now();
		LocalDate fechaActual = LocalDate.now();

		JLabel lblNewLabel_horaFecha = new JLabel(
				"Esta ventana fue generada el " + f.format(fechaActual) + " a las " + h.format(horaActual));
		lblNewLabel_horaFecha.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblNewLabel_horaFecha.setBounds(5, 300, 430, 14);
		contentPane.add(lblNewLabel_horaFecha);
	}
}