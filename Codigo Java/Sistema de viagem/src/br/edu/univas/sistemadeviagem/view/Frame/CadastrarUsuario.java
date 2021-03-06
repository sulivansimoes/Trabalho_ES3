package br.edu.univas.sistemadeviagem.view.Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.edu.univas.sistemadeviagem.model.DAO.CadastrarUsuarioDAO;
import br.edu.univas.sistemadeviagem.model.Exception.CadastrarUsuarioExeption;
import br.edu.univas.sistemadeviagem.model.TO.CadastrarUsuarioTO;
import br.edu.univas.sistemadeviagem.view.Util.Frame;

public class CadastrarUsuario  extends JFrame{

	private static final long serialVersionUID = 1987604675648829199L;
	
	private JPanel contentPane = null;
	//Declara��es no corpo da classe
		JTextField textCod =  new JTextField();
		JTextField textUsuario = new JTextField();
		JTextField textCPF = new JTextField();
		JTextField textLogin = new JTextField();
		JPasswordField textSenha = new JPasswordField();
		JPasswordField textSenhaConfirma = new JPasswordField();
		JRadioButton admRadioButton = new JRadioButton();
		JRadioButton gerenciaRadioButton = new JRadioButton();
		JRadioButton usuarioRadioButton = new JRadioButton();
		JFormattedTextField JFormatTextFieldCpf =  new JFormattedTextField();
	//Fim declara��es
	
	public CadastrarUsuario(){		
		this.setSize(470, 305);
		this.setTitle("Cadastro de Usu�rio");
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
		centerPanel.setBackground(Color.LIGHT_GRAY);
		centerPanel.setPreferredSize(new Dimension(25, 0));
		contentPane.add(centerPanel, BorderLayout.CENTER); 
		
		JLabel codUsuario = new JLabel();
		codUsuario.setText("Codigo:");
		centerPanel.add(codUsuario);				
		
		textCod.setColumns(4);
		centerPanel.add(textCod);
		
		JButton f2 = new JButton();
		f2.setText("F2");
		f2.setPreferredSize(new Dimension(26, 20));
		centerPanel.add(f2);
		
		JLabel vazio = new JLabel();
		vazio.setText("                                                                         ");
		centerPanel.add(vazio);
		
		JLabel nomeUsuario = new JLabel();
		nomeUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		nomeUsuario.setText("Nome do Usu�rio:  ");
		centerPanel.add(nomeUsuario);
		
		textUsuario.setColumns(33);
		centerPanel.add(textUsuario);
		
		JLabel cpfUsuario = new JLabel();
		cpfUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		cpfUsuario.setText("     CPF:");
		centerPanel.add(cpfUsuario);
		
		JLabel loginUsuario = new JLabel();
		loginUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		loginUsuario.setText("                                                   Login:  ");
		centerPanel.add(loginUsuario);
		
		JFormatTextFieldCpf.setColumns(16);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
			mascaraCpf.setPlaceholderCharacter('_');
			mascaraCpf.install(JFormatTextFieldCpf);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		centerPanel.add(JFormatTextFieldCpf);;
		
		textLogin.setColumns(16);
		centerPanel.add(textLogin);
		
		JLabel senhaUsuario = new JLabel();
		senhaUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		senhaUsuario.setText("           Senha:  ");
		centerPanel.add(senhaUsuario);
		
		JLabel senhaConfirmaUsuario = new JLabel();
		senhaConfirmaUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		senhaConfirmaUsuario.setText("                                   Confirmar Senha:  ");
		centerPanel.add(senhaConfirmaUsuario);
		
		textSenha.setColumns(16);
		centerPanel.add(textSenha);
		
		textSenhaConfirma.setColumns(16);
		centerPanel.add(textSenhaConfirma);
		
		JLabel acessoUsuario = new JLabel();
		acessoUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		acessoUsuario.setText("                            Selecione o perfil de acesso:"
				+ "                                    ");
		acessoUsuario.setFont(new Font("Dialog", Font.CENTER_BASELINE, 14));
		centerPanel.add(acessoUsuario);
		
		admRadioButton.setText("Administrador");
		admRadioButton.setBackground(Color.lightGray);
		admRadioButton.setSelected(false);
	    
	    gerenciaRadioButton.setText("Ger�ncia");
	    gerenciaRadioButton.setBackground(Color.lightGray);
	    
	    usuarioRadioButton.setText("Usu�rio");
	    usuarioRadioButton.setBackground(Color.lightGray);
	    
	    ButtonGroup group = new ButtonGroup();
	    group.add(admRadioButton);
	    group.add(gerenciaRadioButton);
	    group.add(usuarioRadioButton);
	    
	    centerPanel.add(admRadioButton);
	    centerPanel.add(gerenciaRadioButton);
	    centerPanel.add(usuarioRadioButton);
		
		
	    JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.DARK_GRAY);
		westPanel.setPreferredSize(new Dimension(80,0));
		westPanel.setBorder(new EmptyBorder(50, 0, 0, 0));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton incluir = new JButton();
		incluir.setText("Incluir");
		incluir.setPreferredSize(new Dimension(70, 25));
		westPanel.add(incluir);
		
		JButton alterar = new JButton();
		alterar.setText("Alterar");
		alterar.setPreferredSize(new Dimension(70, 25));
	//	alterar.setBorder(new EmptyBorder(0, 0, 0, 0));
		westPanel.add(alterar);
		
		JButton excluir = new JButton();
		excluir.setText("Excluir");
		excluir.setPreferredSize(new Dimension(70, 25));
		excluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				excluirUsuario();
				
			}

			private void excluirUsuario() {
				// TODO implementar
				
				
				
				
				
				
			}
		});
		westPanel.add(excluir);
		
		JButton gravar = new JButton();
		gravar.setText("Gravar");
		gravar.setPreferredSize(new Dimension(70, 25));
		gravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gravarClicked();				
			}

			private void gravarClicked() {
				//Extraindo informa��es dos campos
				int codUsuario = Integer.valueOf(textCod.getText()); //Transformando String em Int
				String nome = textUsuario.getText();
				String cpf = JFormatTextFieldCpf.getText().replaceAll("\\D","");
				String senha = new String(textSenha.getPassword()) ; //Transformando password em String
				
				//Montando TO
				CadastrarUsuarioTO usuario = new CadastrarUsuarioTO(codUsuario, nome, cpf, senha);
				
				if(senhaCorreta()){
					//coloca aqui o insert do dao
					//Inserindo usuario no banco de dados - Sem uso de controller.
					CadastrarUsuarioDAO dao = new CadastrarUsuarioDAO();
					try {
						dao.insertNewCadastrarUsuario(usuario);
					} catch (CadastrarUsuarioExeption e) {
						e.printStackTrace();
					} //Enviando to para o banco de dados.
					
					JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso!");
				}else{
					JOptionPane.showMessageDialog(null, "Senha inv�lida.");
				}				
			}

			private boolean senhaCorreta() {
				String senha1 = new String(textSenha.getPassword()).trim();
				String senha2 = new String(textSenhaConfirma.getPassword()).trim();
				
				if(senha1.equals(senha2)){
					return true;
				}
				return false;
			}
		});
		westPanel.add(gravar);
		
		JButton cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setPreferredSize(new Dimension(70, 25));
		westPanel.add(cancelar);
	}	
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		CadastrarUsuario tela = new CadastrarUsuario();
		tela.setVisible(true);
	}
}
