package br.edu.univas.sistemadeviagem.view.Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.univas.sistemadeviagem.view.Util.Frame;

public class Login extends JFrame {

	private static final long serialVersionUID = -1119763791714278423L;
	
	private JPanel contentPane = null;
	
	public Login(){
			
		this.setSize(300,250);
		this.setTitle("Logar no Sistema");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setResizable(false);
		addComponents();
	}
	
	private void addComponents(){
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(25, 0));
		centerPanel.setBorder(new EmptyBorder(30, 0, 0, 0));
		centerPanel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(centerPanel, BorderLayout.CENTER);
				
		JLabel usuario = new JLabel();
		usuario.setText("Usuário:");
		usuario.setFont(new Font("Arial", Font.BOLD, 17));
		usuario.setForeground(Color.GRAY);
		centerPanel.add(usuario);
		
		JTextField textUsuario = new JTextField();
		textUsuario.setColumns(15);
		centerPanel.add(textUsuario);		
		
		JLabel senha = new JLabel();
		senha.setText("  Senha:");
		senha.setBorder(new EmptyBorder(30, 0, 30, 0));
		senha.setFont(new Font("Arial", Font.BOLD, 17));
		senha.setForeground(Color.GRAY);
		centerPanel.add(senha);
		
		JPasswordField textSenha = new JPasswordField();
		textSenha.setColumns(15);
		centerPanel.add(textSenha);
		
		JButton okButton = new JButton();
		okButton.setText("Login");
		okButton.setFont(new Font("Arial", Font.PLAIN, 15));
		okButton.setPreferredSize(new Dimension(90, 50));
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				okButton();				
			}
		});
		centerPanel.add(okButton);
		
		JButton cancelButton = new JButton();
		cancelButton.setText("Cancelar");
		cancelButton.setFont(new Font("Arial", Font.PLAIN, 15));
		cancelButton.setPreferredSize(new Dimension(90, 50));
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cancelButton();
				
			}
		});
		centerPanel.add(cancelButton);		
	}
	
	private void okButton() {
		JOptionPane.showMessageDialog(this, "Logado com sucesso!");	
		System.exit(0);
	}
	
	private void cancelButton(){
		System.exit(0);
	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		Login tela = new Login();
		tela.setVisible(true);
	}
}
