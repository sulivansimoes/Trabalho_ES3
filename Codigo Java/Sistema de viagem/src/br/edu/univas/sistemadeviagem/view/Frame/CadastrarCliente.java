package br.edu.univas.sistemadeviagem.view.Frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.sistemadeviagem.view.Util.Frame;

public class CadastrarCliente extends JFrame {

	private static final long serialVersionUID = 4316509815382134911L;
	
	private JPanel contentPane = null;
	//Declarações no crpo da classe
		JTextField textCod = new JTextField();
		JTextField textnome = new JTextField();
		JTextField textRG = new JTextField();
		JTextField textCPF = new JTextField();
		JTextField textEndereco = new JTextField();		
	//Fim declarações
		
	public CadastrarCliente(){
		this.setSize(470, 305);
		this.setTitle("Cadastro de Cliente");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContentPane();
		addComponents();	
	}
	
	private void setContentPane(){
		contentPane = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		
		contentPane.setLayout(gridBagLayout);
		this.setContentPane(contentPane);
	}
	
	private void addComponents(){
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel codCliente = new JLabel();
		codCliente.setText("Codigo: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill =  GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPane.add(codCliente, gbc);
		
		JTextField textCod = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPane.add(textCod, gbc);
		
		JLabel nomeCliente = new JLabel();
		nomeCliente.setText("Nome do Cliente: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill =  GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPane.add(nomeCliente, gbc);
		
		JTextField textNome = new JTextField();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPane.add(textNome, gbc);
		
		JLabel cpfUsuario = new JLabel();
		cpfUsuario.setText("CPF:");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPane.add(cpfUsuario, gbc);
		
		JTextField textCPF = new JTextField();
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(15, 0, 10, 15);
		contentPane.add(textCPF, gbc);
		
		
		
	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		CadastrarCliente tela = new CadastrarCliente();
		tela.setVisible(true);
	}
}
