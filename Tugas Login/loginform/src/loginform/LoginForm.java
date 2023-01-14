package loginform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginForm extends JFrame {
	private Image img_logo = new ImageIcon(LoginForm.class.getResource("/res/logo.png")).getImage().getScaledInstance(100, 60, Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JPanel panel_2;
	private JLabel lblPesan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 3));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(76, 78, 150, 25);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textUsername = new JTextField();
		textUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textUsername.getText().equals("Username")) {
					textUsername.setText("");
				}
				else {
					textUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textUsername.getText().equals("")) {
					textUsername.setText("Username");
				}
			}
				
		});
		textUsername.setBorder(null);
		textUsername.setText("Username");
		textUsername.setBounds(3, 5, 130, 15);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(76, 113, 150, 25);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textPassword = new JPasswordField();
		textPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textPassword.getText().equals("Password")) {
				textPassword.setEchoChar('●');
				textPassword.setText("");
				}
				else {
					textPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textPassword.getText().equals("")) {
					textPassword.setText("Password");
					textPassword.setEchoChar((char)0);
				}
			}
		});
		textPassword.setBorder(null);
		textPassword.setEchoChar((char)0);
		textPassword.setText("Password");
		textPassword.setBounds(3, 5, 130, 15);
		panel_1.add(textPassword);
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textUsername.getText().equals("admin")&& textPassword.getText().equals("ardian")) {
					lblPesan.setText("");
					JOptionPane.showMessageDialog(null, "Berhasil Login");
				}
				
				else if(textUsername.getText().equals("")||textUsername.getText().equals("Username")||
						textPassword.getText().equals("")||textPassword.getText().equals("Password")) {
					lblPesan.setText("Mohon masukkan username dan password");
				}
				
				else {
					lblPesan.setText("Username dan Password tidak sesuai");
				}
			}
		});
		panel_2.setBackground(new Color(128, 0, 0));
		panel_2.setBounds(126, 164, 48, 25);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel textLogin = new JLabel("LOG IN");
		textLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		textLogin.setBackground(new Color(0, 0, 0));
		textLogin.setForeground(Color.WHITE);
		textLogin.setBounds(5, 5, 46, 14);
		panel_2.add(textLogin);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(100, 5, 100, 62);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(img_logo));
		
		lblPesan = new JLabel("");
		lblPesan.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesan.setFont(new Font("Arial", Font.ITALIC, 11));
		lblPesan.setForeground(new Color(255, 0, 0));
		lblPesan.setBounds(33, 144, 234, 14);
		contentPane.add(lblPesan);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
