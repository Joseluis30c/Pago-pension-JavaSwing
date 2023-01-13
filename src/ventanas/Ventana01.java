package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import clases.Pago;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;

public class Ventana01 extends JFrame {

	private JPanel contentPane;
	private JTextField promedio;
	private JTextField descuento;
	private JTextField pactual;
	private JTextField npension;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana01 frame = new Ventana01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana01() {
		setBackground(new Color(124, 252, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:/ESCRITORIO/PORTAFOLIO/Tr2/pago-en-efectivo.png"));
		setTitle("PAGO DE PENSI\u00D3N DEL ALUMNO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 271);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DATOS", TitledBorder.LEFT, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel.setBounds(47, 31, 190, 122);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Categor\u00EDa:");
		lblNewLabel_1.setBounds(10, 36, 64, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Promedio:");
		lblNewLabel_1_1.setBounds(10, 74, 64, 14);
		panel.add(lblNewLabel_1_1);
		
		promedio = new JTextField();
		promedio.setColumns(10);
		promedio.setBounds(79, 67, 72, 29);
		panel.add(promedio);
		
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.setBounds(79, 32, 72, 22);
		panel.add(cbCategoria);
		cbCategoria.addItem("A");
		cbCategoria.addItem("B");
		cbCategoria.addItem("C");
		cbCategoria.addItem("D");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "RESULTADOS", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel_1.setBounds(266, 31, 345, 122);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Pensi\u00F3n Actual:");
		lblNewLabel_1_1_1.setBounds(10, 37, 96, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nueva Pensi\u00F3n:");
		lblNewLabel_1_1_1_1.setBounds(74, 75, 105, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Descuento:");
		lblNewLabel_1_1_1_2.setBounds(184, 37, 79, 14);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		descuento = new JTextField();
		descuento.setEditable(false);
		descuento.setColumns(10);
		descuento.setBounds(262, 34, 73, 20);
		panel_1.add(descuento);
		
		pactual = new JTextField();
		pactual.setEditable(false);
		pactual.setColumns(10);
		pactual.setBounds(104, 34, 72, 20);
		panel_1.add(pactual);
		
		npension = new JTextField();
		npension.setEditable(false);
		npension.setColumns(10);
		npension.setBounds(172, 72, 72, 20);
		panel_1.add(npension);
		
		Pago pa=new Pago();
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNuevo.setToolTipText("");
		btnNuevo.setHorizontalAlignment(SwingConstants.LEADING);
		btnNuevo.setForeground(new Color(0, 0, 0));
		btnNuevo.setBackground(new Color(240, 255, 240));
		btnNuevo.setIcon(new ImageIcon("D:/ESCRITORIO/PORTAFOLIO/Tr2/nuevo.png"));
		btnNuevo.setSelectedIcon(new ImageIcon("D:/ESCRITORIO/PORTAFOLIO/Tr2/nuevo.png"));
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				promedio.setText("");
				pactual.setText("");
				descuento.setText("");
				npension.setText("");
			}
		});
		btnNuevo.setBounds(266, 164, 112, 39);
		contentPane.add(btnNuevo);
		
		JButton btnCal = new JButton("CALCULAR");
		btnCal.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCal.setBackground(new Color(240, 255, 240));
		btnCal.setHorizontalAlignment(SwingConstants.LEADING);
		btnCal.setIcon(new ImageIcon("D:/ESCRITORIO/PORTAFOLIO/Tr2/veri.png"));
		btnCal.setSelectedIcon(new ImageIcon("D:/ESCRITORIO/PORTAFOLIO/Tr2/veri.png"));
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pa.setCategoria(cbCategoria.getSelectedIndex());
				pa.setPromedio(Double.parseDouble(promedio.getText()));
				pa.setDesc(descuento.getText());
				
				descuento.setText(""+pa.descuento());
				pactual.setText("S/ "+pa.pension_actual());
				npension.setText("S/ "+pa.nueva_pension());
			}
		});
		btnCal.setBounds(102, 164, 134, 39);
		contentPane.add(btnCal);
	}
}
