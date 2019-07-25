package ProyectoInterfazBasico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosBasicos extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfEdad;
	private JTextField tfTelefono;
	private JLabel lblTelefono;
	private JLabel lblApellido;
	private JLabel lblEdad;
	private JLabel lblNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosBasicos frame = new DatosBasicos();
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
	public DatosBasicos() {
		JLabel lblMouse = new JLabel("mouse");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblMouse.setText(e.getX() + "," + e.getY());
			}
		});
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(24, 28, 46, 14);
		contentPane.add(lblNombre);

		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(24, 61, 46, 14);
		contentPane.add(lblApellido);

		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(24, 99, 46, 14);
		contentPane.add(lblEdad);

		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(24, 139, 46, 14);
		contentPane.add(lblTelefono);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(tfEdad.getText()) < 18) {
					JOptionPane.showMessageDialog(contentPane, "Debe ser mayor de edad","error",1);
					//JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
				}
				
			}
		});
		btnRegistrar.setForeground(Color.BLUE);
		btnRegistrar.setBackground(Color.RED);
		btnRegistrar.setBounds(33, 187, 139, 23);
		contentPane.add(btnRegistrar);

		tfNombre = new JTextField();
		tfNombre.setBounds(97, 25, 86, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);

		tfApellido = new JTextField();
		tfApellido.setBounds(97, 58, 86, 20);
		contentPane.add(tfApellido);
		tfApellido.setColumns(10);

		tfEdad = new JTextField();
		tfEdad.setBounds(97, 96, 86, 20);
		contentPane.add(tfEdad);
		tfEdad.setColumns(10);

		tfTelefono = new JTextField();
		tfTelefono.setBounds(97, 136, 86, 20);
		contentPane.add(tfTelefono);
		tfTelefono.setColumns(10);

		lblMouse.setBounds(43, 237, 46, 14);
		contentPane.add(lblMouse);
	}

	public JLabel getLblTelefono() {
		return lblTelefono;
	}
	public JLabel getLblApellido() {
		return lblApellido;
	}
	public JLabel getLblEdad() {
		return lblEdad;
	}
	public JLabel getLblNombre() {
		return lblNombre;
	}
}
